package main;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveif {

	public static void main(String[] args) {
		
		List<Integer> nums = List.of(8,6,5,2,3,6,9); // Las listas con OF son inmutables
		
		// nums.removeIf(n->n%2!=0); // Error de ejecución inmutabilidad
		// nums.forEach(n->System.out.println(n));

		
		List<Integer> nums2 = new ArrayList<>();
		nums2.add(2);
		nums2.add(3);
		nums2.add(4);
		nums2.add(5);
		
		nums2.removeIf(n->n%2!=0);		
		nums2.forEach(n->System.out.println(n));
		
		// Tambien vale así:
		List<Integer> nums3 = new ArrayList<>(List.of(8,6,5,2,3,6,9)); // No es inmutable
		
		nums3.removeIf(n->n%2!=0);		
		nums3.forEach(n->System.out.println(n));

	}

}
