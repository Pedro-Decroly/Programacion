import java.util.Date;

public class Cliente extends Persona {

    private int telefono;
    private String email;
    private String direccion;

    public Cliente(String nombre, String DNI, Date FechaNacimiento, String direccion) {
        super(nombre, DNI, FechaNacimiento);
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("telefono=").append(telefono);
        sb.append(", email=").append(email);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }

}