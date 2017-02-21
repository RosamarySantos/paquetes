package com.iesvirgendelcarmen.utilidades;

public class TestCadenas {
	public static void main(String[] args) {
		System.out.printf("El nº de letras de la palabra %s es %d%n",
				"camión", Cadenas.contarLetras("camión"));
		System.out.printf("¿Comienza por vocal la palabra %s? %b%n",
				"camión", Cadenas.comienzaPorVocal("camión"));
		System.out.printf("¿No acaba por vocal la palabra %s? %b%n",
				"camión", Cadenas.noAcabaEnVocal("camión"));
		/*System.out.printf("¿Es un número la palabra %s? %b%n",
				"camión", Cadenas.esUnNumero("camión"));*/
		
	}
}
