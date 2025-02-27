package principal;

import java.util.Scanner;

public class ContarMultiplos {

	public static void main(String[] args) {
		// Realizar un programa que solicite la introducción de dos números
		// Nos dirá cuántos múltiplos de 5 hay entre esos dos números
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el numero primero");
		int num1 = scan.nextInt();
		System.out.println("Introduce el numero segundo");
		int num2 = scan.nextInt();
		
		int numInicio=(num1>num2) ? num2 : num1;		
		int numFin=(num1>num2) ? num1 : num2;	
				
		int multiplos = 0;
		
		for(int i=numInicio ; i<=numFin ; i++) {
			if(i%5==0) {multiplos++;}
		}
		System.out.println("El número de múltiplos de 5 entre "+numInicio+" y "+numFin+" es: "+multiplos);
	}
}
