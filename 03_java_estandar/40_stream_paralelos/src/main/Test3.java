package main;

import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> lst = List.of(3,11,-5,-2,-5,8,23,11,0,4,-1);
		
		// Imprimir los positivos sin duplicados con stream paralelos
		
		 lst.parallelStream() 
			.distinct()
			.filter(n->n>0)
			.sequential() // Lo convierte en secuencial, para a partir de aqui, hacerlo por orden
			.forEach(System.out::println);
	

	}

}
