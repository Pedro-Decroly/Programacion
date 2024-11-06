import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("BIENVENIDO AL EXAMEN");
    
        String opcion ="";

        Scanner reader1 = new Scanner (System.in);
     
        do {

            System.out.println("º-MODIFICAR COLECCION");

                System.out.println("1-SUMA DE VALORES NO NULOS");

            System.out.println("º-ESTADISTICAS DE LA COLECCION");

                System.out.println("2-MAXIMO DE LA ELECCION");

                System.out.println("3-MINIMO DE LA ELECCION");

                System.out.println("4-MEDIA DE LOS NUMEROS");

            System.out.println("º-AMPLIAR EL VALOR DE LA COLECION");

            System.out.println("5-Salir");

            opcion = reader1.nextLine();

            switch(opcion)
            {
                case "1":

                    reader1 = new Scanner(System.in);

                        System.out.println("INTRODUCE UN NUMERO:");

                            double num1 = reader1.nextDouble();
        
                        System.out.println("INTRODUCE UN NUMERO:");

                            double num2 = reader1.nextDouble();

                        System.out.println("El resultado es:" + (num1+num2));
			
                break;
                
                case "2":

                    reader1 = new Scanner(System.in);

                        System.out.println("INTRODUCE UN NUMERO:");

				            double num3 = reader1.nextDouble();
				
			            System.out.println("INTRODUCE UN NUMERO:");

                            double num4 = reader1.nextDouble();
                    
                            double mayor = Math.max(num4, num3 );
                            
                        System.out.println("El numero maximo es:");
                           
                        System.out.println(mayor);
                
                break;
                
                case "3":

                    reader1 = new Scanner(System.in);

                        System.out.println("INTODUCE UN NUMERO");
                            
                            double num5 = reader1.nextDouble();

                        System.out.println("INTRODUCE OTRO");

                            double num6 =reader1.nextDouble();

                            double menor = Math.min (num5, num6);

                        System.out.println("El minimo es:");

                        System.out.println(menor);
                        
                break;

                case "4":

                    reader1 = new Scanner(System.in);

                        System.out.println("INTRODUCE UN NUMERO:");

                            double num7 = reader1.nextDouble();
				
			            System.out.println("INTRODUCE UN NUMERO:");

                            double num8 = reader1.nextDouble();

                        System.out.println("La media es:" + (num7 / num8));

                break;

            }

            if(opcion.equals("5")){
            
                System.out.println("ADIOS Y GRACIAS POR TODO");
                
            }
         
            else{

                System.out.println("La opcion no es la valida");
                
            }

        }while(!opcion.equals("5"));

    }
}    