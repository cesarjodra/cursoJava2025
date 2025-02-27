package main;

import java.util.List;
import java.util.Optional;

public class Test7Sorted {

	public static void main(String[] args) {
		List<String> cad = List.of("amarillo", "casa", "dia", "nunca", "experimento");

		// Mostrar la cadena con menor número de caracteres		
		
			/*Optional<String> text = cad.stream()
					.sorted( (a,b)->a.length()-b.length() )
					.findFirst();
			
			System.out.println(text.get());	*/
			
		// Lo puedo hacer sin ordenarlo con max() y min()
		
		Optional<String> text = cad.stream()
				.max( (a,b)->a.length()-b.length() );			
		
		System.out.println(text.get());	
		
	}

}
