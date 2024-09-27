package com.decroly.daw;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1ºEscribe un programa que dé los “buenos días
		
System.out.println("BUENOS DIAS");
// 2º Escribe un programa que calcule y muestre el área de un cuadrado de lado igual a 5.
int lado1 = 5;
int lado2 = 5;
System.out.println("El área del cuadrado de lado es: " + (lado1 * lado2));
// 3ºEscribe un programa que calcule el área de un cuadrado cuyo lado se introduce por teclado.
	double lado, area;
	Scanner entrada = new Scanner (System.in);
	System.out.println("INTRODUCE EL LADO:");
	lado = entrada.nextDouble();
	area = lado * lado;
	
   
System.out.println("El área es " + area);
//4 Escribe un programa que lea dos números, calcule y muestre el valor de sus suma, resta, producto y división.
	entrada = new Scanner (System.in);
	
	System.out.println("INTRODUCE UN NUMERO:");
		double numero1 = entrada.nextDouble();
		
	System.out.println("INTRODUCE UN NUMERO:");
		double numero2 = entrada.nextDouble();
		
	System.out.println("La Suma es:" + (numero1 + numero2));
	
	System.out.println("La Resta es:" + (numero1 - numero2));
	
	System.out.println("El Producto es:" + (numero1 * numero2));
	
	System.out.println("La Division es:" + (numero1 / numero2));
	
//5 Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio y nos escribe la longitud de la circunferencia, el,
//área del círculo y el volumen de la esfera que corresponden con dicho radio.
	double longitud, area1 ,volumen,radio;
	
	entrada = new Scanner (System.in);
	
	System.out.println("Introduce el radio:");
		radio = entrada.nextDouble();
	
	longitud = 2 * Math.PI * radio;
	
	area1 = Math.PI * Math.pow(radio, 2);
	
	volumen = 4/3 * Math.PI * Math.pow(radio, 3);
	
	System.out.println("La longitud es:" + longitud);
	
	System.out.println("El area es:" + area1);
	
	System.out.println("El volumen es:" + volumen);
//6 Escribe un programa que dado el precio de un artículo y el precio de venta real nos muestre el porcentaje de descuento realizado.
	
	double Descuento;
	
	entrada = new Scanner (System.in);
	
	System.out.println("INTRODUCE PRECIO DEL ARTICULO:");
	
	double numero4 = entrada.nextDouble();
		
	System.out.println("INTRODUCE PRECIO DE VENTA:");
	
	double numero5 = entrada.nextDouble();
	
	Descuento = numero4/numero5*100;
	
	System.out.println(Descuento + "%");
	
//7 Escribe un programa que lea un valor correspondiente a una distancia en millas marinas y escriba la distancia en metros. Sabiendo que una milla marina equivale a 1.852 metros
	Scanner in = new Scanner(System.in);
	
    double metros, millas_marinas;
    
    System.out.print("Ingresa el valor de millas marinas: ");
    
    millas_marinas = in.nextDouble();
    
    in.nextLine();
    
    metros=millas_marinas*1852;
    
    System.out.println("Valor de metros: " + metros);
//8 Escribe un programa que lee dos números y los visualiza en orden ascendente
    

    entrada = new Scanner (System.in);
	
	System.out.println("INTRODUCE UN NUMERO:");
		double numero7 = entrada.nextDouble();
		
	System.out.println("INTRODUCE UN NUMERO:");
		double numero8 = entrada.nextDouble();
		
		double menor = Math.min(numero7, numero8);
        double mayor = Math.max(numero7, numero8);
        
		 System.out.println("Los números en orden ascendente son:");
	        System.out.println(menor);
	        System.out.println(mayor);

//9. Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales

	        
	
	}
}