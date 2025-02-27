package main;

import java.util.ArrayList;
import java.util.List;

public class TesrReplaceAll {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>(List.of(8,6,5,2,3,6,9));
		
		nums.replaceAll(n->n*n);
		nums.forEach(n->System.out.println(n));

	}

}
