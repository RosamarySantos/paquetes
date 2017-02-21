package com.iesvirgendelcarmen.ejercicios;

import com.iesvirgendelcarmen.ejercicios.matematicas.Geometria;

public class TestMatematicas {

	public static void main(String[] args) {
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
	}

}
