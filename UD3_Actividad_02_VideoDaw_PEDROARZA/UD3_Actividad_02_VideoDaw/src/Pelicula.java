        //Clase Pelicula
public class Pelicula {
            private static int contador =0;
            private int codigo =0;
            private String Titulo;
            private String Genero;
            private String FechaRegistro;
            private String FechaBaja;
            private String FechaAlquiler;
            private String IsAlquilada;

        //Constructor
            public Pelicula(String tipo, int cantidad){

                this.codigo= contador;
                this.contador ++;
                this.Titulo = Titulo;
                this.Genero=Genero;
                this.FechaRegistro=FechaRegistro;
                this.FechaBaja=FechaBaja;
                this.FechaAlquiler=FechaAlquiler;
                this.IsAlquilada=IsAlquilada;
            }
        //Getters ySetters
            public int getcodigo(){
                return this.codigo;
            }
           public String getTitulo(){
                return this.Titulo;
           }
            public String getGenero(){
                return this.Genero;
            }
            public String getFechaRegistro(){
                return this.FechaRegistro;
            }
            public String getFechaBaja(){
                return this.FechaBaja;
            }
            public String getFechaAlquiler(){
                return this.FechaAlquiler;
            }
            public String getIsAlquilada (){
                return this.IsAlquilada;
            }
        //Metodo mostrarInfoPelicula
            
            public String mostrarInfoPelicula(){

                String info = String.format("Pelicula - Titulo:%s, Genero:%s,FechaRegistro:%s,FechaBaja:%s,FechaAlquiler%s",this.Titulo,this.Genero,this.FechaRegistro,this.FechaBaja,this.FechaAlquiler);
                        return info;
                }














        }
