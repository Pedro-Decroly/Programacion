import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

//Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.

    Scanner in = new Scanner(System.in);
     int[] vector = new int [10];
        int i;

     System.out.println("Introduce deiz numeros");
        for ( i = 0 ; i < vector.length ; i++)
        vector [i] = in.nextInt();

    System.out.println("los numeros son ");
        
        for (i= 0;i<vector.length; i++)
        System.out.println(vector [i]+"");
        
//Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores

        in = new Scanner(System.in);
        int[] vector1 = new int [10];
        int suma=0;

        System.out.println("Introduce deiz numeros");
        for ( i = 0 ; i < vector1.length ; i++)
        vector1 [i] = in.nextInt();

        System.out.println("la suma es"+suma);
        suma +=vector1[i];
        System.out.println(suma);

//Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

    in = new Scanner(System.in);
        int[] vector2 = new int [10];
        

        System.out.println("Introduce deiz numeros");
            for ( i = 0 ; i < vector2.length ; i++)
            vector2 [i] = in.nextInt();
        
        for ( i = 0 ; i < vector2.length ; i++)
            
    }
}
