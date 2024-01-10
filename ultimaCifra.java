package daw1.comienzo;

import java.util.Scanner;

public class ultimaCifra {

	public static void main(String[] arg) {
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero:");
		numero = sc.nextInt();
		
		String numerotexto = String.valueOf(numero);
		
		int longTexto=numerotexto.length();
		
		for(int i=longTexto-1; i>=0; i--) {
			System.out.print(numerotexto.charAt(i));
		}
	}
	
}
