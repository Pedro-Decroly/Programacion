public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hola");
// Crear planeta

    Planeta tierra = new Planeta("Tierra", 6371, 24, 5.97e24, 288, 9.81, 149.6e6);
            
// Crear satélite

    Satelite luna = new Satelite("Luna", 1737, 27.3, 7.34e22, 235, 1.62, 384400, tierra);
            
 // Mostrar información

            System.out.println(" Planeta ");

            tierra.muestra();

            System.out.println(" Satélite");

            luna.muestra();

        }
    }