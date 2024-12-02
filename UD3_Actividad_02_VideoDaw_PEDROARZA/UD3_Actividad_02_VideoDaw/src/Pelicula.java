        //Clase Pelicula

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pelicula {
            private static int contador = 0;
            private int codigo = 0;
            private String Titulo;
            private String Genero;
            private LocalDate FechaRegistro;
            private LocalDate FechaBaja;
            private LocalDateTime FechaAlquiler;
            private String IsAlquilada;

        //Constructor
            public Pelicula(String tipo, int cantidad){

                this.codigo= contador;
                this.contador ++;
                this.Titulo = Titulo;
                this.Genero=Genero;
                this.FechaRegistro=LocalDate.now();
                this.FechaBaja=LocalDate.now();
                this.FechaAlquiler=LocalDateTime.now();
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
            public LocalDate getFechaRegistro(){
                return this.FechaRegistro;
            }
            public LocalDate getFechaBaja(){
                return this.FechaBaja;
            }
            public LocalDateTime getFechaAlquiler(){
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
