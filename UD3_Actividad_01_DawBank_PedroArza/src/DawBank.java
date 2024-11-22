import java.util.Scanner;
public class DawBank {
    public static void main(String[] args)throws Exception {

    Scanner reader = new Scanner(System.in);
    String opcion = "";
   
//Creamos el scaner para poder escribir el IBAN y el titular
        System.out.println("Introduce tu IBAN para crear tu cuenta");
            double iban = reader.nextDouble();
            

        System.out.println("Introduce el nombre del titular");
           double titular = reader.nextDouble();

        

//Creamos el objeto Cuenta Bancaria usando el constructor Cuenta Bancaria

CuentaBancaria Cuenta1 = new CuentaBancaria(null, null,  0, 100);

//Creamos el menu Ingresar reguntar cuanto dinero quiere ingredar-Retirar pedir que cunanto dinero vas a querer ingresar y no se puede tener un descubierto de -50.


    
    }
}




