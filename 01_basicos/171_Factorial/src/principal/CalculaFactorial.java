package principal;

import java.util.Scanner;

public class CalculaFactorial {

	public static void main(String[] args) {
		// Pide un número y saca el factorial
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero entero que quieres factorizar");
		int num = scan.nextInt();
		int factor = num-1;
		
		while(factor!=0) {
			num = num*factor;
			factor--;
		}

		System.out.println("El factorial es "+num);
	}

}
