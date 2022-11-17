package Ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num, lad=1;
		
		//Le pedimos al usuario que introduzca un numero y lo escaneamos
		System.out.println("Introduzca un numero que sera la base y la altura del triangulo");
		num = sc.nextInt();
		
		//Este for se encarga de hacer la separacion entre filas
		for(int i=0;i<num;i++) {
			
			//Este for escribe la primera mitad de las filas
			for(int x=0;x<=i;x++) {
				System.out.print(lad);
				lad++;
				
			}
			lad--;
			
			//Este for escribe la segunda mitad de las filas
			for(int y=0;y<i;y++) {
				lad--;
				System.out.print(lad);
				
			}
			System.out.println();
			
		}
		
		
		
		sc.close();
		
	}

}
