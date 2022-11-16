package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int hora, min, seg, incremento;
		
		//En esta parte del codigo nos dedicamos a pedirle al usuario que introduzca la hora y la escaneamos
		System.out.println("Introduzca la hora");
		hora = sc.nextInt();
		System.out.println();
		
		System.out.println("Introduzca los minutos");
		min = sc.nextInt();
		System.out.println();
		
		System.out.println("Introduzca los segundos");
		seg = sc.nextInt();
		System.out.println();
		
		//Aqui le pedimos al usuario que introduzca cuantos segundos desea incrementar y lo escaneamos
		System.out.println("Introduzca los segundos que desea incrementar");
		incremento = sc.nextInt();
		System.out.println();
		
		//Añadimos los segundos adicionales
		seg+=incremento;
		
		//Este bucle while no dejara de ejecutarse hasta que la variable de los segundos no sea mayor o igual que 60
		while(seg>=60) {
			
			//Si los segundos son mayores o iguales a 60 se le suma 1 a los minutos y se le resta 60 a los segundos
			if(seg>=60){
				min++;
				seg-=60;
			}
			//Si los minutos son mayores o iguales a 60 se le suma 1 a las horas y se le resta 60 a los minutos
			if(min>=60){
				min-=60;
				hora++;
			}
			//Si las horas son mayores o iguales que 24 se les quita 24
			if(hora>=24){
				hora-=24;
			}
		}
		
		
		//Mostramos el resultado final
		System.out.println("Son las "+hora+":"+min+":"+seg);
		
		
		sc.close();
	}

}
