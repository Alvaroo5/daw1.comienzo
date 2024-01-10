package daw1.comienzo;

import java.util.Scanner;

public class ejercicio44 {

	public static void main(String[] arg) {
		 float num;
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Introduzca un numero decimal:");
		 num = sc.nextFloat();
		 
		 int redondeado = Math.round(num);
		 
		 System.out.println("El numero redondeado es: "+redondeado);
	}
}
