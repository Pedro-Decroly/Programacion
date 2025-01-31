public class Contacto {

private String nombre;
private int telefono;
private String correo;

//Constructores 
public Contacto(String nombre, int telefono, String correo) {
    this.nombre = nombre;
    this.telefono = telefono;
    this.correo = correo;
}

//Getters
public String getNombre() {
    return nombre;
}

public int getTelefono() {
    return telefono;
}

public String getCorreo() {
    return correo;
}

//Setters
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setTelefono(int telefono) {
    this.telefono = telefono;
}

public void setCorreo(String correo) {
    this.correo = correo;
}

@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contacto{");
        sb.append("nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append(", correo=").append(correo);
        sb.append('}');
        return sb.toString();
}



}
