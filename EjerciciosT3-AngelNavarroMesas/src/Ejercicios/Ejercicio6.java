package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, lad=0;
		
		System.out.println("Introduzca un numero que sera la base y la altura del triangulo");
		num = sc.nextInt();
		
		if(num>=1&&num<=20) {
		
			for(int i=0;i<=num;i++) {
				
				for(int x=0;x<i;x++) {
					System.out.print(lad);
				}
				System.out.println();
				lad++;
			}
		}else {
			System.out.println("El numero debe ser un numero entre 1 y 20");
		}
		
		
		sc.close();
	}

}
