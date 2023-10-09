/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.Entidades;

import java.util.ArrayList;

/**
 *
 * @author RODRI
 */
public class PedidoProd {
  private int idPedidoProd;
    private Pedido idPedido;
    private Producto idProducto;
    private int cantidad;
    private double subtotal;
    private boolean estado;

    public PedidoProd() {
    }

    public PedidoProd(Pedido idPedido, Producto idProducto, int cantidad, double subtotal, boolean estado) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.estado = estado;
    }

    public PedidoProd(int idPedidoProd, Pedido idPedido, Producto idProducto, int cantidad, double subtotal, boolean estado) {
        this.idPedidoProd = idPedidoProd;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
        this.estado = estado;
    }

    public int getIdPedidoProd() {
        return idPedidoProd;
    }

    public void setIdPedidoProd(int idPedidoProd) {
        this.idPedidoProd = idPedidoProd;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "pedidoprod{" + "idPedidoProd=" + idPedidoProd + ", idPedido=" + idPedido + ", idProducto=" + idProducto + ", cantidad=" + cantidad + '}';
    }
  
  
}
