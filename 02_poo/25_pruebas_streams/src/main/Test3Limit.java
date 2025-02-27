package main;

import java.util.List;

public class Test3Limit {

	public static void main(String[] args) {
		List<Integer> lista = List.of(2,11,2,-4,1,11,-9,0,2,7,-1,11,6,25);
		
		// Imprime los 5 primeros numeros sin incluir repetidos
		
		lista.stream()
				.distinct() // Método intermedio para filtrar, sin duplicados
				.limit(5) // Método intermedio para limitar los x primeros
				.forEach(System.out::println);							
	}
}
