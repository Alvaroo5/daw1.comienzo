package daw1.comienzo;

import java.util.Scanner;

public class cadenas {

	public static void ma8in(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del usuario:");
		String user = sc.nextLine();
		
		System.out.println(user.toLowerCase()); //Convierte la cadena en minuscula
		
		System.out.println(user.toUpperCase()); //Convierte la cadena en mayuscula
		
		System.out.println(user.equals("Alvaro")); //Compara dos strings
		
		System.out.println(user.substring(1,2)); //Devuelvela cadena que empieza en el (x, y)siendo x la posiciondel caracter donde queremos que empiece la busqueda en la cadena e 'y' donde queremos que acabe
		
		System.out.println(user.charAt(1)); //Devuelve el caracer que indicamos
		
		System.out.println(user.indexOf('a')); //Devuelve la posicion del caracter introducido
		
		String x = "20";
		String y = "23";
		
		System.out.println(x+y);
		
		
		
		
		
		
	}
}
