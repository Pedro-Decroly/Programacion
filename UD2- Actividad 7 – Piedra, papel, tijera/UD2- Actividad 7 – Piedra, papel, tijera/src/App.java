import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    




    System.out.println("Muy buenas jugador y bien venido al mitico jugo Piedra,Papel y Tijeras");
    System.out.println("Antes de enpezar a jugar te voy a explicar las breves normas de este juego: ");
    System.out.println("Piedra gana a tijeras=T (piedra rompe tijeras)." + //
                        "Papel gana a piedra=P (papel cubre piedra)." + //
                        "Tijeras gana a papel=L (tijeras cortan papel).");

    String opcion ="";
    Scanner reader1 = new Scanner (System.in);
    
    do {
        System.out.println("Elije una letra:");
            System.out.println("1-P");
            System.out.println("2-L");
            System.out.println("3-T");
            System.out.println("4-S");
            opcion = reader1.nextLine();
           
           
            switch(opcion)
            {
                case "1":
                reader1 = new Scanner(System.in);
                
                
                break;
                
                case "2":
                reader1 = new Scanner(System.in);
                

                break;
                
                case "3":
                reader1 = new Scanner(System.in);
                

                break;

                case "4":
                reader1 = new Scanner(System.in);
                

                break;

            default:
                System.out.println("Introduzca una opcion correcta del menu");
                break;

            }
        }while(!opcion.equals("5"));

    }
}
