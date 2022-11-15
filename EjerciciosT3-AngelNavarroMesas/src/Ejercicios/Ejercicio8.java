package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=0, num2,  total=0, fallos=0;
		
		System.out.println("Introduzca un numero inicial");
		num2 = sc.nextInt();
		
		total++;
		
		while(true) {
			
			if(num2==0) {
				break;
			}else if(num2>num) {
				num=num2;
				
			}else if(num2<num) {
				fallos++;
				System.out.println("Fallaste");
				
			}else if(num==0) {
				break;
				
			}
			
			
			System.out.println("Dime un numero");
			num2 = sc.nextInt();
			
			total++;
		}
		
		System.out.println("Total de numeros introducidos: "+(total-1));
		System.out.println("Numeros fallados: "+fallos);
		
		sc.close();
	}

}
