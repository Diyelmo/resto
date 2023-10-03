/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.Entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.sql.Time;


/**
 *
 * @author RODRI
 */
public class Reserva {
    private int idReserva;
    private String nombre;
    private String apellido;
    private int dni;
    private LocalDate fecha;
    private  Time  hora;
    public int mesa;
    private boolean estado;

    public Reserva() {
    }

    public Reserva(int idReserva, String nombre,String apellido, int dni, LocalDate fecha,  Time  hora,int mesa, boolean estado) {
        this.idReserva = idReserva;
        this.nombre = nombre;
        this.apellido=apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.mesa=mesa;
    }

    public Reserva(String nombre,String apellido, int dni, LocalDate fecha,  Time  hora,int mesa, boolean estado) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.mesa=mesa;
        this.estado = estado;
    }
//Para hacer reservas
    public Reserva(String nombre, String apellido, int dni, LocalDate fecha,  Time  hora, int mesa) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }
    

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

   

    public boolean isEstado() {
        return estado;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa (int mesa) {
        this.mesa = mesa;
    }

   
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", fecha=" + fecha + ", hora=" + hora + ", mesa=" + mesa + ", estado=" + estado + '}';
    }

  
    
    
}
