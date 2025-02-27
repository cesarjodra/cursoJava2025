package principal;
import java.util.Scanner;

public class Sumatorio {

	public static void main(String[] args) {
		// Hacer un programa que lea dos números
		// y muestre la suma de todos los enteros comprendidos entre ellos	
		
		// LECTURA DE LOS NUMEROS POR TECLADO
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce el primer número:");
		int num1 = scan.nextInt();
		System.out.println("Introduce el segundo número:");
		int num2 = scan.nextInt();
		
		System.out.println("El primer número es "+num1+" y el segundo "+num2);
		
		// GENERACIÓN DE LA SUMA DE ELEMENTOS
		
		int suma = 0;
		for(int i=num1; i<=num2 ;i++) {
			suma += i;
		}		
	
		System.out.println("La suma de los números es "+suma);
		
	}
}
