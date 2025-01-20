import java.util.Scanner;

public class ProgramaAgenda {
    private static Scanner scanner = new Scanner(System.in);
    private static Agenda agenda = new Agenda();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");
            
            switch (opcion) {
                case 1:
                    añadirContacto();
                    break;
                case 2:
                    eliminarContacto();
                    break;
                case 3:
                    buscarContacto();
                    break;
                case 4:
                    agenda.listarContactos();
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 5);
        
        scanner.close();
    }
    
    private static void mostrarMenu() {
        System.out.println("\n=== AGENDA DE CONTACTOS ===");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Listar todos los contactos");
        System.out.println("5. Salir");
    }
    
    private static void añadirContacto() {
        System.out.print("\nIntroduce el nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el teléfono: ");
        String telefono = scanner.nextLine();
        
        Contacto contacto = new Contacto(nombre, telefono);
        
        if (agenda.añadirContacto(contacto)) {
            System.out.println("Contacto añadido correctamente");
        } else {
            System.out.println("No se pudo añadir el contacto. Nombre duplicado o agenda llena");
        }
    }
    
    private static void eliminarContacto() {
        System.out.print("\nIntroduce el nombre del contacto a eliminar: ");
        String nombre = scanner.nextLine();
        
        if (agenda.eliminarContacto(nombre)) {
            System.out.println("Contacto eliminado correctamente");
        } else {
            System.out.println("No se encontró el contacto");
        }
    }
    
    private static void buscarContacto() {
        System.out.print("\nIntroduce el nombre del contacto a buscar: ");
        String nombre = scanner.nextLine();
        
        int posicion = agenda.buscaContacto(nombre);
        if (posicion >= 0) {
            System.out.println("Contacto encontrado en la posición: " + posicion);
        } else {
            System.out.println("Contacto no encontrado");
        }
    }
    
    private static int leerEntero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int numero = Integer.parseInt(scanner.nextLine());
                return numero;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, introduce un número válido.");
            }
        }
    }
}