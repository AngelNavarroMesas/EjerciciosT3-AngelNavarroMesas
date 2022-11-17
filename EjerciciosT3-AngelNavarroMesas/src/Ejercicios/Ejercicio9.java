package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num, dig=0;
		
		//Pedimos al usuario que introduzca un numero y lo escanemaos
		System.out.println("Introduzca un numero para averiguar sus cifras");
		num = sc.nextInt();
		
		//Si el numero es 0 o menor que 0 se le indica al usuario que el numero introducido debe ser mayor que 0
		if(num<=0) {
			System.out.println("El numero introducido debe ser mayor que 0");
		}else {
			//Este bucle va dividiendo el numero introducido entre diez hasta que llega a 0 y cuenta cada loop para saber cuantas cifras tiene el numero
			while(num!=0) {
				num/=10;
				dig++;
			}
		}
		//Mostramos el resultado final
		System.out.println("El numero introduido tiene "+dig+" digitos");
		
		sc.close();
	}

}
