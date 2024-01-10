package daw1.comienzo;

import java.util.Scanner;

public class ejercicio32 {
	
	public static void main(String[] arg) {
		
		short añoNac;
		short añoActual;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un año de nacimiento:");
		añoNac=sc.nextShort();
		
		System.out.println("Introduzca el año actual:");
		añoActual=sc.nextShort();
		
		short edad = (short) (añoActual-añoNac);
		
		System.out.println("Su edad es: "+edad);
	}
}
