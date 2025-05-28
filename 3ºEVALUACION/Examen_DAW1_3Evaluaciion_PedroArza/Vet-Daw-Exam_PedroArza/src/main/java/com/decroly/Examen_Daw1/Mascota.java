package com.decroly.Examen_Daw1;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Mascota implements Serializable {

    private String nombre;
    private String pasaporte;
    private LocalDateTime FechaNacimiento;
    private double peso;
    private String Tipo;
    private String Propietario;

    public Mascota(String nombre, String pasaporte, String fechaNacimiento, String peso, String tipo, String propietario) {
        this.nombre = nombre;
        this.pasaporte = pasaporte;
        FechaNacimiento = LocalDateTime.parse(fechaNacimiento);
        this.peso = Double.parseDouble(peso);
        Tipo = tipo;
        Propietario = propietario;
    }

    public static Mascota values() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public LocalDateTime getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = LocalDateTime.parse(fechaNacimiento);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = Double.parseDouble(peso);
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getPropietario() {
        return Propietario;
    }

    public void setPropietario(String propietario) {
        Propietario = propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", pasaporte='" + pasaporte + '\'' +
                ", FechaNacimiento='" + FechaNacimiento + '\'' +
                ", peso='" + peso + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Propietario='" + Propietario + '\'' +
                '}';
    }
}