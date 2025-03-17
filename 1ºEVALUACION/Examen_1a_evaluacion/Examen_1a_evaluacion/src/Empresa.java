
import java.time.LocalDate;

public class Empresa {
    private String NombreEmpresa;
    private String CIF;
    private LocalDate FechaFundacion;
    private int MaxTrabajadores = 50;
    private int ColeccionTrabajadores;

    private Trabajador [] trabajador;
    private int nElementosActuales;
    private int nTrabajador;
    
    //Constructor
        public Empresa (String tipo, int Cantidad){
            this.CIF = CIF;
            this.ColeccionTrabajadores = ColeccionTrabajadores;
            this.FechaFundacion = LocalDate.now();
            this.MaxTrabajadores = 50;
            this.NombreEmpresa = NombreEmpresa;
            this.nElementosActuales = 0;
            this.trabajador = new Trabajador[nTrabajador];


    }
//Getters y Setters 
    public String getNombreEmpresa(){
        return this.NombreEmpresa;
    }
    public String getCif(){
        return this.CIF;
    }
    public LocalDate getFechaFuncion(){
        return this.FechaFundacion;
    }
    public int getMaxTrabajadores(){
        return this.MaxTrabajadores;
    }
    public int getColeccionTrabajadores(){
        return this.ColeccionTrabajadores;
    }
//CrearTrabajador
public boolean CrearTrabajador (Trabajador t1){
    boolean isAdd = false;
    if(t1 != null){
        this.trabajador[nElementosActuales] = t1;
        this.nElementosActuales++;
        isAdd = true;
    }
    return isAdd;
    
}
//registrarTrabajador

    public boolean RegistrarTrabajador (Trabajador t1){
        boolean isAdd = false;
        if(t1 != null){
            this.trabajador[nElementosActuales] = t1;
            this.nElementosActuales++;
            isAdd = true;
        }
        return isAdd;
        
    }
//Eliminar Trabajador

    public boolean eliminarTrabajador(Trabajador t1){
        boolean isRemoved = false;
        if(t1 != null){
            int index = -1;
            for(int i = 0; i < this.trabajador.length; i++){
                if(this.trabajador[i] != null){
                    if(this.trabajador[i].getDni().equalsIgnoreCase(t1.getDni())){
                        index = i;
                    }
                }
            }
            if(index != -1){
                this.trabajador[index] = null;
                isRemoved = true;
//recolocar el array
                for(int i = index+1; i < this.trabajador.length; i++){
                    this.trabajador[i-1] = this.trabajador[i];
                }
                this.trabajador[this.trabajador.length-1] = null;
                this.nElementosActuales--;
            }
        }
        return isRemoved;
    }

//Mostrar Info-Trabajadores
    public String mostrarInfoTrabajador(){
        String result = "";
        if(this.nElementosActuales > 0){
            for(Trabajador l : this.trabajador){
                if(l != null){
                    result += l.mostrarInfoTrabajador() + "\n";
                }
            }
        }
        else{
            result = "No hay elementos en la empresa";
        }
        return result;
   }

//Mostrar InfoEmpresa
   public String mostrarInfoEmpresa(){

    String info  = String.format("Empresa - NombreEmpresa:%s,CIF:%s,FechaFundacion:%s",this.NombreEmpresa,this.CIF,this.FechaFundacion);
    
    return info;
   
    }
}