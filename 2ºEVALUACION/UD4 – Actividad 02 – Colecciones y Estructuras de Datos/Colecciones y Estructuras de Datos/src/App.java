
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputMismatchException, Exception  {
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

//Positivo

try{
 
 System.out.println("Primer funcion Positivo");
    System.out.print("Introduzca un número: ");
    int numero5 = rc.nextInt();
  

}catch(InputMismatchException e){
    
        throw new Exception("Error: El número " + " es negativo. Se requiere un número positivo.");
}

//Negativo
try {
    System.out.println("Segunda funcion Negativo");
    System.out.print("Introduzca un número: ");
    int numero6 = rc.nextInt();
    
} catch (Exception e) {

    throw new Exception("Error: El número " + " es positivo. Se requiere un número Negativo.");
}


//Ejercicio5


//Ejercicio6


    }
}
