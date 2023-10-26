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

 public void modificarMesero(Mesero m, int idMesero) {
        String sql = "UPDATE `mesero` SET `nombre`="+m.getNombre()+",`dni`="+m.getDni()+",`nickName`="+m.getNickName()+",`clave`="+m.getClave()+",`estado`="+m.isEstado()+" WHERE estado=1 ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMesero);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Los cambios han sido realizados.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Mesero");
        }
}
  
 
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
 
}
