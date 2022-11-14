package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, mcm=0, mul;
		
		System.out.println("Introduzca dos numeros para averiguar su maximo comun divisor");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			mul=a;
		}else {
			mul=b;
		}
		
		while(true) {
			
			if(a%mul==0&&b%mul==0) {
				mcm=mul;
				break;
			}
			
			mul++;
			
		}
		
		System.out.println("El minimo comun multiplo de "+a+ " y "+b+" es "+mcm);
		
		
		sc.close();
	}

}
