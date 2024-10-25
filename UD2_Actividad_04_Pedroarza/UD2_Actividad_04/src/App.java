import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

//1 Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores.

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

//2 Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego muestre la suma de todos los valores

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

//3 Crea un programa que pida diez números reales por teclado, los almacene en un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por pantalla.

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

//.4 Crea un programa que pida veinte números enteros por teclado, los almacene en un array y luego muestre por separado la suma de todos los valores positivos y negativos.

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

//5 Crea un programa que pida veinte números reales por teclado, los almacene en un array y luego lo recorra para calcular y mostrar la media: (suma de valores) / nº de valores

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
//6 Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N, escriba M en todas sus posiciones y lo muestre por pantalla
    
    in = new Scanner(System.in);

    int N;

    int M;

    N = in.nextInt();

    System.out.println("intoduce el valor N");
    
    M = in.nextInt();

    System.out.println("intoduce el valor M");

    int[] vector5 = new int[N];

    for ( int i = 0 ; i < vector5.length; i++){
        M += vector5 [N];
    }
//7 Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga todos los valores desde P hasta Q, y lo muestre por pantalla.

    in = new Scanner(System.in);

    int Q;

    int P;

    Q = in.nextInt();

    System.out.println("intoduce el valor Q");
    
    P = in.nextInt();

    System.out.println("intoduce el valor P");

    int[] vector6 = new int[Q];

    for ( int i = 0 ; i < vector6.length; i++){
        Q += vector6 [P];
    }

//8 Crea un programa que cree un array con 100 números reales aleatorios entre 0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará cuántos valores del array son igual o superiores a R.

    int contador = 0;

    double[] numeros = new double[100];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = Math.random();
    }

    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduce un número entre 0.0 y 1.0: ");

    double R = scanner.nextDouble();

    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] >= R) {
            contador++;
        }
    }

    System.out.println("Hay " + contador + " números mayores o iguales a " + R);

//9 Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y mostrará en qué posiciones del array aparece N.


    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = (int)(1 + Math.random() * 10);
    }

    in = new Scanner(System.in);

    System.out.print("Introduce un número entre 1 y 10: ");
    int O = scanner.nextInt();

    System.out.println("El número " + O + " aparece en las posiciones:");
    boolean encontrado = false;

    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] == O) {
            System.out.println("Posición " + i);
            encontrado = true;
        }
    }

    if (!encontrado) {
        System.out.println("El número no se encuentra en el array");
    }

//10Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas. Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego mostrará la altura media, máxima y mínima, así como cuántas personas miden por encima y por debajo de la media.

    in = new Scanner(System.in);
    double suma3 = 0, media, max, min;
    int personasArriba = 0, personasAbajo = 0;


    System.out.print("Introduce el número de personas: ");
    int S = scanner.nextInt();

    double[] alturas = new double[S];

    for (int i = 0; i < S; i++) {
        System.out.print("Introduce la altura de la persona " + (i+1) + " (en metros): ");
        alturas[i] = scanner.nextDouble();
        suma += alturas[i];
    }

    media = suma / S;


    max = alturas[0];
    min = alturas[0];


    for (int i = 0; i < S; i++) {
        if (alturas[i] > max) {
            max = alturas[i];
        }
        if (alturas[i] < min) {
            min = alturas[i];
        }
        if (alturas[i] > media) {
            personasArriba++;
        } else if (alturas[i] < media) {
            personasAbajo++;
        }
    }


    System.out.println("Resultados:");
    System.out.printf("Altura media:", media);
    System.out.printf("Altura maxima:", max);
    System.out.printf("Altura minima:", min);
    System.out.println("Personas por encima de la media: " + personasArriba);
    System.out.println("Personas por debajo de la media: " + personasAbajo);


//11. Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del primer array al segundo array en orden inverso, y mostrar ambos por pantalla.

    double[] array = new double[100];
    double[] array1 = new double[100];  

    for (int i = 0; i < array1.length; i++) {
        array1 [i] = i + 1;
    }

    System.arraycopy(array1, 0, array, 0, array1.length);

//12 Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú.

    //EJERCICIO12
        
    String [] clientes = new String [10];
		
    String opcion = reader.nextLine();;
    
    
    do {
        System.out.println("a - mostrar valores");
        
        System.out.println("b - introducir valor");
        
        System.out.println("c - salir");
        
        
        
        
         if(opcion.equals("a")){
             
             for(int i = 0; i < clientes.length; i++) {
                 
                 System.out.println(clientes[i]);
                 
             }
             
            }
         
            else if(opcion.equals("b")){
            
                 System.out.print("Introduce la posición (0-9): ");
                 
                 int posicion = reader.nextInt();
                 
                 System.out.print("Introduce el valor: ");
                 
                 String valor = reader.toString();

                 
                 if (posicion >= 0 && posicion < clientes.length) {
                     
                     clientes[posicion] = valor;
                     
                     System.out.println("Valor " + valor + " introducido en la posición " + posicion);
                     
                 }else {
                     
                     System.out.println("posicion no valida");	                 }
                
            }
         

            else if(opcion.equals("c")){
            
                System.out.println("adios.");
                
            }
         
            else{

                System.out.println("la opcion no es coorecta.");
                
            }
        
    }while(!opcion.equals("c"));
    
    

    //EJERCICIO 13
    
    System.out.print("introduce el valor V: ");
    int V = scanner.nextInt();

    System.out.print("introduce el valor I: ");
    int I = scanner.nextInt();

    System.out.print("introduce el valor N: ");
    int K = scanner.nextInt();

    
    int[] secuencia = new int[K];

    
    for (int i = 0; i < ; i++) {
        secuencia[i] = V + (i * I);
    }

    
    System.out.println("La secuencia es:");
    
    for (int num : secuencia) {
        
        System.out.print(num + " ");
        
    }
    
    //EJERCICIO 14
    
    int[] secval = new int[55];
     
    int C = 0;

    
    for (int i = 1; i <= 10; i++) {
        
        for (int j = 0; j < i; j++) {
            
            secval[C] = i;
            
            C++;
            
        }
    }

    
    for (int numero : secval) {
        
        System.out.print(numero);
        
    }

    }
}
