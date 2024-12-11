import java.util.Scanner;

public class GestionApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Empresa Empresa1 = new Empresa(null, 0);

        Scanner entrada = null;

        String opcion = null;
do{
    entrada = new Scanner(System.in);
    System.out.println("Buenas Bienvenido A La Creacion De Tu Empresa");
    System.out.println("1.-Crear persona");
    System.out.println("2.-Registrar trabajador en empresa");
    System.out.println("3.-Mostrar información general de la empresa");
    System.out.println("4.-Mostrar el número de trabajadores actuales");
    System.out.println("5.-Mostrar información de todos los trabajadores");
    System.out.println("6.-Eliminar trabajador de la empresa");
    System.out.println("7.-Eliminar persona del programa");
    System.out.println("8.-SALIR");
    entrada.nextLine();

    switch (opcion){
        case "1":
            System.out.println(Empresa1.CrearTrabajador(null));
            break;

        case "2":
            System.out.println(Empresa1.RegistrarTrabajador(null));
            break;
        
        case "3":
            System.out.println(Empresa1.mostrarInfoEmpresa());
            break;
        case "5":
            System.out.println(Empresa1.mostrarInfoTrabajador());
            break;
        case "6":
            System.out.println(Empresa1.eliminarTrabajador(null));
            break;

        }
    
    }
    while(!opcion.equals("8"));
    entrada.close();

    }
}