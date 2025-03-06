package main;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2 {
	
	public static void main(String[] args) {
		int[][] nums= {{6,1,8,4},{2,4,1,11,7},{3,6,11}}; 		
		// Suma de los pares no repetidos
		
		System.out.println(
				Stream.of(nums) //Stream<int[]>
				.flatMapToInt(IntStream::of) // IntStream
				.filter(n->n%2==0)
				.distinct()
				.sum() 
				);
		
	}
	
}
