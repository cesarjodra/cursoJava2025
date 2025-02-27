package main;

import java.util.List;

public class Test2Distinct {

	public static void main(String[] args) {
		List<Integer> lista = List.of(2,11,-4,1,-9,0,2,7,-1,11,6,25);
		
		System.out.println(lista.stream()
							.distinct() // Método intermedio para filtrar, sin duplicados
							.count()); // Método final para contar
	}

}
