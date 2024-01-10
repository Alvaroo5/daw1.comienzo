package daw1.comienzo;

import java.util.Scanner;

public class leer_switch {

	public static void main(String[] arg) {
		
		char letra;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce una letra");
		letra = sc.next().charAt(0);
		
		switch(letra) {
		case 'a':System.out.println("Es una vocal");break;
		case 'e':System.out.println("Es una vocal");break;
		case 'i':System.out.println("Es una vocal");break;
		case 'o':System.out.println("Es una vocal");break;
		case 'u':System.out.println("Es una vocal");break;
		default: System.out.println( "Es una consonante" ); break;
		}
		
	}
}
