package com.decroly.daw;

import java.util.Scanner;

public class Actividad2 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//TODO Auto-generated method stub
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
		
//5	Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado.
		
	int cont2;
		for (cont2 = 0;cont2 <=200;cont2+=1){
			if (cont2 % 2 == 0){
				System.out.println(cont2);	
	}
	}		
		
//6 Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá por teclado
		
	SC = new Scanner(System.in);
	int max;
	System.out.println("Introduzca un numero:");
    max = SC.nextInt();   
	for (int N = 1; N <= max; N++){
		System.out.println("Numero: " + N);
	}

//7 Escribe un programa que lea una calificación numérica entre 0 y 10 y la transforma en calificación alfabética, escribiendo el resultado.

	int nota;
	SC = new Scanner(System.in);
	System.out.println("Dame un número entre 0 y 10");	
	nota = SC.nextInt();

	if (nota <5){
		System.out.println("Insuficiente");
	} else if (nota<6) {
		System.out.println("Suficiente");
	}else if (nota<7) {
		System.out.println("bien");
	}else if (nota<9) {
		System.out.println("Notable");
	}else {
		System.out.println("Sobresaliente");
	}

	
//8. Realiza un programa que lea un número positivo N y calcule y visualice su factorial N! Siendo el factorial:


/*9. Escribe un programa que recibe como datos de entrada una hora expresada en horas, minutos y segundos que nos 
calcula y escribe la hora, minutos y segundos que serán, transcurrido un segundo. */

	int seg,min,hora;

	SC = new Scanner(System.in);
	System.err.println("Introduce las Horas");
	hora = SC.nextInt();

	System.err.println("Introduce las Minutos");
	min = SC.nextInt();

	System.err.println("Introduce las Segundos");
	seg = SC.nextInt();
	seg ++;

	if (seg>=60){
		min ++;
		seg = 0;

	if (min>=60){
		hora ++;
		min = 0;
	}
	}
	System.out.println(hora);
	System.out.println(min);
	System.out.println(seg);	
//10. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje de si ha leído algún número negativo o no

	boolean haynegativos = false;
	int	contador = 0;
	while(contador < 10){
		System.out.println("Insete numero ");	
		nota = SC.nextInt();
		while(num==0);
		SC = new Scanner(System.in);
		}
			if(num<0){ 
			haynegativos=true;
		}
		contador ++;
	
			if (haynegativos == true) {
			System.out.println("Hay un negativo ");		
			}
			
		
	


	





	}

}
