package main;

import java.util.List;
import java.util.stream.Collectors;

public class Test13FlatMap {

	public static void main(String[] args) {
		List<List<Integer>> valores=List.of(
										List.of(4,2,7,-5),
										List.of(8,-5,9),
										List.of(23,-2,7,20,11) );	
		
		// Quiero la suma de todos los positivos
		
		System.out.println(
				valores.stream() //Stream<List<Integer>>
				.flatMap(l->l.stream()) //Stream<Integer>
				.filter(n->n>0) //Stream<Integer>
				.collect(Collectors.summingInt(n->n)) //Integer
				);
	}

}
