package principal;

import java.util.Scanner;

public class Acertijo {

	public static void main(String[] args) {
		// Partimos de un número cualquiera entre 1 y 10 almacenado en una variable
		// Se pide al usuario un numero entre 1 y 10.
		// Si coincide con el almacenado se le dice que ha acertado y el programa acaba
		// Si no, volvemos a preguntar hasta 4 oportunidades
		// Si excede las oportunidades, se muestra un mensaje de error
		
		int num = 5;
		
		// Pedir el número por teclado
		
		Scanner scan = new Scanner(System.in);		
		
		boolean acierto = false;
		
		for(int i=1;i<=4;i++) {
			System.out.println("Introduce el número que quiere comprobar:");
			int numPedido = scan.nextInt();
			
			if (num == numPedido) {				
				acierto = true;
				i=4;
			}
		}
		
		if(acierto) {
			System.out.println("Has acertadto !! Era el número "+num);
		}
		else {
			System.out.println("Se acabaron los intentos. "
					+ "No lo has conseguido. Era el número "+num);
		}
	}
}
