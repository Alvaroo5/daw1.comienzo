package daw1.comienzo;

import java.util.Scanner;

public class mayorEdad {
	
	public static void main(String[] args) {
	
	int edad;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduzca su edad:");
	
	edad = sc.nextInt();
	
	if(edad<18) {
		System.out.println("No puede pasar");
	} else {
		System.out.println("Puede pasar");
	}
	
}
	}
