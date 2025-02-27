package main;

import java.util.Arrays;
import java.util.List;

public class Test14FlatMap2 {

	public static void main(String[] args) {
		List<String> frases=List.of("Esto es una cadena",
				"La cadena es muy larga","para luego esto","Una buena frase");
		
		// Cuantas palabras diferentes hay entre todas las frases
		
		System.out.println(
				frases.stream()
				.flatMap( f->Arrays.stream(f.split(" ")) )
				.map( a->a.toLowerCase() )
				.distinct()
				.count()
		);
	}
}
