package daw1.comienzo;

import java.util.Scanner;

public class ejercicio814b {

	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el valor de altura:");
        int n = scanner.nextInt();
        
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=i; j++) {  
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
