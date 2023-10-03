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
import restopetalosdesol.Entidades.Producto;

/**
 *
 * @author RODRI
 */
public class ProductoDataBase {
    private Connection con = null;

    public ProductoDataBase() {
        
         con = Conexion.getConexion();
    }
    
    public void agregarProductoEntrada(Producto p) {
  String sql=  "INSERT INTO producto ( nombre, descripcion, precio, stock, tipo, TipoComida, pago) VALUES ( ?, ?, ?, ?, 0, 'Entrada', 0);";
    try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4,p.getStock());
           
            
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                p.setIdProducto(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto  " + ex.getMessage());
            
        }
    }

     public void agregarProductoPostre(Producto p) {
  String sql=  "INSERT INTO producto ( nombre, descripcion, precio, stock, tipo, TipoComida, pago) VALUES ( ?, ?, ?, ?, 0, 'Postre', 0);";
    try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4,p.getStock());
            
            
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                p.setIdProducto(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto  " + ex.getMessage());
            
        }
    }
     
      public void agregarProductoBebidaSinAlcohol(Producto p) {
  String sql=  "INSERT INTO `producto` ( `nombre`, `descripcion`, `precio`, `stock`, `tipo`, `conAlcohol`,  `pago`) VALUES (  ?, ?, ?, ?, 1, 0, 0)";
    try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4,p.getStock());
            ps.setBoolean(5,p.isTipo());
            
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                p.setIdProducto(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto  " + ex.getMessage());
            
        }
    }
    
     public void agregarProductoPrincipal(Producto p) {
  String sql=  "INSERT INTO producto ( nombre, descripcion, precio, stock, tipo, TipoComida, pago) VALUES ( ?, ?, ?, ?, 0, 'Principal', 0);";
    try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4,p.getStock());
           
            
            
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                p.setIdProducto(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto  " + ex.getMessage());
            
        }
    }
    
    
      public void agregarBebidaConAlcohol(Producto p) {
  String sql=  "INSERT INTO `producto` ( `nombre`, `descripcion`, `precio`, `stock`, `tipo`, `conAlcohol`,  `pago`) VALUES (  ?, ?, ?, ?, 1, 1, 0)";


    try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4,p.getStock());
          
       
           
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                p.setIdProducto(rs.getInt(1));
            JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto  " + ex.getMessage());
            
        }
}
    
}
