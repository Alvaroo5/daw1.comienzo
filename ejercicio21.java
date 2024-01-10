package daw1.comienzo;

import java.util.Scanner;

public class ejercicio21 {

	public static void main(String[] args) {
		
		float num1;
		float num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un primer numero:");
		num1=sc.nextFloat();
		
		System.out.println("Introduzca un segundo numero:");
		num2=sc.nextFloat();
		
		float multiplicacion = num1*num2;
		
		System.out.println("El resultado es: " + multiplicacion);
	}
}
