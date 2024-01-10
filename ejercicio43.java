package daw1.comienzo;

import java.util.Scanner;

public class ejercicio43 {

	public static void main (String[] arg){
		int num1;
		int num2;
		int num3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una primera nota:");
		num1=sc.nextInt();

		System.out.println("Introduzca una segunda nota:");
		num2=sc.nextInt();

		System.out.println("Introduzca una tercera nota:");
		num3=sc.nextInt();


		float media = (float)((num1+num2+num3)/3);

		System.out.println("Tu nota media es: "+media);
		}

}
