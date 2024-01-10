package daw1.comienzo;

import java.util.Scanner;

public class parYentre1_10 {
	public static void main(String[] args) {
		
		float num1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero:");
		num1=sc.nextInt();
		
		if(num1 >= 1 && num1 <= 10 && num1%2 == 0 ) {
			
			System.out.println("OK");
		}else{
			System.out.println("NO OK");
		}
	}
}
