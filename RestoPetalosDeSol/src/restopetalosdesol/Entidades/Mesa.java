/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.Entidades;

/**
 *
 * @author RODRI
 */
public class Mesa {
    
    private int idMesa;
    private int numero;
    private boolean estado;
    private int capacidad;
    

    public Mesa() {
    }

    public Mesa(int numero, boolean estado, int capacidad) {
        this.numero = numero;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public Mesa(int idMesa, int numero, boolean estado, int capacidad) {
        this.idMesa = idMesa;
        this.numero = numero;
        this.estado = estado;
        this.capacidad = capacidad;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Nr Mesa: " + numero ;
    }          
}
