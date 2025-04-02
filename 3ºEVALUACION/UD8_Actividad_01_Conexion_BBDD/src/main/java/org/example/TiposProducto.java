package org.example;

public class TiposProducto {
    private int id;
    private String nombre;

    public void Tipos(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Tipos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
