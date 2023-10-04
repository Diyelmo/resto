package restopetalosdesol.DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import restopetalosdesol.Entidades.Producto;

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

}
