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
public class Mesero {
  private int  idMesero;
  private String nombre;
  private String apellido;
  private int dni;
  private boolean estado;
  private String contrasenia;
  private String usuario;
  private ArrayList <Pedido> pedido;// Una vez mas, pensar si la arraylist es necesaria aqui.

    public Mesero() {
    }

    public Mesero(int idMesero, String nombre, String apellido, int dni, boolean estado, String contrasenia, String usuario, ArrayList <Pedido> pedido) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
        this.pedido = pedido;
    }

    public Mesero(String nombre, String apellido, int dni, boolean estado, String contrasenia, String usuario,ArrayList <Pedido> pedido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.estado = estado;
        this.contrasenia = contrasenia;
        this.usuario = usuario;
        this.pedido = pedido;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }

    

    @Override
    public String toString() {
        return "Mesero{" + "idMesero=" + idMesero + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", estado=" + estado + ", contrasenia=" + contrasenia + ", usuario=" + usuario + ", pedido=" + pedido + '}';
    }
  
  
}
