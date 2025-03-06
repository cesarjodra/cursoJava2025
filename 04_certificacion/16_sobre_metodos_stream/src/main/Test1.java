package main;

import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// Realiza un programa que genere 10 enteros
			// aleatorios entre 1 y 50 y nos muestre el
			// mayor de todos los pares
		// En caso de no haber pares, nos mostrará un
			// mensaje que lo indique
		// Hacer todo el programa en un único pipeline
		
		
		Stream.generate( ()-> (int)(Math.random()*49)+1 )
		.limit(10)
		.filter(n->n%2==0)	
		.max((a,b)->a-b)				
		.ifPresentOrElse(System.out::println, ()->System.out.println("No hay pares"));				

	}

}
