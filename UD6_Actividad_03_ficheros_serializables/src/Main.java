import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static final String FICHERO_TEXTO = "biblioteca.txt";
    private ArrayList<Libro> libros;

    public static void main(String[] args) throws IOException {
        File nombreFichero = new File("./resources/Almacen.dat");
        LinkedList <Libro> almacenLibros = new  LinkedList <Libro>();
        String opcion = "";



        do{
            Scanner reader = new Scanner(System.in);
            System.out.println("Bienvenido al almacen!!");
            System.out.println("1 - Crear Libro y registrarlo en la Biblioteca (ISBN único)");
            System.out.println("2 - Mostrar Libros existentes por (ISBN, titulo, Autor, Fecha)\r");
            System.out.println("3 - Eliminar Libro por ISBN");
            System.out.println("4 - Guardar Libros en el fichero..");
            System.out.println("5 - Guardar y Salir");
            opcion = reader.nextLine();
            switch(opcion)
            {
                case "1":
                    System.out.println("Introduce el nombre del libro: ");
                    String titulo = reader.nextLine();




                    break;
                case "2":

                    break;
                case "3":

                    break;

                case "4":

                    break;

                case "5":
                    System.out.println("Saliendo del programa, hasta pronto......");
                    break;

                default:
                    System.out.println("Seleccione una opcion valida porfavor");
                    break;

            }


        }while(!opcion.equals("5"));
    }
}
