import java.time.LocalDate;

public class Cliente {
    public static int contador = 0;
//Atributos Del Cliente

    private String DNI;

    private String Nombre;

    private int NumSocio;

    private String Direccion;

    private String FechaNacimiento;

//Constructor Cliente
    public Cliente(String DNI,String Nombre,int NumSocio,String Direccion,String FechaNacimiento,String FechaBaja,String FechaAlquiladas ){
        this.Direccion = Direccion;
        this.Nombre = Nombre;
        this.NumSocio = this.contador;
        this.contador ++;
        this.DNI = DNI;
        this.FechaNacimiento = LocalDate.now().toString();
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
    public String FechaNacimiento(){
        return this.FechaNacimiento;
    }
//Mostrar info cliente
    public String mostrarInfoCliente(){
        
        String info = String.format("Cliente - NumSocio:%s, Direccion:%s, Nombre:%s, Dni:%s,FechadeNacimiento",this.Direccion,this.DNI,this.FechaNacimiento,this.Nombre,this.NumSocio);
            return info ;
    }
}
