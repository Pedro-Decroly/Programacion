

import java.util.Scanner;

public class GestionVideoDaw {
    public static void main(String[] args) throws Exception {} 
Scanner sc = new Scanner(System.in);

    String clientes;
    String nombreVideoclub;

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- MENÚ VIDEOCLUB ---");
            System.out.println("1. Crear y registrar VideoClub");
            System.out.println("2. Registrar película");
            System.out.println("3. Registrar cliente");
            System.out.println("4. Alquilar película");
            System.out.println("5. Devolver película");
            System.out.println("6. Dar de baja cliente");
            System.out.println("7. Dar de baja película");
            System.out.println("8. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = sc.nextInt();
            
            
            switch(opcion) {
                case 1:
                    crearVideoclub();
                    break;
                case 2:
                    registrarPelicula();
                    break;
                case 3:
                    registrarCliente();
                    break;
                case 4:
                    alquilarPelicula();
                    break;
                case 5:
                    devolverPelicula();
                    break;
                case 6:
                    darBajaCliente();
                    break;
                case 7:
                    darBajaPelicula();
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 8);
    }
    
    private void crearVideoclub() {
        System.out.print("Introduce nombre del VideoClub: ");
        nombreVideoclub = sc.nextLine();
        System.out.println("VideoClub " + nombreVideoclub + " creado");
    }
    
    private void registrarPelicula() {
        System.out.print("Título de la película: ");
        String titulo = sc.nextLine();
        Pelicula p = new Pelicula(titulo);
        peliculas.add(p);
        System.out.println("Película registrada");
    }
    
    private void registrarCliente() {
        System.out.print("Nombre del cliente: ");
        String nombre = sc.nextLine();
        Cliente c = new Cliente(nombre);
        clientes.add(c);
        System.out.println("Cliente registrado");
    }
    
    private void alquilarPelicula() {
      
                if (peliculas.isEmpty() || clientes.isEmpty()) {
            System.out.println("No hay películas o clientes registrados");
            return;
        }
        System.out.println("Película alquilada");
    }
    
    private void devolverPelicula() {
        System.out.println("Película devuelta");
    }
    
    private void darBajaCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
            return;
        }
        System.out.print("Nombre del cliente a dar de baja: ");
        String nombre = sc.nextLine();
        System.out.println("Cliente dado de baja");
    }
    
    private void darBajaPelicula() {
        if (peliculas.isEmpty()) {
            System.out.println("No hay películas registradas");
            return;
        }
        System.out.print("Título de la película a dar de baja: ");
        String titulo = sc.nextLine();
        System.out.println("Película dada de baja");
    }
    
}

class Cliente {
    String nombre;
    public Object dni;
    
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
}

class Pelicula {
    String titulo;
    boolean disponible = true;
    
    public Pelicula(String titulo) {
        this.titulo = titulo;
    }
    }
