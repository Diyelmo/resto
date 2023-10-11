/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.DataBase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restopetalosdesol.Entidades.Mesa;
import restopetalosdesol.Entidades.Pedido;

/**
 *
 * @author RODRI
 */
public class PedidoDataBase {
    private Connection con=null;
    private MesaDataBase md=new MesaDataBase();
    
    public PedidoDataBase(){
        con=Conexion.getConexion();
    }
    
    public Pedido buscarPedido(int id){
        String sql="select * from pedido where idPedido=? ";
        Pedido p=null;
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                p=new Pedido();
                p.setIdpedido(rs.getInt("idPedido"));
                Mesa m= md.buscarMesa(rs.getInt("idMesa"));
                p.setIdmesa(m);
                p.setNombre(rs.getString("nombre_mesero"));
                p.setFecha(rs.getDate("fecha").toLocalDate());
                p.setHora(rs.getTime("hora").toLocalTime());
                p.setImporte(rs.getDouble("importe"));
                p.setCobrada(rs.getBoolean("cobrada"));
                
            }else{
                JOptionPane.showMessageDialog(null, " No existe ese Producto.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        return p;
    }
    
    public void guardarPedido(Pedido pe){  
        String sql="insert into pedido(idMesa,nombre_mesero,fecha,hora,importe,cobrada)"
                + "values(?,?,?,?,?,?)";
        try{
        PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, pe.getIdmesa().getIdMesa());
        ps.setString(2,pe.getNombre());
        ps.setDate(3, Date.valueOf(pe.getFecha()));
        ps.setTime(4, Time.valueOf(pe.getHora()));
        ps.setDouble(5, pe.getImporte());
        ps.setBoolean(6, pe.isCobrada());
        ps.executeUpdate();
        
        ResultSet rs=ps.getGeneratedKeys();
        if(rs.next()){
            pe.setIdpedido(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Pedido Guardado");
        }
        ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido");
        }
    }
    
    public void ObtenerImporte(int id,double im) {
        String sql = "UPDATE pedido SET importe = ? WHERE idPedido = ? ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, im);
            ps.setInt(2, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se obtuvo el importe.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pedido");
        }
    }
    
    public List<Pedido> listarPedido(){
        String sql="select * from pedido ";
        ArrayList<Pedido> p=new ArrayList<>();
        try {           
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Pedido pe=new Pedido();
                pe.setIdpedido(rs.getInt("idPedido"));
                Mesa m= md.buscarMesa(rs.getInt("idMesa"));
                pe.setIdmesa(m);
                pe.setNombre(rs.getString("nombre_mesero"));
                pe.setFecha(rs.getDate("fecha").toLocalDate());
                pe.setHora(rs.getTime("hora").toLocalTime());
                pe.setImporte(rs.getDouble("importe"));
                pe.setCobrada(rs.getBoolean("cobrada"));
                p.add(pe);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido "+e.getMessage());
        }
        return p;
    }
    
    public Pedido buscarPedidoPorNombre(String nom){
        String sql="select * from pedido where nombre_mesero LIKE '%"+nom+"%' ";
        Pedido p=null;
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                p=new Pedido();
                p.setIdpedido(rs.getInt("idPedido"));
                Mesa m= md.buscarMesa(rs.getInt("idMesa"));
                p.setIdmesa(m);
                p.setNombre(rs.getString("nombre_mesero"));
                p.setFecha(rs.getDate("fecha").toLocalDate());
                p.setHora(rs.getTime("hora").toLocalTime());
                p.setImporte(rs.getDouble("importe"));
                p.setCobrada(rs.getBoolean("cobrada"));
                
            }else{
                JOptionPane.showMessageDialog(null, " No existe ese Producto.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
        return p;
    }
    
    public List<Pedido> listarXMesero(String x){
        String sql="select * from pedido where nombre_mesero LIKE '%"+x+"%' ";
        ArrayList<Pedido> p=new ArrayList<>();
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Pedido pe=new Pedido();
                pe.setIdpedido(rs.getInt("idPedido"));
                Mesa m= md.buscarMesa(rs.getInt("idMesa"));
                pe.setIdmesa(m);
                pe.setNombre(rs.getString("nombre_mesero"));
                pe.setFecha(rs.getDate("fecha").toLocalDate());
                pe.setHora(rs.getTime("hora").toLocalTime());
                pe.setImporte(rs.getDouble("importe"));
                pe.setCobrada(rs.getBoolean("cobrada"));
                p.add(pe);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido "+e.getMessage());
        }
        return p;
    }
    
    public List<Pedido> listarXDia(String x){
        String sql="select * from pedido where nombre_mesero LIKE '%"+x+"%' AND cobrada=1";
        ArrayList<Pedido> p=new ArrayList<>();
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Pedido pe=new Pedido();
                pe.setIdpedido(rs.getInt("idPedido"));
                Mesa m= md.buscarMesa(rs.getInt("idMesa"));
                pe.setIdmesa(m);
                pe.setNombre(rs.getString("nombre_mesero"));
                pe.setFecha(rs.getDate("fecha").toLocalDate());
                pe.setHora(rs.getTime("hora").toLocalTime());
                pe.setImporte(rs.getDouble("importe"));
                pe.setCobrada(rs.getBoolean("cobrada"));
                p.add(pe);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Pedido "+e.getMessage());
        }
        return p;
    }
    
    public void CobrarPedido(int id) {
        String sql = "UPDATE pedido SET cobrada = 1 WHERE idPedido = ? ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Cobrado");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla pedido");
        }
    }
}
