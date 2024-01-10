package daw1.comienzo;

import java.util.Scanner;

public class ejercicio42 {

	public static void main (String[] arg){
		int num1;
		int num2;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una primera nota:");
		num1=sc.nextInt();

		System.out.println("Introduzca una segunda nota:");
		num2=sc.nextInt();

		float media = (float)((num1+num2)/2);

		System.out.println("Tu nita media es: "+media);
		}

}
