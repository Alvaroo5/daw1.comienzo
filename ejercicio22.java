package daw1.comienzo;

import java.util.Scanner;

public class ejercicio22 {
	
	public static void main(String[] args) {
		
		float num1;
		float num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un primer numero:");
		num1=sc.nextFloat();
		
		System.out.println("Introduzca un segundo numero:");
		num2=sc.nextFloat();
		
		float resto = num1%num2;
		
		System.out.println("El resto de la division es: " + resto);
	}
}
