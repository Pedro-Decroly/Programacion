import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
    // Ejercicio1
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena de texto:");

        String texto = scanner.nextLine();
   
        String [] palabras = texto.split(" ");

        String mitexto = texto.substring(1, texto.length());

        int aes = 0; 
   
        String texAux = texto.replaceAll(" ", "");
       
        texAux = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            char z = texto.charAt(texto.length() - 1);

        
            if(c > 97 && c <=122){
                aes++;
            }
            
        }
        for(String palabra : texto.split(" "))
        {
            System.out.println(palabra);
        }

    //Ejercicio2

    
        scanner = new Scanner(System.in);
            
        
        System.out.println("Introduce la primera cadena de texto:");
        String texto1 = scanner.nextLine();
        
        
        System.out.println("Introduce la segunda cadena de texto:");
        String texto2 = scanner.nextLine();
        
        
        if (texto1.equals(texto2)) {
            System.out.println("Las cadenas son exactamente iguales");
        } else {
            System.out.println("Las cadenas NO son exactamente iguales");
        }
        
        
        if (texto1.equalsIgnoreCase(texto2)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Las cadenas NO son iguales ");
        }
   
   //Ejercicio3
        scanner = new Scanner(System.in);
        
        System.out.print("Introduce el nombre: ");
            String nombre = scanner.nextLine();
        
        System.out.print("Introduce el primer apellido: ");
            String apellido1 = scanner.nextLine();
        
        System.out.print("Introduce el segundo apellido: ");
            String apellido2 = scanner.nextLine();
        
       
        String codigo = (nombre.substring(0, 3) + 
                        apellido1.substring(0, 3) + 
                        apellido2.substring(0, 3)).toUpperCase();
        
        System.out.println("Tu código de usuario es: " + codigo);
   
    //Ejercicio4  

        scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine().toLowerCase();

        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;

        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                switch (c) {
                    case 'a':
                        aCount++;
                        break;
                    case 'e':
                        eCount++;
                        break;
                    case 'i':
                        iCount++;
                        break;
                    case 'o':
                        oCount++;
                        break;
                    case 'u':
                        uCount++;
                        break;
                }
            }
        }

        System.out.println("Conteo de vocales:");
        System.out.println("a: " + aCount);
        System.out.println("e: " + eCount);
        System.out.println("i: " + iCount);
        System.out.println("o: " + oCount);
        System.out.println("u: " + uCount);

        
    //Ejercicio5
   






    }
}
