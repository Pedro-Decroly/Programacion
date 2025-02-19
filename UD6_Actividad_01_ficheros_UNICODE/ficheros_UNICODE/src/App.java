import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    
        public static void main(String[] args) {
            File nombreFichero = new File("./resources/Almacen.dat");
            LinkedList <Producto> almacenproducto = new  LinkedList <Producto>(); 
            String opcion = "";
            
    
            do{ 
                Scanner reader = new Scanner(System.in);
                System.out.println("Bienvenido al almacen!!");
                System.out.println("1 - Crear producto");
                System.out.println("2 - Mostrar productos existentes\r");
                System.out.println("3 - Eliminar producto por código");
                System.out.println("4 - Guardar productos en el fichero.");
                System.out.println("5 - Salir");
                opcion = reader.nextLine();
                switch(opcion)
                {
                    case "1":
                    reader = new Scanner(System.in);

                System.out.println("Introduce nombre del producto");
                    String nombre = reader.nextLine();

                System.out.println("Introduce cantidad");
                    int cantidad = reader.nextInt();

                System.out.println("Introduce el precio del producto");
                    int precio = reader.nextInt();

                    Producto producto = new Producto(cantidad, nombre, precio);
                    almacenproducto.add(producto);
        

                        break;
                    case "2":
                    System.out.println("Estos son tus productos");
                    for(int i = 0; i<almacenproducto.size();i++){
                        System.out.println(almacenproducto.get(i).toString());
                    }
                        break;
                    case "3":
                        System.out.println("Introduce el codigo");
                        int codigo = reader.nextInt();

                        Producto ProductoEliminar = null;

                        for( Producto p1 : almacenproducto){
                            if (p1.getCodigo() == codigo){
                                ProductoEliminar = p1;
                            }
                        }
                    almacenproducto.remove(ProductoEliminar);
                    System.out.println("El producto ah sido eliminado correctamente");
                    break;

                    case "4":
           
        
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
