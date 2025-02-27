package service;

import java.util.ArrayList;

public class Pila {
	
	/* 	Crear una clase de coleccion que funcione como una pila de cadena de caracteres
	 	Tendra los siguientes métodos:
	 		- Agregar: Recibe un texto y lo guarda en la pila
	 		- Sacar: Devuelve el último texto introducido y lo quita de la pila
	 		- Total: Devuelve el número de textos que hay en la pila
	 */
	
	private ArrayList<String> textos = new ArrayList<>();
	
	// Método para agregar textos
	public void agregar(String texto) {		
		textos.add(texto);	
	}
	
	// Método para sacar textos
	public String sacar() {				
		//return textos.remove(textos.size()-1);
		return textos.removeLast();
	}
	
	// Método para ver el total de textos
	public int total() {				
		return textos.size();
	}
}
