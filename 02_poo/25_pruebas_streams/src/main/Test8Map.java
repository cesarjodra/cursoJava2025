package main;

import java.util.List;

public class Test8Map {

	public static void main(String[] args) {
		List<String> cads=List.of("cadena","otra","fin","sale","casa","paraiso"); 
		
		// Mostar las longitudes de todas las cadenas sin repetir longitudes
		
		cads.stream()
				.map(t->t.length())
				.distinct()
				.forEach(System.out::println)
				;

	}

}
