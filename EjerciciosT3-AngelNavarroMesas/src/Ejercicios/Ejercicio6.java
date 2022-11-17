package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num, lad=0;
		
		//Le pedimos al usuario que introduzca un numero para construir la piramide y lo escaneamos
		System.out.println("Introduzca un numero entre 1 y 20 que sera la base y la altura del triangulo");
		num = sc.nextInt();
		
		//Este if comprueba si el numero esta entre 1 y 20
		if(num>=1&&num<=20) {
		//Si el numero esta entre 1 y 20 se crea la piramide
			
			//Este for es el encargado de hacer la separacion de filas
			for(int i=0;i<=num;i++) {
				//Este for crea las lineas que rellenan la piramide
				for(int x=0;x<i;x++) {
					System.out.print(lad);
				}
				//Despues de que la fila se termine de rellenar se hae un salto de linea y se le suma 1 a lad
				System.out.println();
				lad++;
			}
			//Si el numero introducido no esta entre 1 y 20 se le indica al usuario su error
		}else {
			System.out.println("El numero debe ser un numero entre 1 y 20");
		}
		
		
		sc.close();
	}

}
