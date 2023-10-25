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
import restopetalosdesol.Entidades.Mesa;

/**
 *
 * @author RODRI
 */
public class MesaDataBase {
    private Connection con=null;
    
    public MesaDataBase(){
        con=Conexion.getConexion();
    }
    
    public Mesa buscarMesa(int numero){
        String sql="select * from mesa where numero=? ";
        Mesa m=null;
        try { 
            
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, numero);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                m=new Mesa();
                m.setIdMesa(rs.getInt("idMesa"));
                m.setNumero(numero);
                m.setEstado(rs.getBoolean("estado"));
                m.setCapacidad(rs.getInt("capacidad"));
                
            }else{
                //JOptionPane.showMessageDialog(null, " No existe esa mesa.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa");
        }
        return m;
    }
    
    public List<Mesa> listarMesas(){
        String sql="select * from mesa ";
        ArrayList<Mesa> m=new ArrayList<>();
        try {           
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Mesa me=new Mesa();
                me.setIdMesa(rs.getInt("idMesa"));
                me.setNumero(rs.getInt("numero"));
                me.setEstado(rs.getBoolean("estado"));
                me.setCapacidad(rs.getInt("capacidad"));
                m.add(me);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa "+e.getMessage());
        }
        return m;
    }
    
    public List<Mesa> listarMesasLibres(){
        String sql="select * from mesa where estado=0";
        ArrayList<Mesa> m=new ArrayList<>();
        try {           
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                Mesa me=new Mesa();
                me.setIdMesa(rs.getInt("idMesa"));
                me.setNumero(rs.getInt("numero"));
                me.setEstado(rs.getBoolean("estado"));
                me.setCapacidad(rs.getInt("capacidad"));
                m.add(me);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa "+e.getMessage());
        }
        return m;
    }
    
    public void OcuparMesa(int numero){ 
        String sql="update mesa set estado=1 "
                + "where numero=? ";
        try{
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setDouble(1, numero);
        int exito= ps.executeUpdate();        
        if(exito==1){
            //JOptionPane.showMessageDialog(null, "mesa ocupada");
        }        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa");
        }
    }
    public void LiberarMesa(int numero){ 
        String sql="update mesa set estado=0 "
                + "where numero=? ";
        try{
        PreparedStatement ps=con.prepareStatement(sql);
        ps.setDouble(1, numero);
        int exito= ps.executeUpdate();        
        if(exito==1){
            //JOptionPane.showMessageDialog(null, "mesa desocupada");
        }        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa");
        }
    }
    
    public void guardarMesa(Mesa m){  
        String sql="insert into mesa(numero,estado,capacidad) "
                + "values(?,?,?)";
        try{
        PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
        ps.setInt(1, m.getNumero());
        ps.setBoolean(2,m.isEstado());
        ps.setInt(3, m.getCapacidad());
        ps.executeUpdate();
        
        ResultSet rs=ps.getGeneratedKeys();
        if(rs.next()){
            m.setIdMesa(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Mesa Guardada");
        }
        ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesa");
        }
    }
    public Mesa buscarIDMesa(int id){
        String sql="select * from mesa where idMesa=? ";
        Mesa m=null;
        try { 
            
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                m=new Mesa();
                m.setIdMesa(id);
                m.setNumero(rs.getInt("numero"));
                m.setEstado(rs.getBoolean("estado"));
                m.setCapacidad(rs.getInt("capacidad"));
                
            }else{
                //JOptionPane.showMessageDialog(null, " No existe esa mesa.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesa");
        }
        return m;
    }
}
