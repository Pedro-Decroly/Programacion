import java.util.Scanner;

public class Gestion {
    public static void main(String[] args) throws Exception {
        int opcion = 0;


        do {
            Scanner reader = new Scanner(System.in);
            System.out.println("Bienvenido al sofware de Gestor de Empresas!!");
            System.out.println("1 - Registar Trabajador en la empresa");
            System.out.println("2 - Mostrar informacion general de la empresa, con todos los trabajadores, gerentes y director\r");
            System.out.println("3 - Mostrar el numero de trabajadores actuales y el organigrama de la empresa ");
            System.out.println("4 - Mostrar informacion de un departamento de la empresa ");
            System.out.println("5 - Eliminar un trabajador en la empresa ");
            System.out.println("6 - Agenda del director");
            System.out.println("7 - Salir del programa");
            opcion = reader.nextInt();
            switch (opcion) {
                case 1:
                    reader = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del trabajador para poder registarlo: ");
                    String nombre = reader.next();
                    System.out.println("Ingrese el numeroSs para poder registar al trabajador: ");
                    String numeroSs = reader.next();
                    System.out.println("Ingrese el departamento en el que trabajara este trabajador");
                    String departamento = reader.next();
                    break;
                case 2:
                    for (Empresa emp : Gestion){
                        System.out.println(emp);
                    }
                    break;

                case 3:
                    for (Trabajador tra : trabajadores){
                        System.out.println(tra);
                    }
                    break;

                case 4:
                    System.out.println("Elije de que departamento del que quieras ver informacion");
                    String[] departamentos = reader.nextLine().split(" ");
                    for (GerenteDep Gdep : departamentos){
                        System.out.println(Gdep);
                    }
                    break;

                case 5:
                   reader = new Scanner(System.in);
                    System.out.println("Ingrese el nombre del trabajador: ");
                    String nombre2 = reader.next();
                    for (Trabajador tr : Trabajador){
                        if (tr.getNumeroSs().remove);
                    }
                    break;

                case 6:

                    break;

                case 7:
                    System.out.println("Saliendo del programa, hasta pronto......");
                    break;

                default:
                    System.out.println("Seleccione una opcion valida porfavor");
                    break;



            }


        } while (opcion != 7);
    }

}