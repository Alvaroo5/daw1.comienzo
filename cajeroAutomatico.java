package daw1.comienzo;

import java.util.Scanner;

public class cajeroAutomatico {

	public static void main(String[]arg) {
		
		final int clave = 1234;
		int numIntentos = 1;
		int pin;
		int saldo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su pin:");
		pin = sc.nextInt();
		
		if(pin == clave) {
			System.out.println("Pin correcto");
			
		}else {
			do {
				System.out.println("Pin incorrecto");
				System.out.println("Quedan "+(3-numIntentos)+" intentos");
				System.out.println("Introduzca su pin:");
				pin = sc.nextInt();
				numIntentos++;
			}while((pin != clave) && (numIntentos<3));
		}
		if(numIntentos == 3) {
			System.out.println("Tarjeta bloqueada");
		}

	}
}