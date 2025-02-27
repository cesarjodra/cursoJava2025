package principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// Introducir dos números por teclado
		// Con ello, mostraremos suma, resta, multiplicación y división de ambos
		// NOTA: La resta y división será mayor antes de menor
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Introduce número");
		int n1=scan.nextInt();
		System.out.println("Introduce otro número");
		int n2=scan.nextInt();
		
		//int suma=n1+n2;
		//System.out.println("La suma es: "+suma);
		System.out.println("La suma es: "+sumar(n1,n2));
		
		//int resta=Math.max(n1,n2)-Math.min(n1,n2);
		//System.out.println("La resta es: "+resta);
		System.out.println("La suma es: "+restar(n1,n2));
		
		//int producto=n1*n2;
		//System.out.println("El producto es: "+producto);
		System.out.println("La suma es: "+multiplicar(n1,n2));
		
		//int division=Math.max(n1,n2)/Math.min(n1,n2);
		//System.out.println("La division es: "+division);
		System.out.println("La suma es: "+dividir(n1,n2));
	}		
		// Usando Clases:
		
	static int sumar(int a, int b) {
			return a+b;
		}
	static int restar(int a, int b) {
			return Math.max(a,b)-Math.min(a,b);
		}
	static int multiplicar(int a, int b) {
			return a*b;
		}
	static int dividir(int a, int b) {
			return Math.max(a,b)/Math.min(a,b);
		}	

}
