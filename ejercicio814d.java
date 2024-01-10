package daw1.comienzo;

import java.util.Scanner;

public class ejercicio814d {

	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce altura:");
		
		int n=sc.nextInt();
		
		for(int i=1; i <= n; i++) {
			System.out.println("*");
			if(i == (n-1)) {
				for(int j = 1; j<= (n/2); j++) {
					System.out.print("*");
				}
			}
		}
		
	}
}
