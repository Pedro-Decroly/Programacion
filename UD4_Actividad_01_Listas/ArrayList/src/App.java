import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();
        
// 1 y 3. Crear 5 instancias de Producto y añadirlas al ArrayList
        System.out.println("Introduce 5 productos:");
        for(int i = 0; i < 5; i++) {
            System.out.println("Producto " + (i+1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Cantidad: ");
            int cantidad = Integer.parseInt(sc.nextLine());
            
            productos.add(new Producto(nombre, cantidad));
        }
        
// 4. Visualizar contenido con Iterator
        System.out.println("Lista original:");
        Iterator<Producto> it = productos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
// 5. Eliminar dos elementos
        System.out.println("Eliminando los productos en posición 0 y 1...");
        productos.remove(0);
        productos.remove(1);
        
// 6. Insertar nuevo producto en medio de la lista
        System.out.println("Introduce un nuevo producto para insertar en medio:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cantidad: ");
        int cantidad = Integer.parseInt(sc.nextLine());
        
        Producto nuevoProducto = new Producto(nombre, cantidad);
        productos.add(1, nuevoProducto);
        
// 7. Visualizar contenido actualizado
        System.out.println("Lista después de modificaciones:");
        it = productos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
// 8. Ordenar la lista por nombre
        Collections.sort(productos);
        
        System.out.println("nLista ordenada por nombre:");
        it = productos.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
// 9. Eliminar todos los valores
        productos.clear();
        
        System.out.println("Tamaño de la lista después de clear(): " + productos.size());
        
        sc.close();
    }
}

