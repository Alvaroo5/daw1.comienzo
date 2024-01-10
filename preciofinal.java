package daw1.comienzo;

import java.util.Scanner;

public class preciofinal {


	public static void main(String[] arg) {
		float baseImponible;
		String tipoIVA;
		boolean ivaOK = false;
		float iva = 0;
		float precioIVA;
		String codPromo;
		boolean promoOk = false;
		float precioFinal = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la base imponible:");
		baseImponible=sc.nextFloat();
		
		System.out.println("Elija el tipo IVA(general, reducido o superreducido):");
		tipoIVA=sc.next();
		ivaOK = true;
			
		do {
			switch(tipoIVA) {
			case "general":
				iva=(float) 0.21;break;
			case "reducido":
				iva=(float) 0.10;break;
			case "superreducido":
				iva=(float) 0.04;break;
			default:
				System.out.println("Opcion no valida");
				ivaOK = false;
			}
		}while(ivaOK == false);
		
		precioIVA=baseImponible*(1+iva);
		System.out.println("El precio con el IVA aplicado seria: "+precioIVA);
		
		System.out.println("Elija el codigo promocional(nopro, mitad, meno5 o 5porc):");
		codPromo=sc.next();
		promoOk = true;
		
		do {
			switch(codPromo) {
			case "nopro":
				System.out.println("nopro");
				System.out.println("No se aplica promocion");break;
			case "mitad":
				precioFinal=precioIVA/2;break;
			case "meno5":
				precioFinal=precioIVA-5;break;
			case "5porc":
				precioFinal=(float) (precioIVA*(0.95));break;
			default:
				System.out.println("Opcion no valida");
				promoOk = false;
			}
		}while(promoOk == false);
		
		System.out.println("El precio final es "+precioFinal+" euros");
		
	}
}