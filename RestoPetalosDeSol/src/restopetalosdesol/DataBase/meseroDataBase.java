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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restopetalosdesol.Entidades.Mesero;
import restopetalosdesol.Entidades.Producto;

/**
 *
 * @author RODRI
 */
public class meseroDataBase {
     private Connection con = null;

    public meseroDataBase() {

        con = Conexion.getConexion();
    }
    
    
    public void crearMesero(Mesero m) {
        String sql = "INSERT INTO `mesero`( `nombre`, `dni`, `nickName`, `clave`, `estado`) "
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, m.getNombre());
            ps.setInt(2, m.getDni());
            ps.setString(3, m.getNickName());
            ps.setString(4, m.getClave());
            ps.setBoolean(5, m.isEstado());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                m.setIdMesero(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesero añadido con exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero  " + ex.getMessage());
        }
    }
    
    public void daDeBajaMesero(int idMesero) {
        String sql = "UPDATE mesero SET estado = 0 WHERE idMesero = ? ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " El mesero ya no se encuentra activo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero");
        }
}
 public Mesero buscarMesero(String nombre){
        String sql="select * from producto where nombre="+"&"+nombre+"%";
        Mesero p=null;
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                p=new Mesero();
                p.setIdMesero(rs.getInt("idMesero"));
                p.setNombre(rs.getString("nombre"));
                p.setDni(rs.getInt("dni"));
                p.setNickName(rs.getString("nickName"));
                 p.setClave(rs.getString("clave"));
                p.setEstado(rs.getBoolean("estado"));
                
            }else{
                JOptionPane.showMessageDialog(null, " El mesero solicitado no se encontro.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero "+e.getMessage());
        }
        return p;
    }

// public void modificarMesero(Mesero m, String nombre) {
//        String sql = "UPDATE `mesero` SET `nombre`="+m.getNombre()+",`dni`="+m.getDni()+",`nickName`="+m.getNickName()+",`clave`="+m.getClave()+",`estado`="+m.isEstado()+" WHERE nombre=? ";
//        try {           
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, nombre);
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, " Los cambios han sido realizados.");
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero");
//        }
//}
  
 
    public List<Mesero> listarMeseros() {
        String sql = "SELECT * FROM mesero";
        List<Mesero> meseros = new ArrayList<Mesero>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               Mesero m = new Mesero();
                m.setIdMesero(rs.getInt("idMesero"));
                m.setNombre(rs.getString("nombre"));
                m.setDni(rs.getInt("dni"));
                m.setNickName(rs.getString("nickName"));
                m.setEstado(rs.getBoolean("estado"));
                
                meseros.add(m);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla meseros" + ex.getMessage());
        }
        return meseros;

    }
  public Mesero ingresoMesero(String n, String c){
        String sql="SELECT  `nickName`, `clave`, `estado` FROM `mesero` WHERE 1";
        Mesero m=new Mesero();
         PreparedStatement ps;
         try {
             ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             if(rs.next()){
                 
                 m.setNickName(rs.getString("nickName"));
                 m.setClave(rs.getString("clave"));
             }else {JOptionPane.showMessageDialog(null, "Datos incorrectos", "Error", JOptionPane.ERROR_MESSAGE );
             
             }
         } catch (SQLException ex) {
             Logger.getLogger(meseroDataBase.class.getName()).log(Level.SEVERE, null, ex);
         }
           return m;
            
    }
  public void modificarMesero(Mesero p, String s) {
        String sql="UPDATE `mesero` SET `nombre`=?,`dni`=?,`nickName`=?,"
                + "`clave`=?,`estado`=? WHERE nombre=?";
            try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setDouble(2, p.getDni());
            ps.setString(3,p.getNickName());
            ps.setString(4,p.getClave());
            ps.setBoolean(5, p.isEstado());
            ps.setString(6,s);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                //JOptionPane.shMessageDialog(null, "Stock actualizado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
           
    }
   public void darBajaMesero(int id) {
        String sql = "UPDATE mesero SET estado = 0 WHERE idMesero = ? and estado=1 ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Mesero inactivo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero");
        }
    }
   
    public void darAltaMesero(int id) {
        String sql = "UPDATE mesero SET estado = 1 WHERE idMesero = ? and estado=0 ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Mesero activo.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero");
        }
    }
   
      public List<Mesero> listarMeserosActivos() {
        String sql = "SELECT * FROM mesero where estado=1";
        List<Mesero> meseros = new ArrayList<Mesero>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               Mesero m = new Mesero();
                m.setIdMesero(rs.getInt("idMesero"));
                m.setNombre(rs.getString("nombre"));
                m.setDni(rs.getInt("dni"));
                m.setNickName(rs.getString("nickName"));
                m.setEstado(rs.getBoolean("estado"));
                
                meseros.add(m);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla meseros" + ex.getMessage());
        }
        return meseros;

    }
      
       public List<Mesero> listarMeserosInactivos() {
        String sql = "SELECT * FROM mesero where estado=0";
        List<Mesero> meseros = new ArrayList<Mesero>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
               Mesero m = new Mesero();
                m.setIdMesero(rs.getInt("idMesero"));
                m.setNombre(rs.getString("nombre"));
                m.setDni(rs.getInt("dni"));
                m.setNickName(rs.getString("nickName"));
                m.setEstado(rs.getBoolean("estado"));
                
                meseros.add(m);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla meseros" + ex.getMessage());
        }
        return meseros;

    }
}
