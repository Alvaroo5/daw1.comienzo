package daw1.comienzo;

import java.util.Scanner;

public class ejercicio23 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un primer numero:");
		num1=sc.nextInt();
		
		System.out.println("Introduzca un segundo numero:");
		num2=sc.nextInt();
		
		float dividir = (float)num1/num2;
		
		System.out.println("El resultado de la division es: " + dividir);
	}
}
