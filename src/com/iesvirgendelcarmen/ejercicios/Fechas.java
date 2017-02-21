package com.iesvirgendelcarmen.ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

//ejercicio tratamos fechas de acuerdo a la
//nueva API de fechas que aporta java 8
public class Fechas {

	public static void main(String[] args) {
		//Fecha
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual);
		DateTimeFormatter fechaFormateada = 
				DateTimeFormatter.ofPattern("dd/LL/yyyy");
		System.out.println(fechaFormateada.format(LocalDate.now()));
		//Tiempo
		LocalTime horaActual = LocalTime.now();
		System.out.println(horaActual);
		DateTimeFormatter hora =
			 DateTimeFormatter.ofPattern("h:mm:ss a");
		System.out.println(hora.format( LocalTime.now()));
		//Fecha y tiempo
		LocalDateTime ahora = LocalDateTime.now();
		System.out.println(ahora);
		DateTimeFormatter zonaHoraria = DateTimeFormatter.ofPattern("d MMMM, yyyy h:mm a");
		System.out.println(ZonedDateTime.now().format(zonaHoraria));
	}

}
