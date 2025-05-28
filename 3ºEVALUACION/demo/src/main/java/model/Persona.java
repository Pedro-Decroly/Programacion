package model;

public class Persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private String edad;

public Persona(String nombre, String apellido, String direccion, String telefono, String email, String edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.direccion = direccion;
    this.telefono = telefono;
    this.email = email;
    this.edad = edad;
}

public Persona() {}

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail(String text) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono(String text) {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion(String text) {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
