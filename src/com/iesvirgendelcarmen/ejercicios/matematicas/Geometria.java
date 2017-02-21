package com.iesvirgendelcarmen.ejercicios.matematicas;

public class Geometria {
	public static double calcularAreaTriangulo(double base, double altura){
		return base * altura / 2.0;
	}
	public static double calcularAreaCuadrado(double lado){
		return lado * lado;
	}
	public static double calcularAreaPentagono(double lado){
		return 1.72048 * lado * lado;
	}
	public static double calcularAreaHexagono(double lado){
		return 	3.0 * Math.sqrt(3) * lado * lado / 2.0;	
	}
}
