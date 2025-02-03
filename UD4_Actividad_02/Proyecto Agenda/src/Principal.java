import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner sc = new Scanner(System.in);

        Agenda agenda = new Agenda();

        String option;

        do { 

            sc = new Scanner(System.in);

            System.out.println("Selecciona una opcion de el menu");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Elimina el contacto");
            System.out.println("3. Visualizar agenda");
            System.out.println("4. Visualizar agenda");
            System.out.println("5. Número de contactos de mi agenda");
            System.out.println("6. Exit");
            option = sc.nextLine();

            if (option.equals("1")){

                System.out.println("Añade el contacto");
                String matricula = sc.nextLine();
                System.out.println("Añade el Color del coche");
                String color = sc.nextLine();
                System.out.println("Añade la Marca delcoche");
                String marca = sc.nextLine();

            }else if (option.equals("2")){
            
            }

        } while (!option.equals("3"));
    }
}

