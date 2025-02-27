package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirNumeros {

	public static void main(String[] args) {
		// Realiza un programa que solicite dos números enteros 
		// y calcule la división entre los mismos
		
		Scanner scan = new Scanner(System.in);
		
		try {			
			System.out.println("Introduce un número");
			int n1 = scan.nextInt();
			System.out.println("Introduce otro número");
			int n2 = scan.nextInt();
			
			int div = n1/n2;
			
			System.out.println("La división es: "+div);	
		}
		catch(InputMismatchException ex){
			System.out.println("No se puede introducir textos. Sólo números enteros.");
		}
		catch(ArithmeticException ex) {
			System.out.println("No se ha podido realizar esa operación aritmética.");
			System.out.println(ex.getMessage());
		}
		finally {
			System.out.println("Hasta luego");
		}

	}

}
