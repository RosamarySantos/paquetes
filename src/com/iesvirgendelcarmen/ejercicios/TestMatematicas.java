package com.iesvirgendelcarmen.ejercicios;

import java.util.Arrays;
import java.util.List;

//Las dos formas de abajo son similares
//import com.iesvirgendelcarmen.ejercicios.matematicas.Estadistica;
//import com.iesvirgendelcarmen.ejercicios.matematicas.Geometria;
import com.iesvirgendelcarmen.ejercicios.matematicas.*;


public class TestMatematicas {

	public static void main(String[] args) {
		//comprobamos la clase com.iesvirgendelcarmen.ejercicios.matematicas.Geometria
		double altura = 2.3;
		double base = 1.6;
		System.out.printf("Area de un triangulo de base %.2f y altura %.2f"
				+ " vale %.2f%n", altura, base, 
				Geometria.calcularAreaTriangulo(base, altura));
		double lado = 3.3;
		System.out.printf("Area de un cuadrado de lado %.2f vale %.2f%n",
				lado, Geometria.calcularAreaCuadrado(lado));
		System.out.printf("Area de un pentágono de lado %.2f vale %.2f%n",
				lado, Geometria.calcularAreaPentagono(lado));
		System.out.printf("Area de un hexágono de lado %.2f vale %.2f%n",
				lado, Geometria.calcularAreaHexagono(lado));
		//comprobamos la clase com.iesvirgendelcarmen.ejercicios.matematicas.Estadistica
		Double[] listaNumeros = {122.0, 122.0, 123.3, 1111.0, 1.3, 1.3, 1.1, 1.2, 1.1, 1.2, 1.0, 1.3};
		List<Double> listaNumerosDinamica = Arrays.asList(listaNumeros);
		Estadistica e = new Estadistica(listaNumerosDinamica);
		System.out.println("La lista de número es: " + e);
		System.out.printf("El valor medio de la lista es %.2f%n",
				e.calcularValorMedio());
		System.out.printf("La varianza de la lista es %.2f%n",
				e.calcularVarianza());
		System.out.printf("La desviación típica de la lista es %.2f%n",
				e.calcularDesviacionTipica());
		System.out.printf("La moda de la lista es %s%n",
				e.calcularModa());
		
		
		
	}

}
