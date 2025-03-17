import java.util.Scanner;

	public class App 
{
		@SuppressWarnings("resource")
		public static void main(String[] args) throws Exception {
			System.out.println("Hello, World!");
		//1. Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo somos.

			int num;
			Scanner SC = new Scanner(System.in);
			System.out.println("Introduzca su Edad:");
			num = SC.nextInt();
			
			if (num >=18){
				
				System.out.println("Eres mayor de edad");
			}
			
	//2 Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje de “eres menor de edad”.
			
			
			int num1;
			SC = new Scanner(System.in);
			System.out.println("Introduzca su Edad:");
			num1 = SC.nextInt();
			
			if (num1 >=18)
				
				System.out.println("Eres mayor de edad");
				
				else 
				System.out.println("Eres menor de edad");
			
	//3 . Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
			
			
			int cont;
			
			for (cont=1;cont<=20;cont++)
					System.out.print(cont + " ");
			
			System.out.print("\n");
		
	//4. Realiza un programa que muestre los números pares comprendidos entre el 1 y el 200. Para ello utiliza un contador y suma de 2 en 2.
			
			int cont1;
			for (cont1 = 0;cont1 <=200;cont1+=2){
				System.out.print(cont1 + " ");
				
				System.out.print("\n");	
		}
    }
}
