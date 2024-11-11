
import java.time.LocalDateTime;

//Calses de mis movimientos 
    public class Movimiento {

        private static  int contador = 0;
        private int id;
        private String fecha;
        private String tipo;
        private double cantidad;

//Constructor

    public Movimiento(String tipo, double cantidad){

        this.id = contador;
        this.contador ++;
        this.fecha = LocalDateTime.now().toString();
        this.tipo = tipo;
        this.cantidad = cantidad;
    }


//Getters y Setters

    public int getId(){
        return this.id;
    }
    public String getFecha(){
        return this.fecha;
    }
    public String getTipo(){
        return this.tipo;
    }
    public Double getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        if(cantidad > 0){
            this.cantidad = cantidad;
        }else{
            System.out.println("El valor de la cantidad tiene que ser positivo");
        }
    }
}