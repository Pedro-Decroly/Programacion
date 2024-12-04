import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DawBank {
    public static void main(String[] args)throws Exception {

    Scanner reader = new Scanner(System.in);
    
   
//Creamos el scaner para poder escribir el IBAN y el titular
        System.out.println("Introduce tu IBAN para crear tu cuenta");
            Scanner entrada = null;
            String iban = entrada.nextLine();
      
		Pattern patiban = Pattern.compile("[A-Z]{2}[0-9]{22}");
		Matcher matiban = patiban.matcher(iban);
		while (!matiban.matches()) {
			System.out.println("El IBAN introducido es incorrecto");
			iban = entrada.nextLine();
			matiban = patiban.matcher(iban);
		}

        System.out.println("Introduce el nombre del titular");
           double titular = reader.nextDouble();

        

//Creamos el objeto Cuenta Bancaria usando el constructor Cuenta Bancaria

CuentaBancaria Cuenta1 = new CuentaBancaria(null, null,  0);
//Creamos el menu Ingresar reguntar cuanto dinero quiere ingredar-Retirar pedir que cunanto dinero vas a querer ingresar y no se puede tener un descubierto de -50
String opcion = null;
do{
    entrada = new Scanner(System.in);
    System.out.println("Buenas Bienvenido");
    System.out.println("1.-Datos de la cuenta");
    System.out.println("2.-IBAN");
    System.out.println("3.-TITULAR");
    System.out.println("4.-SALDO");
    System.out.println("5.-INGRESO");
    System.out.println("6.-RETIRADA");
    System.out.println("7.-MOVIMIENTOS");
    System.out.println("8.-SALIR");
    entrada.nextLine();
    switch (opcion) {
        case "1":
            System.out.println(Cuenta1.infoCuenta());
            break;

        case "2":
            System.out.println(Cuenta1.getiban());
            break;

        case "3":
        System.out.println(Cuenta1.gettitular());
            break;

        case "4":
        System.out.println(Cuenta1.getsaldo());
            break;

        case "5":
            entrada = new Scanner(System.in);
            System.out.println("INGRESAR SALDO");
            double cantidadingreso = entrada.nextDouble();

            if(cantidadingreso > 0){
                if (cantidadingreso > 3000) {
                    System.out.println("NOTIFIQUE A HACIENDA POR FAVOR");
                }
                Movimiento ingreso = new Movimiento("Ingreso",cantidadingreso);
                Cuenta1.ingreso(ingreso);
                System.out.println("INGRESO REALIZADO" +  Cuenta1.getsaldo());
            }

            else {
                System.out.println("POR FAVOR, INTRODUCE UNA CANTIDAD VALIDA");
            }
            break;

        case "6":
            entrada = new Scanner(System.in);
            System.out.println("RETIRAR SALDO");
            double cantidadretirada = entrada.nextDouble();

            if (cantidadretirada > 0) {
                if (cantidadretirada > 3000) {
                    System.out.println("NOTIFIQUE A HACIENDA POR FAVOR");
                }
                Movimiento retirada = new Movimiento("Retirada",cantidadretirada);
                Cuenta1.retirada(retirada);
                System.out.println("RETIRADA REALIZADA ");
            }
    }
}
while(!opcion.equals("8"));
entrada.close();



    }
}




