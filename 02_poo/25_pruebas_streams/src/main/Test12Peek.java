package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test12Peek {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(7,2,11,9,1);
		
		// Muestra cada elemento del stream y despues la suma de todos
		
		/*System.out.println("la suma es "+
				//st.peek(System.out::println).collect(Collectors.summingInt(n->n))
				st.peek(System.out::println).reduce((a,b)->a+b).get()
			);*/
		
		// Mostrar todos los números de la lista sin duplicados y a continuación
			// la suma de los negativos
		
		List<Integer> lista=List.of(2,11,2,-4,11,1,-9,0,2,7,-1,11,6,25);		
		
		System.out.println(" -> La suma de los negativos es: "+				
			lista.stream()
				.distinct()
				.peek(System.out::println)
				.filter(n->n<0)
				.collect(Collectors.summingInt(n->n))				
		);

	}

}
