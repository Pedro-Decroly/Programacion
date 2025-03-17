
import java.time.LocalDate;

public class VideoDaw {
        private String Cif;
        private String Direccion;
        private LocalDate FechaAlta;
        private String PeliculasRegistadas;
        private String ClientesRegistrados;
    
    //Contructor 
        public VideoDaw (String tipo,int cantidad){
            this.Cif = Cif;
            this.Direccion = Direccion;
            this.FechaAlta = LocalDate.now();
            this.PeliculasRegistadas = PeliculasRegistadas;
            this.ClientesRegistrados = ClientesRegistrados;
        }
        public String getCif(){
            return this.Cif;
        }
    
        public String getDireccion(){
            return this.Direccion;
        }
    
        public LocalDate getFechaAlta(){
            return this.FechaAlta;
        }
    
        public String getPeliculasRegistradas(){
            return this.PeliculasRegistadas;
        }
    
        public String getClientesRegistrados(){
            return this.ClientesRegistrados;
        }
    //Mostra Info VideoClub
    
        public String mostrarInfoVideoClub(){
    
            String info = String.format("VideoClub - Cif:%s, Direccion:%s, FechaAlta:%s, PeliculaRegistrada:%s, ClienteRegistrada:%s", this.Cif,this.ClientesRegistrados,this.Direccion,this.FechaAlta,this.PeliculasRegistadas);
                return info;
        }
    
    //Mostrar Peliculas Registradas
    
        public String mostrarPeliculasRegistradas(){
            
            String PeliculasRegistradas = "";
            for (int i = 0; i < PeliculasRegistradas.length(); i++) {
                if (PeliculasRegistradas != null) {
                }
            }
                    return PeliculasRegistradas;       
        }
    
    //Mostrar Clientes Registrados
    
        public String mostrarClientesRegistrados(){
    
            String ClientesRegistrados = "";
            for (int i = 0; i < ClientesRegistrados.length(); i++) {
                if (ClientesRegistrados != null) {
                }
            }
                    return ClientesRegistrados;       
        }
    
//Metodo Alquilar Pelicula(Pelicula=p Cliente =c)
    
    public String AlquilerPelicula(Pelicula p ,Cliente c){
            
            
        return AlquilerPelicula(p, c);
    }

//Dar Baja Cliente
    public void darBajaCliente(boolean cliente) {
        cliente = false;
    System.out.println("Cliente " + cliente + " dado de baja");
}

// Registrar Cliente
    public void registrarCliente(Cliente c) {
        boolean existe = false;
    
// Registrar solo si no existe
        if(!existe) {
            System.out.println("Cliente registrado");
        } else {
            System.out.println("Cliente ya existe");
        }
    }
}




 
