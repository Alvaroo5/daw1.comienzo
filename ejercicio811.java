package daw1.comienzo;

public class ejercicio811 {

	public static void main(String[] arg) {
		
		 for (int i=1; i<=10; i++) {
	            System.out.println("Tabla de multiplicar del " + i + ":");
	            for (int j = 1; j <= 10; j++) {
	                int resultado = i * j;
	                System.out.println(i + " x " + j + " = " + resultado);
	            }
		 }
	}
}
