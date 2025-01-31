import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido al taller!!");
         Scanner sc = new Scanner(System.in);

        Taller taller = new Taller();

        String option;

        do { 

            sc = new Scanner(System.in);

            System.out.println("Selecciona una opcion de el menu");
            System.out.println("1. Añade el coche");
            System.out.println("2. Elimina el coche");
            System.out.println("3. Exit");
            option = sc.nextLine();

            if (option.equals("1")){

                System.out.println("Añade la Matricula del coche");
                String matricula = sc.nextLine();
                System.out.println("Añade el Color del coche");
                String color = sc.nextLine();
                System.out.println("Añade la Marca delcoche");
                String marca = sc.nextLine();

                taller.añadeElemento(color, marca, matricula);

            }else if (option.equals("2")){

                System.out.println("Añada la matricula del coche que quieras eliminar");
                String cocheEliminar = sc.nextLine();
                taller.eliminaElemento(cocheEliminar);

            }else if (option.equals("3")){   

                System.out.println("Detalles del tayer son: ");taller.visualizaTaller();

                System.out.println("Las matriculas son: "); taller.visualizaMatriculas();

                System.out.println("Los coches en el taller son: ");taller.visualizaCoches();

            }else {
                System.out.println("Ingrese una opcion correcta");
            }

        } while (!option.equals("3"));
    }
}
