package main;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> lst = List.of(3,11,-5,-2,-5,8,23,11,0,4,-1);
		
		System.out.println(
			lst.parallelStream() // Lo recorre con múltiples hilos fragmentando el Stream
			.distinct()
			.filter(n->n>0)
			.collect(Collectors.summingInt(n->n))
		);

	}

}
