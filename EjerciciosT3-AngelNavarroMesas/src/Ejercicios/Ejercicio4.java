package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int a, b, mcd=0, div=1;
		
		//Le pedimos al usuario que introduzca dos numeros para calcular el maximo comun divisor y los escaneamos
		System.out.println("Introduzca dos numeros para averiguar su maximo comun divisor");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//Este bucle se ejecutara infinitamente hasta que se ejecute el break
		while(true) {
			
			//Si el resto de la division de ambos numeros entre div es 0 se ejecutara este if que actualiza el valor de mcd
			if(a%div==0&&b%div==0) {
				mcd=div;
				
				//Cuando div sea mayor que ambos numeros se ejecutara este if que nos sacara del bucle
			}if(div>a&&div>b) {
				break;
			}
			//Al final de cada bucle se le suma 1 a div
			div++;
			
		}
		
		//Se muestra el resultado final
		System.out.println("El maximo comun divisor de "+a+ " y "+b+" es "+mcd);
		
		sc.close();
	}

}
