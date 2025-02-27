package service;

import java.util.ArrayList;
import java.util.List;

/*
 * Crear una nueva interfaz de listas de enteros (ListInteger),
 * que incluya dos métodos nuevos estáticos:

ofPares(int n): devuelve una lista con los n primeros números pares

ofPositivos(int... d): recibe un número variable de números enteros y devuelve 
una lista con los positivos 

*/

public interface ListInteger extends List<Integer> {	
		
	public static List<Integer> ofPares(int n){
		List<Integer> listado = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {			
			listado.add(i*2);						
		}
		return listado;
	}
	
	public static List<Integer> ofPositivos(int...d){
		List<Integer> listado2 = new ArrayList<Integer>();
		for(int i=0;i<d.length;i++) {
			if(d[i]>=0) {
				listado2.add(d[i]);
			}			
		}
		return listado2;
	}

}
