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

    public void agregarProductoEntrada(Producto p) {
        String sql = "INSERT INTO producto ( idProducto, nombreProducto, precio, stock, estado) "
                + "VALUES (?,?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getNombreProducto());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setBoolean(5, true);

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

    public void agregarProductoPostre(Producto p) {
        String sql = "INSERT INTO producto ( idProducto, nombreProducto, precio, stock, estado) "
                + "VALUES (?,?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getNombreProducto());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setBoolean(5, p.isEstado());

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

    public void agregarProductoBebidaSinAlcohol(Producto p) {
        String sql = "INSERT INTO producto ( idProducto, nombreProducto, precio, stock, estado) "
                + "VALUES (?,?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getNombreProducto());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setBoolean(5, p.isEstado());

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

    public void agregarProductoPrincipal(Producto p) {
        String sql = "INSERT INTO producto ( idProducto, nombreProducto, precio, stock, estado) "
                + "VALUES (?,?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getNombreProducto());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setBoolean(5, p.isEstado());

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

    public void agregarBebidaConAlcohol(Producto p) {
        String sql = "INSERT INTO producto ( idProducto, nombreProducto, precio, stock, estado) "
                + "VALUES (?,?,?,?,?);";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getIdProducto());
            ps.setString(2, p.getNombreProducto());
            ps.setDouble(3, p.getPrecio());
            ps.setInt(4, p.getStock());
            ps.setBoolean(5, p.isEstado());

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

    public void actualizararStock(Producto p) {
        String sql = "UPDATE producto SET stock = ? WHERE idProducto= ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getStock());
            ps.setInt(2, p.getIdProducto());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Stock actualizado");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla producto" + ex.getMessage());
        }
    }

    public List<Producto> listarPraductos() {
        String sql = "SELECT * FROM producto";
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
