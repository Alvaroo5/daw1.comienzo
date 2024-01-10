package daw1.comienzo;

public class ejercicio73 {
	public static void main(String[] arg) {
		int valor;
		char convertido;
	    valor = (int) ((Math.random()*(123-97)) + 97);
	    convertido = (char) valor;
	    
	    System.out.println(convertido);
	    System.out.println(valor);
	}
}
