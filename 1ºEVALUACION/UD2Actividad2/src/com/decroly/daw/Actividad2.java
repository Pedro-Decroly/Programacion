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
int numero;
        
do {
	System.out.print("Introduce un número positivo: ");
	numero =  SC.nextInt();
	
	if (numero < 0) {
		System.out.println("El número debe ser positivo");
	}
} while (numero < 0);


for (int i = 1; i <= numero; i++);


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

		if (min>=60 ){
			hora ++ ;
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
			while(num==0){
				System.out.println("Insete numero ");	
				nota = SC.nextInt();	
		}
		}
			if(num < 0){ 
			haynegativos=true;
			contador ++;
		}
	
	
			if (haynegativos == true) {
			System.out.println("Hay un negativo ");
		
			}
			
//11. Realiza un programa que lea 10 números no nulos y luego muestre un mensaje indicando cuántos son positivos y cuantos negativos.

			boolean haynegativos1 = false;
			int positivos = 0;
			int negativos = 0;
			int	contador1 = 0;
		while(contador1 < 10){
			System.out.println("Insete numero ");	
			nota = SC.nextInt();
			positivos ++;
		while(num1==0){
			System.out.println("Insete numero ");	
			nota = SC.nextInt();	
		}
		}
			if(num1 < 0){ 
			haynegativos1=true;
			negativos ++;
			
		}
	
		contador1 ++;

			if (haynegativos1 == true) {
			System.out.println("Hay un negativo ");
		
			}
			System.out.println(positivos);
			System.out.println (negativos);
			

//12. Realiza un programa que lea una secuencia de números no nulos hasta que se introduzca un 0, y luego muestre si ha leído algún número negativo, cuantos positivos y cuantos negativos.

		boolean haynegativos2 = false;
		int positivos1 = 0;
		int negativos1 = 0;
		int	contador2 = 0;
		int numero2 = 0;

		do {
			System.out.println("Numero");
			numero2 = SC.nextInt();
			positivos1 ++;

			if (numero2 <0){
				haynegativos2 = true;
				negativos1 ++;
			}
			contador2 ++;
		}while (numero2 != 0);

		if (haynegativos2 == true){
			System.out.println("hay numeros negativos");
		}
			System.out.println(positivos1);
			System.out.println(negativos1);

//13. Realiza un programa que calcule y escriba la suma y el producto de los 10 primeros números naturales.

		System.out.println("suma de los 10 primeros");
			int suma = 1+2+3+4+5+6+7+8+9+10;
				System.out.println(suma);

		System.out.println("el resultado de los 10");
			int resultado =1+2+3+4+5+6+7+8+9+10;
				System.out.println(resultado);

//14. Escribe un programa que calcula el salario neto semanal de un trabajador en función del
// número de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
// • Las primeras 35 horas se pagan a tarifa normal.
// • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
// • Las tasas de impuestos son:
// • Los primeros 500 euros son libres de impuestos.
// • Los siguientes 400 tienen un 25% de impuestos.
// • Los restantes un 45% de impuestos.
// Escribir nombre, salario bruto, tasas y salario neto.

Scanner scanner = new Scanner(System.in);
String nombre;
double horasTrabajadas, tarifaNormal;

System.out.print("Introduce el nombre del trabajador: ");
nombre = scanner.nextLine();

do {
	System.out.print("Introduce las horas trabajadas: ");
	horasTrabajadas = scanner.nextDouble();
} while (horasTrabajadas < 0);

do {
	System.out.print("Introduce la tarifa normal por hora: ");
	tarifaNormal = scanner.nextDouble();
} while (tarifaNormal < 0);


double salarioBruto = 0;
if (horasTrabajadas <= 35) {
	salarioBruto = horasTrabajadas * tarifaNormal;
} else {
	salarioBruto = (35 * tarifaNormal) + ((horasTrabajadas - 35) * tarifaNormal * 1.5);
}


double impuestos = 0;
if (salarioBruto > 900) {
	impuestos = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
} else if (salarioBruto > 500) {
	impuestos = ((salarioBruto - 500) * 0.25);
}


double salarioNeto = salarioBruto - impuestos;

System.out.println("\nResumen de salario para: " + nombre);
System.out.println("Salario bruto: " + salarioBruto + " euros");
System.out.println("Impuestos: " + impuestos + " euros");
System.out.println("Salario neto: " + salarioNeto + " euros");
	





	}

}
