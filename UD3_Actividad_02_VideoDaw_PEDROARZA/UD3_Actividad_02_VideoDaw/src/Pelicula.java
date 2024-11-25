
import java.lang.classfile.instruction.ThrowInstruction;

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
            public Pelicula(Sting tipo, int cantidad){

                this.codigo= contador;
                this.contador ++;
                this.Titulo = Titulo;
                this.Genero=Genero;
                this.FechaRegistro=FechaRegistro;
                this.FechaBaja=FechaBaja;
                this.FechaAlquiler=FechaAlquiler;
            }
    //Getters ySetters
            public int getcodigo(){
                return this.codigo;
            }
           public String getTitulo(){
                return this.Titulo ;
           }
            public String getGenero(){
                    return this.Genero ;
            }
            public String getFechaRegistro(){
                    return this.FechaRegistro ;
            }
            public String getFechaBaja(){
                    return this.FechaBaja ;
            }
            public String getFechaAlquiler(){
                    return this.FechaAlquiler ;
            }














        }
