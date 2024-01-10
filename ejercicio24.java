package daw1.comienzo;

import java.util.Scanner;

public class ejercicio24 {

	public static void main(String[] args) {
		
		float num1;
		final int millas = 1609;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una longitud en millas:");
		num1=sc.nextFloat();
		
		float metros = num1*millas;
		
		System.out.println(num1+" millas son "+metros+" metros");
	}
}
