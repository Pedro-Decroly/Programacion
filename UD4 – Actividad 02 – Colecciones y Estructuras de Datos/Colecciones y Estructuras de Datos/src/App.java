
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputMismatchException  {
        System.out.println("Hello, World!");

//Ejercicio1

Scanner rc = new Scanner (System.in);

try {
    System.out.println("INTODUCE UN NUMERO ENTERO");
    int A = rc.nextInt();
} catch (InputMismatchException A) {
    System.out.println("Vuelve a intentarlo");
}

//Ejercicio2

    try{
        System.out.println("Introduce un numero");
        int A = rc.nextInt();

        System.out.println("Introduce un numero");
        int B = rc.nextInt();

        System.out.println(A/B);
    }
    catch(InputMismatchException A){
        System.out.println("El valor es erroneo");
    }
    catch(ArithmeticException B){
        System.out.println("El calculo es erroneo");

    }
//Ejercicio3

for(double i = 0; i < 5; i++) {

    try {

        System.out.print("Introduce un número: ");

        int A = rc.nextInt();

    } catch (InputMismatchException e) {
        
        System.out.println("Error - Introduce un número válido");

        rc.nextLine();

        i--;
    }
}
//Ejercicio4
 
//Ejercicio5


//Ejercicio6


    }
}
