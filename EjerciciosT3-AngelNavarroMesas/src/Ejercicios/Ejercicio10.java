package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, mun, dec=10, dig=0, y=1;
		
		System.out.println("introduzca un numero para ver si es capicuo");
		num = sc.nextInt();
		
		while(num!=0) {
			num/=10;
			dig++;
		}
		
		for(int i=dig;i<num;i++) {
			
			dig = num%dec;
			dig=dig/y;
			
		}
		
		sc.close();
	}

}
