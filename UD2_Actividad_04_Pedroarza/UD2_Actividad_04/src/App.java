import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

//Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.

    Scanner in = new Scanner(System.in);

    int[] vector = new int [10];
        

    System.out.println("Introduce deiz numeros");

        for (int i = 0 ; i < vector.length ; i++){
        vector [i] = in.nextInt();
        }

    System.out.println("los numeros son ");
        
        for (int i= 0;i<vector.length; i++){
        System.out.println(vector [i]+"");
        }

//Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores

        in = new Scanner(System.in);

        int[] vector1 = new int [10];

         int suma=0;
                    
        System.out.println("intoduce diez numeros");

        for ( int i = 0 ; i < vector1.length ; i++){
            vector1 [i] = in.nextInt();
        }

        for(int i = 0; i < vector1.length; i++){
            suma += vector1[i];
        }

        System.out.println("la suma es:" + suma);

//Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

    in = new Scanner(System.in);

    int[] vector2 = new int [10];

    double maximo = vector2[0];

    double minimo = vector2[0];
            
    System.out.println("intoduce diez numeros");

    for ( int i = 0 ; i < vector2.length ; i++){
    vector2 [i] = in.nextInt();
    }
    
    for(int i = 0; i < vector2.length; i++){

        maximo = Math.max(maximo, vector2[i]);
        minimo = Math.min(minimo, vector2[i]);
    }

    System.out.println("El número máximo es: " + maximo);

    System.out.println("El número mínimo es: " + minimo);	

//. Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.

    in = new Scanner(System.in);

    int[] vector3 = new int [20];

    int negativos = 0;

    int positivos = 0;
            
    System.out.println("intoduce veinte numeros");

    for ( int i = 0 ; i < vector3.length ; i++){
    vector3 [i] = in.nextInt();
    }

    for(int i = 0; i <= vector3.length; i++){
        vector3 [i] = in.nextInt();

        if(vector3 [i] >= 0){
            positivos++;
        }else if (vector3 [i] <= 0){
            negativos++;
        }
        
    }
    System.out.println(negativos + positivos);

//Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores
    in = new Scanner(System.in);

    int[] vector4 = new int [20];

    int suma2 = 0;

    System.out.println("intoduce veinte numeros");

        for ( int i = 0 ; i < vector4.length ; i++){
        vector4 [i] = in.nextInt();
        }

        for ( int i = 0 ; i < vector4.length; i++){
            suma2 += vector4 [i];
        }
        System.out.println("la media es" + (suma2 / vector4.length));


}
}