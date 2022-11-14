package Ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hora, min, seg, incremento;
		
		System.out.println("Introduzca la hora");
		hora = sc.nextInt();
		System.out.println();
		
		System.out.println("Introduzca los minutos");
		min = sc.nextInt();
		System.out.println();
		
		System.out.println("Introduzca los segundos");
		seg = sc.nextInt();
		System.out.println();
		
		System.out.println("Introduzca los segundos que desea incrementar");
		incremento = sc.nextInt();
		System.out.println();
		
		seg+=incremento;
		
		while(seg>=60) {
		if(seg>=60){
			min++;
			seg-=60;
		}
		if(min>=60){
			min-=60;
			hora++;
		}
		if(hora>=24){
			hora-=24;
		}
		}
		
		System.out.println("Son las "+hora+":"+min+":"+seg);
		
		
		sc.close();
	}

}
