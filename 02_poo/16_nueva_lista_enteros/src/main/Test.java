package main;

import java.util.List;

import service.ListInteger;

public class Test {

	public static void main(String[] args) {
		List<Integer> positivos=ListInteger.ofPositivos(-10,5,9,-89,66,33,-15);
		for(Integer num:positivos) {
			System.out.println(num);
		}
	}

}
