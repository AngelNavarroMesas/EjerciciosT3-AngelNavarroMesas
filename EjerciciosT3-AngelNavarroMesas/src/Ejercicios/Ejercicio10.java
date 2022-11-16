package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, aux, mun=0, dig;
		
		System.out.println("introduzca un numero para ver si es capicuo");
		num = sc.nextInt();
		
		aux=num;
		
		while(aux!=0) {
			
			dig=aux%10;
			mun=mun*10+dig;
			aux/=10;
			
		}
		
		System.out.println(mun);
		
		if(num==mun) {
			System.out.println("El numero introducido es capicuo");
		}else {
			System.out.println("El numero introducido no es capicuo");
		}
		
		sc.close();
	}

}
