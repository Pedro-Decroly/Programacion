
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

//Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado






//2 Realiza un programa que muestre un menú de opciones
        String opcion ="";
        Scanner reader = new Scanner (System.in);
        do { 
            System.out.println("1º-Sumar");
            System.out.println("2º-Restar");
            System.out.println("3º-Multiplicar");
            System.out.println("4º-Dividir");
            System.out.println("5º-Salir");
            opcion = reader.nextLine();
        } while (opcion !="5");
    }
}
