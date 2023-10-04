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

    public PedidoProd() {
    }

    public PedidoProd(Pedido idPedido, Producto idProducto, int cantidad) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public PedidoProd(int idPedidoProd, Pedido idPedido, Producto idProducto, int cantidad) {
        this.idPedidoProd = idPedidoProd;
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
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

    @Override
    public String toString() {
        return "pedidoprod{" + "idPedidoProd=" + idPedidoProd + ", idPedido=" + idPedido + ", idProducto=" + idProducto + ", cantidad=" + cantidad + '}';
    }
  
  
}
