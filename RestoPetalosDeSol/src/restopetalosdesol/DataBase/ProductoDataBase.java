package restopetalosdesol.DataBase;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restopetalosdesol.Entidades.Producto;
import restopetalosdesol.Entidades.PedidoProd;
import restopetalosdesol.Entidades.Pedido;

public class ProductoDataBase {

    private Connection con = null;

    public ProductoDataBase() {

        con = Conexion.getConexion();
    }

    public void agregarProducto(Producto p) {
        String sql = "INSERT INTO producto ( nombreProducto, precio, stock, estado) "
                + "VALUES (?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, p.getNombreProducto());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3, p.getStock());
            ps.setBoolean(4, true);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                p.setIdProducto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto  " + ex.getMessage());
        }
    }

    public Producto buscarProducto(int id){
        String sql="select * from producto where idProducto=? ";
        Producto p=null;
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                p=new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(rs.getBoolean("estado"));
                
            }else{
                JOptionPane.showMessageDialog(null, " No existe ese Producto.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto "+e.getMessage());
        }
        return p;
    }
    public Producto buscarProducto(String nombre){
        String sql="select * from producto where nombreProducto=? ";
        Producto p=null;
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                
                p=new Producto();
                p.setIdProducto(rs.getInt("idProducto"));
                p.setNombreProducto(rs.getString("nombreProducto"));
                p.setPrecio(rs.getDouble("precio"));
                p.setStock(rs.getInt("stock"));
                p.setEstado(rs.getBoolean("estado"));
                
            }else{
                JOptionPane.showMessageDialog(null, " No existe ese Producto.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto "+e.getMessage());
        }
        return p;
    }
    
    public void eliminarProducto(int id) {
        String sql = "UPDATE producto SET estado = 0 WHERE idProducto = ? ";
        try {           
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el producto.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Producto");
        }
    }
    public void modificarProducto(Producto p, String s) {
        String sql="UPDATE `producto` SET `nombreProducto`=?,"
                    + "`precio`=?,`stock`=?,`estado`=? where nombreProducto=?";
            try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombreProducto());
            ps.setDouble(2, p.getPrecio());
            ps.setInt(3,p.getStock());
            ps.setBoolean(4, p.isEstado());
            ps.setString(5,s);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                //JOptionPane.shMessageDialog(null, "Stock actualizado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
           
    }

    public void actualizararStock(int s ,int p) {
        String sql = "UPDATE producto SET stock = ? WHERE idProducto= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s);
            ps.setInt(2, p);
            int exito = ps.executeUpdate();

            if (exito == 1) {
                //JOptionPane.showMessageDialog(null, "Stock actualizado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
    }

    public List<Producto> listarProductos() {
        String sql = "SELECT * FROM producto where estado=1 ";
        List<Producto> productos = new ArrayList<Producto>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
                
                productos.add(prod);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
        return productos;

    }
    public List<Producto> listarProductos2() {
        String sql = "SELECT * FROM producto  ";
        List<Producto> productos = new ArrayList<Producto>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombreProducto(rs.getString("nombreProducto"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(true);
                
                productos.add(prod);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
        return productos;

    }
}
