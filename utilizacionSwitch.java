package daw1.comienzo;

import java.util.Scanner;

public class utilizacionSwitch {
	public static void main (String[] arg) {
		int opt;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.println("Elija opcion:");
			System.out.println("1. Carne");
			System.out.println("2. Pescado");
			System.out.println("3. Verano");
			opt=sc.nextInt();
					
			switch(opt) {
			case 1:
				System.out.println("Carne");break;
			case 2:
				System.out.println("Pescado");break;
			case 3:
				System.out.println("Verano");break;
			default:
				System.out.println("Opcion no valida");
			}
		}while (!(opt >= 1 && opt <= 3));
	}
}
