import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

    //Actividad1

        int [] [] miMatriz = new int [5] [5];
        
        for (int i = 0; i < miMatriz.length; i++) {
            System.out.println(miMatriz[i]);
                }

        System.out.println("la matriz es" + miMatriz);

    //Actividad2

        int [] [] miMatriz1 = new int [10] [10];
            
        for (int i = 0; i < 10; i++) {
            System.out.println(miMatriz1[i]);
                }

        System.out.println("la matriz es" + miMatriz1);
    
    //Actividad3
        
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        
        int M = in.nextInt();
        
        int [] [] miMatriz2 = new int [N] [M];

        
        System.out.println("Intruduce un valor a N");
        System.out.println("Intruduce un valor a M");

        
            
            for (int i = 0; i < miMatriz2.length; i++) {
                System.out.println(miMatriz2[i]);
                    }

            System.out.println("la matriz es" + miMatriz2);
        

    }
}
