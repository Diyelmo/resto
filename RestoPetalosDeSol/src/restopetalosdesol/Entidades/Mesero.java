/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restopetalosdesol.Entidades;

/**
 *
 * @author RODRI
 */
public class Mesero {
    private int idMesero;
    private String nombre;
    private int dni;
    private String nickName;
    private String clave;
    private boolean estado;

    public Mesero() {
    }

    public Mesero(int idMesero, String nombre, int dni, String nickName, String clave, boolean estado) {
        this.idMesero = idMesero;
        this.nombre = nombre;
        this.dni = dni;
        this.nickName = nickName;
        this.clave = clave;
        this.estado = estado;
    }

    public Mesero(String nombre, int dni, String nickName, String clave, boolean estado) {
        this.nombre = nombre;
        this.dni = dni;
        this.nickName = nickName;
        this.clave = clave;
        this.estado = estado;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesero{" + ", Nombre=" + nombre + ", DNI=" + dni + '}';
    }

  
   
    
    
}
