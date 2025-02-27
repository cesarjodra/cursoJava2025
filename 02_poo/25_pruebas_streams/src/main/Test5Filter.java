package main;

import java.util.List;

public class Test5Filter {

	public static void main(String[] args) {
		List<Integer> lista = List.of(2,11,2,-4,1,11,-9,0,2,7,-1,11,6,25);
		
		// ¿Cuántos numeros positivos no repetidos hay?
		
		System.out.println(
				lista.stream()
				.distinct()  
				.filter(n->n>0) 
				.count()
				);	

	}

}
