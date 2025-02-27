package principal;

import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		// Pedir un número por teclado y decir si es primo o no.
		
		// Pedir el número por teclado
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el número que quiere comprobar:");
		int num = scan.nextInt();
		
		// Hacer las comprobaciones (tiene solo dos divisores: 1 y él mismo)
		
		boolean primo = true; // Variable de control
		
		if(num==1) {
			System.out.println("El número 1 no es primo por convención matemática.");
		}
		else {
			for(int i=2;i<num;i++) {
				if(num%i==0) {
					primo = false;
					i = num;
				}
			}
			
			String msg=(primo) ? "es" : "no es";
			
			System.out.println("El número "+num+" "+msg+" primo.");
			
		}
	}
}
