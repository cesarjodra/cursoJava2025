package main;

import java.util.List;

public class Test4Match {

	public static void main(String[] args) {
		List<Integer> lista = List.of(2,11,2,-4,1,11,-9,0,2,7,-1,11,6,25);
		
		// ¿Hay algún número negativo?
		
		//System.out.println(lista.stream().anyMatch(n->n<0));
		
		// ¿son todos pares los 4 primeros números no repetidos ?
		
		System.out.println(
				lista.stream()
				.distinct()  
				.limit(4) 
				.allMatch(n->n%2==0)
				);			

	}

}
