package daw1.comienzo;

import java.time.LocalDateTime;

public class ejercicio45 {

	public static void main(String[] arg) {
		
		LocalDateTime ahora = LocalDateTime.now();
		
		int año = ahora.getYear();
		int mes = ahora.getMonthValue();
		int dia = ahora.getDayOfMonth();
		int hora = ahora.getHour();
		int minutes = ahora.getMinute();
		int seconds = ahora.getSecond();
		
		System.out.println("Hoy es "+dia+" de "+mes+" del año "+año+" y son las "+hora+" horas, "+minutes+" minutos y "+seconds+" segundos");
	}
}
