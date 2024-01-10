package daw1.comienzo;

import java.util.Scanner;

public class seguro {

	public static void main(String[] arg) {
		
		int precioBase = 500;
		int edad;
		float recargoEdad;
		float recargoGama;
		String marca;
		float precio;
		
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Introduce su edad:");
		edad = sc.nextInt();
		
		System.out.println("Introduce la marca de su coche:");
		marca = sc2.nextLine();
		marca.toLowerCase();
		
		if(edad<25) {
			recargoEdad = (float) 0.3;
		}else if(edad>60) {
			recargoEdad = (float) 0.2;
		}else {
			recargoEdad = 0;
		}
		
		switch(marca) {
		
		case "jaguar", "aston", "porsche", "tesla": recargoGama = (float) 0.5; break;
		
		case "bmw", "mercedes", "audi", "volkswajen": recargoGama = (float) 0.25; break;
		
		default: recargoGama = 0; break;
		}
		
		precio = precioBase*(1+recargoGama+recargoEdad);
		
		System.out.println("El precio del seguro es:"+precio+"euros");
	}
}
