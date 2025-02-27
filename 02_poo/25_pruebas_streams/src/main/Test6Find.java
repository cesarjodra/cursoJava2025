package main;

import java.util.List;
import java.util.Optional;

public class Test6Find {

	public static void main(String[] args) {
		List<Integer> lista = List.of(2,11,2,-4,1,11,-9,0,2,7,-1,11,6,25);

		// Imprime el primer número negativo
			//Si no hubiera ninguno, mostrar un aviso
		
		/*Optional<Integer> res = lista.stream()
									//.limit(3) // Para que no haya negativos
									.filter(n->n<0)									
									.findFirst();*/
		
		/*if(res.isPresent()) {
			System.out.println(res.get());
		}
		else {
			System.out.println("No hay negativos");
		}*/
		
		// Alternativa al IF usando ifPresentOrElse()
				
		lista.stream()
				.limit(3) 
				.filter(n->n<0)									
				.findFirst()
				.ifPresentOrElse(System.out::println, ()->System.out.println("No hay negativos")
				);
		
	}

}
