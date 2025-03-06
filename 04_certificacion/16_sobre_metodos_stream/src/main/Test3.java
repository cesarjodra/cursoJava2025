package main;

import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		Stream<String> st=Stream.of("a","ab","abc","xyz","12345");

		System.out.println(
			st.filter(n->n.length()>4).reduce("0",(a,b)->a+b)
		); 

	}

}
