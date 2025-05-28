package com.decroly.Examen_Daw1;

import java.io.Serializable;

public class Propietario implements Serializable {

    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private String telefono;
    private String DNI;

    public Propietario(String nombre, String apellido, String telefono, Object o) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Propietario(String DNI, String telefono, String direccion, String email, String apellido, String nombre, int id) {
        this.DNI = DNI;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }


    public void setMascota(Mascota nuevoMascota) {

    }
}





