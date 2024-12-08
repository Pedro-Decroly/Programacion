import java.time.LocalDate;

public class Pelicula {
            private static int contador = 0;
            private int codigo = 0;
            private String Titulo;
            private String Genero;
            private LocalDate FechaRegistro;
        //Constructor
            public Pelicula(String tipo, int cantidad){

                this.codigo= contador;
                this.contador ++;
                this.Titulo = Titulo;
                this.Genero=Genero;
                this.FechaRegistro=LocalDate.now();
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
            public LocalDate getFechaRegistro(){
                return this.FechaRegistro;
            }
        //Metodo mostrarInfoPelicula
            
            public String mostrarInfoPelicula(){

                String info = String.format("Pelicula - Titulo:%s, Genero:%s,FechaRegistro:%s",this.Titulo,this.Genero,this.FechaRegistro);
                        return info;
            }

        }
