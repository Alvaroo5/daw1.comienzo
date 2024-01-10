package daw1.comienzo;

import java.util.Scanner;

public class ejercicio814f {

	public static void main(String[] arg) {
		
		int n;
		String caracter;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la altura de la piramide:");
		n = sc.nextInt();
		
		System.out.println("Introduce el caracter:");
		caracter = sc.next();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
		for(int k = 1; k <= (i*2)-1; k++) {
			if((k==1) || (k==(i*2)-1) || (i==n)) {
				System.out.print(caracter);
			}else {
				System.out.print(" ");
			}
		}
			System.out.println();
		}
		
	}
}
