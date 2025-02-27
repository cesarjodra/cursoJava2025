package principal;

import java.util.Scanner;

public class Presupuesto {

	public static void main(String[] args) {
		String[] precios= {
				"Volvo-11500",
				"Audi A1-22300",
				"Toyota Yaris-17400",
				"Seat Ibiza-9800",
				"Mercedes A-18000",
				"BMW-25450",
				"Mercedes B-16200"
				};
		
		// Se solicita la introducción de un presupuesto (en euros)
		// Con el precio máximo, mostraremos aquellos nombres de coches que puede comprar
		
		String[] coches = new String[precios.length];
		int[] coste = new int[precios.length];		
		for(int i=0;i<precios.length;i++) {			
			int indice = precios[i].indexOf("-");
			coches[i] = precios[i].substring(0,indice);
			coste[i] = Integer.parseInt( precios[i].substring(indice+1) );			
		}		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce tu presupuesto máximo");
		int presupuesto = scan.nextInt();
		boolean alguno = false;
		for(int j=0;j<coste.length;j++) {
			if(presupuesto>=coste[j]) {
				System.out.println("Puedes comprar un "+coches[j]+" ("+coste[j]+" euros)");
				alguno = true;
			}
		}		
		if(!alguno) {
			System.out.println("No puedes comprar ningun coche con un presupuesto de "+presupuesto+" euros.");
		}
	}
}
