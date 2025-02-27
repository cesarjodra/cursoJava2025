package main;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test10CollectListas {

	public static void main(String[] args) {
		Stream<Integer> st=Stream.of(2,11,8,5,7,2,7,9,4,17,11);
		
		//generar una lista con los números sin duplicados
		
		/*List<Integer> lst=st
				.distinct()
				.collect(Collectors.toList())
				;*/
		
		// A partir de Java 16, la clase Stream ya tiene un método toList()
		
		List<Integer> lst=st
				.distinct()
				.toList()
				;
	}

}
