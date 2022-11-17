package Ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num=0, num2,  total=0, fallos=0;
		
		//Le pedimos al usuario que introduzca un numero y lo escaneamos
		System.out.println("Introduzca un numero inicial");
		num2 = sc.nextInt();
		
		//Ya que se ha introducido un numero debemos contarlo
		total++;
		
		//Este bucle se repetira mientras el numero introducido no sea 0
		do {
			
			//Si el numero introducido es 0 se terminara el bucle
			if(num2==0) {
				break;
				//Si el numero introducido es mayor que el anterior se actualizara y se pondra como numero mayor
			}else if(num2>num) {
				num=num2;
				//Si el numero es menor que el anterior se le indicara al usuario y se añadira un fallo
			}else if(num2<num) {
				fallos++;
				System.out.println("Fallaste");
				
			}
			
			//Al final se le pide al usuario que introduzca otro numero para empezar de nuevo el bucle y se escanea
			System.out.println("Dime un numero");
			num2 = sc.nextInt();
			
			//Se añade un intento
			total++;
			
		}while(num!=0);
		
		//Al terminar el bucle se le muestra al usuario los resultados
		System.out.println("Total de numeros introducidos: "+(total-1));
		System.out.println("Numeros fallados: "+fallos);
		
		sc.close();
	}

}
