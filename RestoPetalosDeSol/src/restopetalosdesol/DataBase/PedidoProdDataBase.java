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
import javax.swing.JOptionPane;
import restopetalosdesol.Entidades.PedidoProd;

/**
 *
 * @author crist
 */
public class PedidoProdDataBase { 
    private Connection con=null;
    
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
}
