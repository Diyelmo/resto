/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.Entidades;

import java.time.LocalDateTime;

/**
 *
 * @author RODRI
 */
public class Pedido {
    private int idpedido;
    private Mesa idmesa;
    private String nombre;
    private LocalDateTime fecha_hora;
    private double importe;
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(Mesa idmesa, String nombre, LocalDateTime fecha_hora, double importe, boolean cobrada) {
        this.idmesa = idmesa;
        this.nombre = nombre;
        this.fecha_hora = fecha_hora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public Pedido(int idpedido, Mesa idmesa, String nombre, LocalDateTime fecha_hora, double importe, boolean cobrada) {
        this.idpedido = idpedido;
        this.idmesa = idmesa;
        this.nombre = nombre;
        this.fecha_hora = fecha_hora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public int getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(int idpedido) {
        this.idpedido = idpedido;
    }

    public Mesa getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Mesa idmesa) {
        this.idmesa = idmesa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(LocalDateTime fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public boolean isCobrada() {
        return cobrada;
    }

    public void setCobrada(boolean cobrada) {
        this.cobrada = cobrada;
    }

    @Override
    public String toString() {
        return "pedido{" + "idpedido=" + idpedido + ", idmesa=" + idmesa + ", nombre=" + nombre + ", fecha_hora=" + fecha_hora + ", importe=" + importe + ", cobrada=" + cobrada + '}';
    }
    
    

}
