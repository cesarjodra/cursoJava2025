package principal;

import java.util.Scanner; // Importo la clase Scanner para entrada de teclado
						// Con CTRL+SHIFT+O importa automáticamente todo lo que
						// estes usando y no esté importado				

public class CalculoFactura {

	public static void main(String[] args) {
		
		// Crear el objeto Scanner sobre la clase importada
		Scanner scan;
		scan = new Scanner(System.in);		
		
		double precioUnitario = 4.8;
		int unidadesCompradas;
		
		System.out.println("Introduce unidades a comprar:");
		
		// Llamamos a una funcion del objeto Scanner que hace la lectura (un método)
		
		unidadesCompradas = scan.nextInt(); // Lee lo que pulse el usuario hasta INTRO		
		
		// Calcular el precio final, según:
			// Si compramos entre 5-7 unidades, descuento del 10%
			// Si compramos entre 3-4 unidades, descuento del 5%
			// Si compramos entre 1-2 unidades, sin descuento		
		
		double descuento=switch(unidadesCompradas) {
			case 7, 6, 5 -> 0.9;
			case 4, 3 -> 0.95;
			default -> 1;
		};
		
		double precioAntesImpuestos = precioUnitario*unidadesCompradas;		
		double precioFinal = precioAntesImpuestos*descuento;
		
		System.out.println("El precio antes del descuento es "+precioAntesImpuestos);
		System.out.println("El precio a pagar tras el descuento es "+precioFinal);

	}

}
