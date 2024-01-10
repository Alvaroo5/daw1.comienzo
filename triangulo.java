package daw1.comienzo;

import java.util.Scanner;

public class triangulo {
	public static void main(String[] args) {

		float base;
		float altura;
		float area;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce la base:");
		base=teclado.nextFloat();
		
		System.out.println("Introduce la altura:");
		altura=teclado.nextFloat();
		
		area=(base*altura)/2;
		System.out.println("El area del triangulo es: "+area+" cm");
		
	}

}
