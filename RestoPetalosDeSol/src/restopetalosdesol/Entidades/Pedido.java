/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author RODRI
 */
public class Pedido {
    private int idpedido;
    private Mesa idmesa;
    private String nombre;
    private LocalDate fecha;
    private LocalTime hora;
    private double importe;
    private boolean cobrada;

    public Pedido() {
    }

    public Pedido(Mesa idmesa, String nombre, LocalDate fecha,LocalTime hora, double importe, boolean cobrada) {
        this.idmesa = idmesa;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
        this.cobrada = cobrada;
    }

    public Pedido(int idpedido, Mesa idmesa, String nombre, LocalDate fecha,LocalTime hora, double importe, boolean cobrada) {
        this.idpedido = idpedido;
        this.idmesa = idmesa;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Pedido Nr: "+getIdpedido()+"  / Mesa Nr: "+getIdmesa()+"  / Mesero: "+getNombre()+"  / Pedido realizado el: "+getFecha()+"  / a la hora: "+getHora();
    }    

}
