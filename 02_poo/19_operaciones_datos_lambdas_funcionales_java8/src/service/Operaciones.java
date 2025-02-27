package service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Operaciones {
	
	public int sumaPorCondicion(List<Integer> lista, Predicate<Integer> condicion) {		
		int suma=0;
		for(Integer n:lista) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}		
		return suma;
	}
	
	public List<Integer> transformarCadenas(List<String> lista, Function<String,Integer> text) {		
		List<Integer> salida = new ArrayList<Integer>();
		for(String t:lista) {
			salida.add(text.apply(t));
		}
		return salida;
	}
	
	// Método que recibe una lista de enteros e imprime los pares
	// Método que recibe un conjunto de enteros y guarda en fichero los positivos	
	// Método que recibe una lista de entero y guarda en un fichero los multiplos de 5	
	// Método que recibe un conjunto de enteros e imprime los negativos
	
	public void procesarConCondicion(Collection<Integer> col, Predicate<Integer> condicion, Consumer<Integer> proceso) {		
		for(Integer n:col) {
			if(condicion.test(n)) {
				proceso.accept(n);
			}
		}
	}
	

	
	
	
	
}
