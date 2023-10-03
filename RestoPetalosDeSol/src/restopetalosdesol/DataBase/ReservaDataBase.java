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
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import restopetalosdesol.Entidades.Mesa;
import restopetalosdesol.Entidades.Reserva;
import java.time.LocalTime;

/**
 *
 * @author RODRI
 */
public class ReservaDataBase {
      private Connection con = null;

    public ReservaDataBase() {
        
         con = Conexion.getConexion();
    }
    
    public void reservar(Reserva r){
      String sql= "INSERT INTO `reserva` ( `idMesa`, `nombre`, `apellido`, `dni`, `fecha`, `hora`, `estado`) VALUES ( ?, ?, ?, ?, ?, ?, '1');" ; 
    
       try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1,r.getMesa());
            ps.setString(2,r.getNombre() );
            ps.setString(3, r.getApellido());
            ps.setInt(4,r.getDni());
            ps.setString(5,String.valueOf(r.getFecha()));
            ps.setTime(6, r.getHora() );
           
            
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                r.setIdReserva(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Reserva añadido con exito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la reserva " + ex.getMessage());
            
        }
    
    }
    
       public ArrayList <Reserva> listarReservasActivas(){
      String sql= "SELECT * FROM `reserva` ;" ; 
     
     
      ArrayList <Reserva> listaReserva=new ArrayList();
       try{
            PreparedStatement ps = con.prepareStatement(sql);
            
          ResultSet rs= ps.executeQuery();
           
               
           
        while (rs.next()) {
                 Reserva r=new Reserva();
              
                r.setApellido(rs.getString("apellido"));
                r.setDni(rs.getInt("dni"));
                r.setFecha(rs.getDate("fecha").toLocalDate());
                r.setHora(rs.getTime("hora"));
                r.setIdReserva(rs.getInt("idReserva"));
                r.setMesa(rs.getInt("idMesa"));
               
                r.setNombre(rs.getString("nombre"));
                r.setEstado(rs.getBoolean("estado"));
          
            listaReserva.add(r);
           
            
           
            
           }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la reserva " + ex.getMessage());
            
        }
    return listaReserva;
    }
         public ArrayList <Reserva> listarReservasInactivas(){
      String sql= "SELECT * FROM `reserva` where estado=1 ;" ; 
     
     
      ArrayList <Reserva> listaReservaInactivas=new ArrayList();
       try{
            PreparedStatement ps = con.prepareStatement(sql);
            
          ResultSet rs= ps.executeQuery();
           
               
           
        while (rs.next()) {
                 Reserva r=new Reserva();
              
                r.setApellido(rs.getString("apellido"));
                r.setDni(rs.getInt("dni"));
                r.setFecha(rs.getDate("fecha").toLocalDate());
                r.setHora(rs.getTime("hora"));
                r.setIdReserva(rs.getInt("idReserva"));
                r.setMesa(rs.getInt("idMesa"));
               
                r.setNombre(rs.getString("nombre"));
                r.setEstado(rs.getBoolean("estado"));
          
            listaReservaInactivas.add(r);
           
            
           
            
           }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear la lista de reservas inactivas " + ex.getMessage());
            
        }
    return listaReservaInactivas;
    }
}
