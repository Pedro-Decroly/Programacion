import java.util.Date;

public class Persona {

    private String nombre;
    private String DNI;
    private Date FechaNacimiento;
        
    public Persona (String nombre, String DNI, Date FechaNacimiento){
        
        this.nombre = nombre;
        this.DNI = DNI;
        this.FechaNacimiento = FechaNacimiento;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", DNI=").append(DNI);
        sb.append(", FechaNacimiento=").append(FechaNacimiento);
        sb.append('}');
        return sb.toString();
    }

}