package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class ParesImpares {

	public static void main(String[] args) {
		// Realizar un programa que solicite la introducción de diez números enteros
			// y los guarde en un ArrayList
		
		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scan = new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {			
			System.out.println("Escribe el número número "+i);
			numeros.add( scan.nextInt() );
		}
				
		// Indica cuántos pares hay y cuantos impares
		
		int par=0;
		int impar=0;		
		
		for(int n:numeros) {
			System.out.print(n+" ");
			if(n%2==0) {par++;}	
			else {impar++;}			
		}
		System.out.println("\nHay "+par+" numeros pares y "+impar+" impares.");
		
		// Cuantos números primos hay?
			// Haz un método que a partir de un número indique si es o no primo	
		int primos=0;
		
		for(int n:numeros) {
			/*boolean primo = detectarPrimo(n);
			if(primo) {primos++;}*/
			if(detectarPrimo(n)) {primos++;}
		}
		
		System.out.println("Hay "+primos+" numeros primos en el listado.");

	}
	
	// Método para detectar números primos
	
	static boolean detectarPrimo(int numero) {
		
		if(numero==1) {
			return false;
		}
		else {
			for(int i=2;i<numero;i++) {
				if(numero%i==0) {
					return false;
				}				
			}			    
		}
		return true;
	
	}

}
