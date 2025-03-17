
import java.time.LocalDate;

public class Trabajador {
    private String nombre;
    private LocalDate FechaNacimiento;
    private String DNI;
    private String Direccion;
    private int NumeroSS;

//constructor
    public Trabajador (String tipo){
        this.Direccion=Direccion;
        this.DNI = DNI;
        this.FechaNacimiento = LocalDate.now();
        this.nombre = nombre;
        this.NumeroSS=NumeroSS;
    }

//Getters y Setters
    public String getDireccion(){
        return this.Direccion;
    }
    public String getDni(){
        return this.DNI;
    }
    public String getnombre(){
        return nombre;
    }
    public LocalDate FechaNacimiento(){
        return FechaNacimiento;
    }
    public int getNumeroSS(){
        return NumeroSS;
    }

//Metodo informacion del trabajador 
    public String mostrarInfoTrabajador(){
        String info = String.format("Trabajador - Nombre:%s, Direccion:%s, Dni:%s, FechaNacimineto:%s, NumeroSS:%s", this.nombre, this.Direccion, this.DNI, this.FechaNacimiento, this.NumeroSS);
        return info;
    }
}