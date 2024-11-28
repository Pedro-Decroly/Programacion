import java.time.LocalDate;

public class Cliente {
    public static int contador = 0;
//Atributos Del Cliente
    private String DNI;
    private String Nombre;
    private int NumSocio;
    private String Direccion;
    private String FechaNacimiento;
    private String FechaBaja;
    private String PeliculasAlquiladas;

//Constructor Cliente
    public Cliente(String DNI,String Nombre,int NumSocio,String Direccion,String FechaNacimiento,String FechaBaja,String FechaAlquiladas ){
        this.Direccion = Direccion;
        this.Nombre = Nombre;
        this.NumSocio = this.contador;
        this.contador ++;
        this.DNI = DNI;
        this.FechaBaja = LocalDate.now().toString();
        this.FechaNacimiento = LocalDate.now().toString();
        this.PeliculasAlquiladas = FechaAlquiladas;

    }
//Getters y Setters
    public int getNumSocio(){
        return this.NumSocio;
    }
    public String getDireccion(){
        return this.Direccion;
    }
    public String getNombre(){
        return this.Nombre;
    }
    public String getDni(){
        return this.DNI;
    }
    public String getFechadeBaja(){
        return this.FechaBaja;
    }
    public String FechaNacimiento(){
        return this.FechaNacimiento;
    }
//Mostrar info cliente
    
}
