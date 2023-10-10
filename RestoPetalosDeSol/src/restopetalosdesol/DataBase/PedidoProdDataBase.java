/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restopetalosdesol.Entidades.Pedido;
import restopetalosdesol.Entidades.PedidoProd;
import restopetalosdesol.Entidades.Producto;

/**
 *
 * @author crist
 */
public class PedidoProdDataBase { 
    private Connection con=null;
    private PedidoDataBase pd=new PedidoDataBase();
    private ProductoDataBase pro=new ProductoDataBase();
    
    public PedidoProdDataBase(){
        con=Conexion.getConexion();
    }
    
    public void guardarPedido(PedidoProd pp){  
        String sql="insert into pedidoproducto(idPedido,idProducto,cantidad,subtotal,estado)"
                + "values(?,?,?,?,?)";
        try{
        PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, pp.getIdPedido().getIdpedido());
        ps.setInt(2,pp.getIdProducto().getIdProducto());
        ps.setInt(3, pp.getCantidad());
        ps.setDouble(4, pp.getSubtotal());
        ps.setBoolean(5, pp.isEstado());
        ps.executeUpdate();
        
        ResultSet rs=ps.getGeneratedKeys();
        if(rs.next()){
            pp.setIdPedidoProd(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Pedido Guardado");
        }
        ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido");
        }
    }
    
    public List<PedidoProd> obtenerLista(int id){
        List<PedidoProd> ppd = new ArrayList<PedidoProd>();
        String sql = "SELECT * "
                + "FROM `pedidoproducto` "
                + "WHERE pedidoproducto.idPedido=? AND estado=1";
        try {          
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
                PedidoProd ppdb=new PedidoProd();
                ppdb.setIdPedidoProd(rs.getInt("idPedido_Prod"));
                Pedido p= pd.buscarPedido(id);
                ppdb.setIdPedido(p);
                Producto produ=pro.buscarProducto(rs.getInt("idProducto"));
                ppdb.setIdProducto(produ);
                ppdb.setCantidad(rs.getInt("cantidad"));
                ppdb.setSubtotal(rs.getDouble("subtotal"));
                ppdb.setEstado(rs.getBoolean("estado"));
                ppd.add(ppdb);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
        }
        return ppd;
    }
    
    public void cancelarPedido(int id) {
        String sql = "UPDATE pedidoProducto SET estado = 0 WHERE idPedido_Prod = ? ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el pedido.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla PedidoProducto");
        }
    }
}
