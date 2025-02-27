package principal;

import java.util.Scanner;

public class MostrarMayores {

	public static void main(String[] args) {
		// Definimos un array de enteros
		// Solicitamos la introducción de un número y mostramos en
			// pantalla los números del array que sean mayores que él
		
		int[] numeros = {11,9,22,31,4,7,26};
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe el número que quieras");
		int numero = scan.nextInt();
		
		for(int n:numeros) {
			if(n>numero) {
				System.out.print(n+" ");
			}
		}
		

	}

}
