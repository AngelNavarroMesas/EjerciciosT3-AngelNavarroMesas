package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int a, b, mcd=0, div=1;
		
		//Le pedimos al usuario que introduzca dos numeros para calcular el maximo comun divisor y los escaneamos
		System.out.println("Introduzca dos numeros para averiguar su maximo comun divisor");
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		while(true) {
			
			if(a%div==0&&b%div==0) {
				mcd=div;
			}if(div>a&&div>b) {
				break;
			}
			
			div++;
			
		}
		
		
		System.out.println("El maximo comun divisor de "+a+ " y "+b+" es "+mcd);
		
		sc.close();
	}

}
