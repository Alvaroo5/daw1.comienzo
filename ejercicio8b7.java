package daw1.comienzo;

import java.util.Scanner;

public class ejercicio8b7 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.printf("Escribe un numero por teclado: ");
	    int n = sc.nextInt();
	    int alReves = 0;
	    int resto = 0;
	    while (n > 0) {
	      resto = n % 10;
	      alReves = alReves * 10 + resto;
	      n = n / 10;
	    }
	    System.out.println(alReves);
	  }
}
