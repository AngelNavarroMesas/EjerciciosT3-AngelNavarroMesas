package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la variable
		int n;
		
		//Le pedimos al usuario que introduzca un numero y lo escaneamos
		System.out.println("Introduzca un numero que sera la base y la altura del triangulo");
		n = sc.nextInt();
		
		//Este bucle for se encargara de hacer el salto de linea una vez que se haya dibujado
		for(int i=0;i<=n;i++) {
			//Este for se encarga de hacer un espacio para darle forma al triangulo
			for(int y=n;y>i;y--) {
				System.out.print(" ");
			}
			//Este for imprime el triangulo
			for(int x=0;x<i;x++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		sc.close();
	}

}
