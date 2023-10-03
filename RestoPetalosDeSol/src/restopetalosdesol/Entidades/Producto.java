/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.Entidades;

/**
 *
 * @author RODRI
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int stock;
    private double precio;
    private boolean tipo;
    private boolean conAlcohol;
    private String tipoComida;
    private boolean pago;
    

    public Producto() {
    }

    public Producto(int idProducto, String nombre, String descripcion, int stock, double precio, boolean tipo, boolean conAlcohol, String tipoComida, boolean pago) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.tipo = tipo;
        this.conAlcohol = conAlcohol;
        this.tipoComida = tipoComida;
        this.pago = pago;
        
    }

    public Producto(String nombre, String descripcion, int stock, double precio, boolean tipo, boolean conAlcohol, String tipoComida, boolean pago) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.tipo = tipo;
        this.conAlcohol = conAlcohol;
        this.tipoComida = tipoComida;
        this.pago = pago;
        
    }

    public Producto(String nombre, String descripcion, int stock, double precio, boolean tipo, String tipoComida, boolean pago) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.tipo = tipo;
        this.tipoComida = tipoComida;
        this.pago = pago;
       
    }
    
    //Para agregar cualquier tipo de producto, sin boolean y sin tipo de comida.
    

    public Producto(String nombre, String descripcion, int stock, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.tipo = tipo;
        this.conAlcohol = conAlcohol;
    }

    
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isConAlcohol() {
        return conAlcohol;
    }

    public void setConAlcohol(boolean conAlcohol) {
        this.conAlcohol = conAlcohol;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

   

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio + ", tipo=" + tipo + ", conAlcohol=" + conAlcohol + ", tipoComida=" + tipoComida + ", pago=" + pago + '}';
    }
    
    
    
}
