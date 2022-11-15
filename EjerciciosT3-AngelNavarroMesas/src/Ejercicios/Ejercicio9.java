package Ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, dig=0;
		
		System.out.println("Introduzca un numero para averiguar sus cifras");
		num = sc.nextInt();
		
		if(num<=0) {
			System.out.println("El numero introducido debe ser mayor que 0");
		}else {
			while(num!=0) {
				num/=10;
				dig++;
			}
		}
		System.out.println("El numero introduido tiene "+dig+" digitos");
		
		sc.close();
	}

}
