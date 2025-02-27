package main;

import java.util.ArrayList;
import java.util.List;

public class TestSort {

	public static void main(String[] args) {
		List<String> textos = new ArrayList<>(List.of("amarillo", "rojo", "indeterminado", "sol", "casas"));
		
		// Ordenar de menos a más caracteres
		
		textos.sort( (a,b) -> a.length() - b.length() );		
		textos.forEach(n->System.out.println(n));
		
		// Ordenar alfabeticamente (lexicográficamente)
		
		textos.sort( (a,b) -> a.compareTo(b) ); // Método para textos
		textos.forEach(n->System.out.println(n));

	}

}
