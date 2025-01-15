public class Contacto {

    private String nombre;
    private String telefono;

    public Contacto (String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Contacto{");
        sb.append("nombre=").append(nombre);
        sb.append(", telefono=").append(telefono);
        sb.append('}');
        return sb.toString();
    }

}
