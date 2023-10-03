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
public class Pedido {
    private int idPedido;
    private ArrayList <Producto> idProducto;// Mismo comentario que en las otras arraylist en las clases entidades
    private int idMesero;
    private int idMesa;

    public Pedido() {
    }

    public Pedido(int idPedido, ArrayList <Producto> idProducto, int idMesero, int idMesa) {
        this.idPedido = idPedido;
        this.idProducto = idProducto;
        this.idMesero = idMesero;
        this.idMesa = idMesa;
    }

    public Pedido(ArrayList <Producto> idProducto, int idMesero, int idMesa) {
        this.idProducto = idProducto;
        this.idMesero = idMesero;
        this.idMesa = idMesa;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", idProducto=" + idProducto + ", idMesero=" + idMesero + ", idMesa=" + idMesa + '}';
    }
    
    

}
