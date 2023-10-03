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
public class Mesa {
    private int idMesa;
    private Mesero mesero;
    private ArrayList <Reserva> reserva; //Fijarse si es necesario esta arraylist o directamente en un metodo en DataBase
    private int cantidad;
    private boolean ocupada;
    private boolean atendida;
    public Mesa() {
    }

    public Mesa(int idMesa, Mesero mesero, ArrayList<Reserva> reserva, int cantidad, boolean ocupada, boolean atendida) {
        this.idMesa = idMesa;
        this.mesero = mesero;
        this.reserva = reserva;
        this.cantidad = cantidad;
        this.ocupada = ocupada;
        this.atendida = atendida;
    }

    public Mesa(Mesero mesero, ArrayList<Reserva> reserva, int cantidad, boolean ocupada, boolean atendida) {
        this.mesero = mesero;
        this.reserva = reserva;
        this.cantidad = cantidad;
        this.ocupada = ocupada;
        this.atendida = atendida;
    }

    public Mesa(int idMesa) {
        this.idMesa = idMesa;
    }
    

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public boolean isAtendida() {
        return atendida;
    }

    public void setAtendida(boolean atendida) {
        this.atendida = atendida;
    }

    public ArrayList<Reserva> getReserva() {
        return reserva;
    }

    public void setReserva(ArrayList<Reserva> reserva) {
        this.reserva = reserva;
    }

    

    

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", cantidad=" + cantidad + ", ocupada=" + ocupada + ", atendida=" + atendida + ", reserva=" + reserva + '}';
    }
    
    
    
}
