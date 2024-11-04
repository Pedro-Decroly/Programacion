import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

            Random random = new Random();

            String[] opciones = {"P", "L", "T"};

            String[] nombres = {"Piedra", "Papel", "Tijeras"};

            //Explicaicon

            System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijera!");

            System.out.println("Antes de enpezar a jugar te voy a explicar las breves normas de este juego: ");

            System.out.println("Piedra gana a tijeras=T (piedra rompe tijeras)." + //

                                "Papel gana a piedra=P (papel cubre piedra)." + //

                                "Tijeras gana a papel=L (tijeras cortan papel).");

            //Menu de eleccion

            System.out.println("Elije una:");

            System.out.println("P - Piedra");

            System.out.println("L - Papel");

            System.out.println("T - Tijeras");

            System.out.println("S - Salir del juego");
            
            //Eleccion de jugada

            while (true) {
            
            int jugadaOrdenador = random.nextInt(3);

            System.out.print("Elige tu jugada (P, L, T o S para salir): ");

            String jugadaUsuario = scanner.nextLine().toUpperCase();
            
            //Salida del juego

            if (jugadaUsuario.equals("S")) {

            System.out.println("Gracias por jugar Hasta luego.");

            break;

            }
            
            //Por si elijes algo que no sea P,L o T

            if (!jugadaUsuario.equals("P") && !jugadaUsuario.equals("L") && !jugadaUsuario.equals("T")) {

            System.out.println("Jugada no válida. Intenta de nuevo.");

            continue;

            }
            

            System.out.println("La Ordenador eligió: " + nombres[jugadaOrdenador]);
            
            //Resultados de las jugadas.
    
            if (jugadaUsuario.equals(opciones[jugadaOrdenador])) {

            System.out.println("¡Es un empate!");
            
            } else if ((jugadaUsuario.equals("P") && opciones[jugadaOrdenador].equals("T")) ||

            (jugadaUsuario.equals("L") && opciones[jugadaOrdenador].equals("P")) ||

            (jugadaUsuario.equals("T") && opciones[jugadaOrdenador].equals("L"))) {

            System.out.println("Ganaste");

            }else if ((jugadaUsuario.equals("T") && opciones[jugadaOrdenador].equals("P")) ||

            (jugadaUsuario.equals("L") && opciones[jugadaOrdenador].equals("T")) ||

            (jugadaUsuario.equals("P") && opciones[jugadaOrdenador].equals("L"))) {

            System.out.println("Perdiste");
            }
        }
    }
}
