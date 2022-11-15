package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, mcm=0, mul;
		
		System.out.println("Introduzca dos numeros para averiguar su minimo comun multiplo");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if(a>b) {
			mul=a;
		}else {
			mul=b;
		}
		
		while(true) {
			
			if(mul%a==0&&mul%b==0) {
				mcm=mul;
				break;
			}
			
			mul++;
			
		}
		
		System.out.println("El minimo comun multiplo de "+a+ " y "+b+" es "+mcm);
		
		
		sc.close();
	}

}
