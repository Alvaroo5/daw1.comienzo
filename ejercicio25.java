package daw1.comienzo;

import java.util.Scanner;

public class ejercicio25 {

	public static void main(String[] args) {
		
		float grados;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una temperatura en grados centigrados:");
		grados=sc.nextFloat();
		
		float gradosFahrenheit = (int) ((9.0/5.0) * grados + 32);;
		
		System.out.println(grados+" grados centigrados son "+gradosFahrenheit+" grados Fahrenheit");
	}
}
