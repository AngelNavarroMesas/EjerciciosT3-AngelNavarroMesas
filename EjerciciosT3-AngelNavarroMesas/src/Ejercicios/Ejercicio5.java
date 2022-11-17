package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int a, b, mcm=0, mul;
		
		//Le pedimos al usuario que introduzca dos numeros y los escaneamos
		System.out.println("Introduzca dos numeros para averiguar su minimo comun multiplo");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//Estos dos if sirven para que la variable mul adopte el valor del numero mas grande
		if(a>b) {
			mul=a;
		}else {
			mul=b;
		}
		
		//Este bucle se ejecutara infinitamente hasta que se ejecute el break
		while(true) {
			
			//Si el resto de la division de mul entre ambos numeros es 0 se ejecutara esye if que actualiza el valor de mcm y termina el bucle
			if(mul%a==0&&mul%b==0) {
				mcm=mul;
				break;
			}
			
			//Al final de cada bucle se suma 1 al mul
			mul++;
			
		}
		
		//Mostramos el resultado final
		System.out.println("El minimo comun multiplo de "+a+ " y "+b+" es "+mcm);
		
		
		sc.close();
	}

}
