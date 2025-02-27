package principal;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumAleatorio {

	public static void main(String[] args) {
		// Lotería con números aleatorios
			// Generar 6 numeros entre 1 y 49
			// No puede haber repetidos
			// Mostrar ordenados
		
		/*Stream.generate( ()-> (int)(Math.random()*49)+1 )
			.distinct()
			.limit(6)			
			.sorted()
			.forEach(System.out::println)
		;*/
		
		System.out.println(
				Stream.generate( ()-> (int)(Math.random()*49)+1 )
				.distinct()
				.limit(6)			
				.sorted()
				.map(n->n.toString())
				.collect(Collectors.joining(","))				
				);
		
		
	}
}