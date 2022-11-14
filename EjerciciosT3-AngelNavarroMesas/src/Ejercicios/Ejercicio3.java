package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Introduzca un numero que sera la base y la altura del triangulo");
		n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			for(int y=n;y>i;y--) {
				System.out.print(" ");
			}
			for(int x=0;x<i;x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
