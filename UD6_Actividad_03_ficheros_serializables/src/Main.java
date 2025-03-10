import java.io.*;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        File nombreFichero = new File("AlmacenLibro.dat");
        LinkedList<Libro> almacenLibros = new LinkedList<Libro>();
        int opcion = 0;


        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Bienvenido al almacen!!");
            System.out.println("1 - Crear Libro y registrarlo en la Biblioteca (ISBN único)");
            System.out.println("2 - Mostrar Libros existentes por (ISBN, titulo, Autor, Fecha)\r");
            System.out.println("3 - Eliminar Libro por ISBN");
            System.out.println("4 - Guardar Libros en el fichero..");
            System.out.println("5 - Guardar y Salir");
            opcion = reader.nextInt();
            switch (opcion) {
                case 1:
                    reader = new Scanner(System.in);
          try {
                    System.out.println("Introduce el ISBN del libro: ");
                    String isbn = reader.nextLine();
                    if (comprobarIsbn(isbn, almacenLibros)) {
                        throw new Exception("El ISBN ya existe");
                    }

                    System.out.println("Introduce el nombre del Libro: ");
                    String titulo = reader.nextLine();

                    System.out.println("Introduce el Autor: ");
                    String autor = reader.nextLine();

                    System.out.println("Introduce el Fecha de Publicacion: ");
                    String fechaPublicacion = reader.nextLine();

                    Libro libro = new Libro(isbn, titulo, autor, fechaPublicacion);
                    almacenLibros.add(libro);
                } catch (DateTimeParseException e) {
                    System.out.println("Fecha no valida. Formato de Fecha de Publicacion dd/MM/yyyy");
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }


                    break;
                case 2:
                    for (Libro lib : almacenLibros) {

                        System.out.println(lib);
                    }

                    break;
                //se pasa directamente a la opcion 4 sin dejar poner el isbn
                case 3:
                    reader = new Scanner(System.in);
                    System.out.println("Introduce el ISBN del libro: ");
                    String isbn = reader.nextLine();
                    for (Libro lib : almacenLibros) {
                        if (lib.getIsbn().equals(isbn)) {
                            almacenLibros.remove(lib);
                            break;
                        }
                    }
                    break;
                case 4:
                    guardarLibro(almacenLibros);


                    break;

                case 5:
                    guardarLibro(almacenLibros);
                    System.out.println("Saliendo del programa, hasta pronto......");
                    break;

                default:
                    System.out.println("Seleccione una opcion valida porfavor");
                    break;

            }


        } while (opcion != 5);
    }

    public static void guardarLibro(LinkedList<Libro> almacenLibros) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("AlmacenLibro.dat", false))) {
            for (Libro l1 : almacenLibros) {
                String comando = "Autor = " + l1.getAutor() + ", isbn=" + l1.getIsbn() + ",edicion=" + l1.getFechaPublicacion() + " titulo=" + l1.getTitulo();

                writer.println(comando);
            }
            System.out.println("Libros guardados en el fichero.");
        } catch (IOException e) {
            System.out.println("Error al guardar el libro: " + e.getMessage());
        }
    }

    public static boolean comprobarIsbn(String isbn, LinkedList<Libro> almacenLibros) {
        for (Libro l1 : almacenLibros) {
            if (l1.getIsbn().equals(isbn)) {
                return true;
            }
        }
        return false;
    }


}
