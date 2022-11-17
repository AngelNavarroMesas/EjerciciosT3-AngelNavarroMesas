package Ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos variables
		int num, aux, mun=0, dig;
		
		//Le pedimos al usuario que introduzca un numero y lo escaneamos
		System.out.println("introduzca un numero para ver si es capicuo");
		num = sc.nextInt();
		
		//Le damos al numero auxiliar el valor del numero
		aux=num;
		
		//Este bucle se ejecutara hasta que el numero auxiliar sea 0
		while(aux!=0) {
			
			//Esta operacion saca el ultimo digito del numero auxiliar
			dig=aux%10;
			//Esta operacion le pone la cifra a mun haciendo que se forme el numero al reves
			mun=mun*10+dig;
			//Aqui vamos dividiendo el numero auxiliar entre diez hasta llegar a 0
			aux/=10;
			
		}
		
		//Mostramos el numero al reves
		System.out.println(mun);
		
		//Si el numero introducido y el numero invertido son iguales se le indica al usuario que el numero es capicuo
		if(num==mun) {
			System.out.println("El numero introducido es capicuo");
			//Si no son iguales se le indica al usuario que no es capicuo
		}else {
			System.out.println("El numero introducido no es capicuo");
		}
		
		sc.close();
	}

}
