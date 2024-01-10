package daw1.comienzo;

import java.util.Scanner;

public class nombre {
	public static void main(String[] args) {

	String nombreUsuario;
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Introduzca tu nombre:");
	
	nombreUsuario=teclado.nextLine();
	
	System.out.println("Te llamas: "+nombreUsuario);
	
	}
}
