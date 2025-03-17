
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

//1-Realiza un programa que dada una cantidad de euros que el usuario introduce por teclado

        Scanner reader = new Scanner(System.in);
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        System.out.print("Introduce una cantidad en euros (múltiplo de 5): ");
        int cantidad = reader.nextInt();

        if (cantidad % 5 != 0) {
            System.out.println("Error: La cantidad debe ser múltiplo de 5.");
            return;
        }

        System.out.println("Para " + cantidad + " euros, necesitas:");

        for (int billete : billetes) {
            if (cantidad >= billete) {
                int numBilletes = cantidad / billete;
                System.out.println(numBilletes + " billete(s) de " + billete + " euros");
                cantidad %= billete;
            }
        }




//2-Realiza un programa que muestre un menú de opciones

        String opcion ="";
        Scanner reader1 = new Scanner (System.in);
        
        do {
            System.out.println("1-Suma");
            System.out.println("2-Resta");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
            opcion = reader1.nextLine();

           
            switch(opcion)
            {
                case "1":
                    reader1 = new Scanner(System.in);
                        System.out.println("INTRODUCE UN NUMERO:");
                            double numero1 = reader1.nextDouble();
				
			        System.out.println("INTRODUCE UN NUMERO:");
                        double numero2 = reader1.nextDouble();
                            System.out.println("La Suma es:" + (numero1 + numero2));
                    
                break;
                
                case "2":
                    reader1 = new Scanner(System.in);
                        System.out.println("INTRODUCE UN NUMERO:");
				            double numero3 = reader1.nextDouble();
				
			        System.out.println("INTRODUCE UN NUMERO:");
                        double numero4 = reader1.nextDouble();
                            System.out.println("La Resta es:" + (numero3 - numero4));
                break;
                
                case "3":
                    reader1 = new Scanner(System.in);
                        System.out.println("INTRODUCE UN NUMERO:");
                            double numero5 = reader1.nextDouble();
				
			        System.out.println("INTRODUCE UN NUMERO:");
                        double numero6 = reader1.nextDouble();
                            System.out.println("El Producto es:" + (numero5 * numero6));
                break;

                case "4":
                    reader1 = new Scanner(System.in);
                        System.out.println("INTRODUCE UN NUMERO:");
				             double numero7 = reader1.nextDouble();
				
			        System.out.println("INTRODUCE UN NUMERO:");
                        double numero8 = reader1.nextDouble();
                            System.out.println("El Producto es:" + (numero7 / numero8));
                break;

            default:
                System.out.println("Introduzca una opcion correcta del menu");
                break;

            }
        }while(!opcion.equals("5"));

    }
}
            
    
    