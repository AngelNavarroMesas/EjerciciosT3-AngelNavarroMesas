package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, lad;
		
		System.out.println("Introduzca un numero que sera la base y la altura del triangulo");
		num = sc.nextInt();
		
		
		for(int i=0;i<num;i++) {
			
			lad=1;
			
			for(int x=0;x<=i;x++) {
				System.out.print(lad);
				lad++;
				
			}
			lad--;
			for(int y=0;y<i;y++) {
				lad--;
				System.out.print(lad);
				
			}
			System.out.println();
			
		}
		
		
		
		sc.close();
		
	}

}
