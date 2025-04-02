package org.example;
import java.io.*;
import java.time.format.DateTimeParseException;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

public class Inventario {




        public static void main(String[] args) throws IOException {
                File nombreFichero = new File("MercaDaw.dat");
                int opcion = 0;


                do {
                        Scanner reader = new Scanner(System.in);
                        System.out.println("Bienvenido a MercaDaw!!");
                        System.out.println("1 - Mostrar todos los Productos en el Inventario");
                        System.out.println("2 - Buscar producto por referencia.\r");
                        System.out.println("3 - Buscar productos por tipo.");
                        System.out.println("4 - Buscar producto por cantidad..");
                        System.out.println("5 - Insertar un nuevo producto (no permitir referencias repetidas)");
                        System.out.println("6 - Eliminar Producto por referencia..");
                        System.out.println("7 - Actualizar producto (descripción, cantidad, precio, descuento, AplicarDto)");
                        System.out.println("8 - BusInsertar un nuevo tipo de producto.\n.");
                        System.out.println("9 - Guardar y Salir");
                        opcion = reader.nextInt();
                        switch (opcion) {
                                case 1:

                                        break;
                                case 2:

                                        break;

                                case 3:

                                        break;
                                case 4:

                                        break;

                                case 5:


                                        break;
                                case 6:

                                        break;

                                case 7:
                                        break;

                                case 8:

                                        break;

                                case 9:

                                        break;
                                default:
                                        System.out.println("Seleccione una opcion valida porfavor");
                                        break;

                        }


                } while (opcion != 9);
        }
}