package service;

import java.util.ArrayList;
import java.util.List;

public class Operaciones {
	
	public int sumaPorCondicion(List<Integer> lista, Condicion condicion) {		
		int suma=0;
		for(Integer n:lista) {
			if(condicion.test(n)) {
				suma+=n;
			}
		}		
		return suma;
	}
	
	// Método que recibe una lista de cadenas de caracteres y devuelve una lista
	// Con las longitudes de cada cadena
	
	// Método que recibe una lista de cadenas de caracteres y devuelve una lista
	// Con el numero de espacios de cada cadena
	
	public List<Integer> transformarCadenas(List<String> lista, Transformacion text) {		
		List<Integer> salida = new ArrayList<Integer>();
		for(String t:lista) {
			salida.add(text.test(t));
		}
		return salida;
	}
	
	
}
