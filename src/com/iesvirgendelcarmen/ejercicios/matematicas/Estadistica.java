package com.iesvirgendelcarmen.ejercicios.matematicas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Estadistica {
	//atributo: colección de doubles
	List<Double> listaNumeros;
	//constructor para el caso que le pasamos la lista de doubles

	public Estadistica(List<Double> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}
	public Estadistica(){
		this.listaNumeros = new ArrayList<>();
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
	public Set<Double> calcularModa(){
		Set<Double> conjuntoModa = new HashSet<Double>();
		int frecuenciaMaxima = Collections.frequency(listaNumeros, 0);
		for(Double i : listaNumeros){
			int frecuenciaDei =  Collections.frequency(listaNumeros, i);
			if (frecuenciaDei == frecuenciaMaxima )
				conjuntoModa.add(i);
			else if (frecuenciaDei > frecuenciaMaxima) {
				conjuntoModa.clear();
				frecuenciaMaxima = Collections.frequency(listaNumeros, i);
				conjuntoModa.add(i);
			}
		}
		return conjuntoModa;
	}
	/*public static void main(String[] arg){
		Integer[]  listaArray = {0,2,33,1,3,4,5};
		List<Integer> listaDinamica = Arrays.asList(listaArray);
		System.out.println("ARRAY: " + Arrays.toString(listaArray));
		System.out.println("LISTA: " + listaDinamica);
		//creamos un conjunto
		Set<Integer> conjunto = new HashSet<Integer>();
		for(Integer i : listaDinamica){
			//System.out.println(i);
			conjunto.add(i);
		}
		Set<Integer> conjuntoModa = new HashSet<Integer>();
		int frecuenciaMaxima = Collections.frequency(listaDinamica, 0);
		
		System.out.println("CONJUNTO: " + conjunto);
		for(Integer i : conjunto){
			if ( Collections.frequency(listaDinamica, i) == frecuenciaMaxima )
				conjuntoModa.add(i);
			else if (Collections.frequency(listaDinamica, i) > frecuenciaMaxima) {
				conjuntoModa.clear();
				frecuenciaMaxima = Collections.frequency(listaDinamica, i);
				conjuntoModa.add(i);
			}
		}
		System.out.println("CONJUNTO MODA: " + conjuntoModa);
	}*/
	
	
	
	
	
	
	
	
	
}
