package com.iesvirgendelcarmen.utilidades;

public class Cadenas {
	//accesibilidad public
	public static int contarLetras(String cadena) {
		return cadena.length();
	}
	//accesibilidad a nivel de package
	static boolean comienzaPorVocal(String cadena){
		return cadena.toLowerCase().
				matches("[aeiouáéíó].*");
	}
	//accesibilidad protected
	protected static boolean noAcabaEnVocal(String cadena){
		return !cadena.toLowerCase().
				matches(".*[aeiouáéíó]");
	}
	//accesibilidad privada
	private static boolean esUnNumero(String cadena){
		return cadena.matches("[\\d]+");
	}
	//¿Son todos los métodos accesibles dentro de la propia clase?
	public static void main(String[] args) {
		System.out.printf("El nº de letras de la palabra %s es %d%n",
				"camión", Cadenas.contarLetras("camión"));
		System.out.printf("¿Comienza por vocal la palabra %s? %b%n",
				"camión", Cadenas.comienzaPorVocal("camión"));
		System.out.printf("¿No acaba por vocal la palabra %s? %b%n",
				"camión", Cadenas.noAcabaEnVocal("camión"));
		System.out.printf("¿Es un número la palabra %s? %b%n",
				"camión", Cadenas.esUnNumero("camión"));
		
	}
	
	
	
	
	
	
}
