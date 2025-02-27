package main;

import java.util.List;

public class Test11Reduce {

	public static void main(String[] args) {
		List<Integer> lista = List.of(2,11,2,-4,1,11,-9,0,2,7,-1,11,6,25);
		
		// suma de todos los positivos, partiendo de un valor inicial de 100
		
		System.out.println(
				lista.stream()
			.filter(n->n>0)
			.reduce(100, (a,b)->a+b )
		);
	}
}
