package com.iesvirgendelcarmen.ejercicios.matematicas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estadistica {
	//atributo: colección de doubles
	List<Double> listaNumeros = new ArrayList<>();
	//constructor para el caso que le pasamos la lista de doubles

	public Estadistica(List<Double> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}
	//en el caso que no pasemo una lista de doubles, debemos añadir 
	//los número de uno en uno
	public void addNumero(double d){
		listaNumeros.add(d);
	}
	@Override
	public String toString() {
		return  listaNumeros.toString();
	}
	//calculo del valor medio
	public double calcularValorMedio(){
		double suma = 0;
		for (Double d : listaNumeros){
			suma += d;
		}
		return suma / listaNumeros.size();
	}
	//calculo de la varianza
	public double calcularVarianza(){
		double suma = 0;
		for (Double d : listaNumeros){
			suma += Math.pow((d - calcularValorMedio()),2);
		}
		return suma / listaNumeros.size();
	}
	//calculo de la desviación típica
	public double calcularDesviacionTipica(){
		return Math.sqrt(calcularVarianza());
	}
	//calculo de la moda
	public List<Double> calcularModa(){
		List<Double> moda = null;
		//código:
		//crear un hashmap (clave,valor) (numero, veces que se repite)
		//creamos el diccionario vació
		Map<Double, Integer> diccionario = new HashMap<Double, Integer>();
		return moda;
	}
	
	
	
	
	
	
	
	
	
}
