public class Cliente {
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
        this.Direccion=Direccion;
        this.Nombre=Nombre;
        this.NumSocio=0;
        this.DNI=DNI;
        this.FechaBaja=FechaBaja;
        this.FechaNacimiento=FechaNacimiento;
        this.PeliculasAlquiladas=FechaAlquiladas;
    }
    
}
