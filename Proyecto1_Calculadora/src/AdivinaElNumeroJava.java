import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AdivinaElNumeroJava {

    public static void main(String[] args) {

        // Generar número aleatorio entre 1 y 100
        int numeroMagico = ThreadLocalRandom.current().nextInt(1, 100);

        // Crear Scanner para leer del teclado
        Scanner sc = new Scanner(System.in);

        // Solicitar un número al usuario
        int numeroUsuario;

        do {
            System.out.println("Intenta adivinar el número que he pensado. Ingresa tu propuesta: ");
            numeroUsuario = sc.nextInt();

            if (numeroMagico > numeroUsuario) {
                System.out.println("El número que he pensado es mayor que el introducido");
            } else if (numeroMagico < numeroUsuario) {
                System.out.println("El número que he pensado es menor que el introducido");
            }
        } while (numeroMagico != numeroUsuario);

        // Si termina el ciclo while es porque los números son iguales. Felicitamos al usuario
        System.out.println("Has acertado, el número que pensé fue: " + numeroMagico);
    }
}
