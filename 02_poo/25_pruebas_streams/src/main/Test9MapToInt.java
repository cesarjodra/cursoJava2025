package main;

import java.util.List;

public class Test9MapToInt {

	public static void main(String[] args) {
		List<String> cads=List.of("cadena","otra","fin","sale","casa","paraiso");
		
		// Total de caracteres de todas las cadenas
		
		System.out.println(
			cads.stream()
				.mapToInt(t->t.length())
				.sum()				
		);

	}

}
