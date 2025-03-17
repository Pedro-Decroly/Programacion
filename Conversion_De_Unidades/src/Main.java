import java.io.*;
import java.util.Scanner;
public class Main{
    public static void main( String args[] ){
        String opcion = "";

        int KM;
        int CM;
        int Y;
        int op;
        double RES;

        do{
        Scanner leer = new Scanner(System.in);

        System.out.println( "Ingrese la operacion" );
        System.out.println( "1.- Centimetos a pulgadas" );
        System.out.println( "2.- Yardas a metros" );
        System.out.println( "3.- Kilometros a millas" );
        System.out.println( "\n" );
        op = leer.nextInt();

        switch (op){
            case 1:
                System.out.println( "Centimetros a pulgadas" );
                System.out.println( "Ingrese los centimetros" );
                CM = leer.nextInt();
                RES = CM * 2.3;
                System.out.println( "El resultado es: "+RES+" pulgadas" );
                break;
            case 2:
                System.out.println( "Yardas a Metros" );
                System.out.println( "Ingrese el numero de Yardas" );
                Y = leer.nextInt();
                RES = Y * 0.914401829;
                System.out.println( "El resultado es: "+RES+" metros" );
                break;
            case 3:
                System.out.println( "Kilometros a Millas" );
                System.out.println( "Ingrese el numero de Kilometros" );
                KM = leer.nextInt();
                RES = KM * 0.621;
                System.out.println( "El resultado es: "+RES+" millas" );
                break;
        }
        }while(!opcion.equals("5"));

    }
}