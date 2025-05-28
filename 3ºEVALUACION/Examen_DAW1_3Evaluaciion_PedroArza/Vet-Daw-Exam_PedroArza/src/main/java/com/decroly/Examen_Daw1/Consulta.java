
package com.decroly.Examen_Daw1;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Consulta implements Serializable {

    private int Duracion;
    private LocalDateTime Fecha;
    private String Observaciones;
    private String Mascota;

    public Consulta(int duracion, LocalDateTime fecha, String observaciones, String mascota) {
        Duracion = duracion;
        Fecha = fecha;
        Observaciones = observaciones;
        Mascota = mascota;
    }

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int duracion) {
        Duracion = duracion;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        Fecha = fecha;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public String getMascota() {
        return Mascota;
    }

    public void setMascota(String mascota) {
        Mascota = mascota;
    }

    @Override
    public String toString() {
        return "Consulta{" +
                "Duracion=" + Duracion +
                ", Fecha=" + Fecha +
                ", Observaciones='" + Observaciones + '\'' +
                ", Mascota='" + Mascota + '\'' +
                '}';
    }
}
