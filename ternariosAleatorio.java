package daw1.comienzo;

public class ternariosAleatorio {

	public static void main(String[]arg) {
		int valor;
		valor = (int) ((Math.random()*(10)) + 1);
		System.out.println(valor);
		
		String result = (valor < 5) ? "Menor que 5" : "Mayor que cinco";
		
		System.out.println(result);
	}
}