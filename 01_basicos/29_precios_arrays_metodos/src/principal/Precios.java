package principal;

import java.util.Scanner;

public class Precios {

	public static void main(String[] args) {
		//realizar un programa que solicite la introducción
		//de los precios de cinco productos. Después, solicita el precio
		//de un producto de muestra
		//se mostrarán los precios almacenados en el array, que sean
		//superiores al precio de muestra
		
		double[] precios=obtenerPrecios();
		
		Scanner scan=new Scanner(System.in);
		double precioMuestra;
		System.out.println("Introduce precio de muestra");
		precioMuestra=scan.nextDouble();
		
		mostrarPrecios(precios, precioMuestra);
			

	}
	
	static double[] obtenerPrecios() {
		Scanner scan=new Scanner(System.in);		
		double[] precios=new double[5];
		for(int i=0;i<precios.length;i++) {
			System.out.println("Introduce un precio:");
			precios[i]=scan.nextDouble();
		}		
		
		return precios;
		
	}	
	
	static void mostrarPrecios(double[] precios, double muestra) {	
		
		for(double p:precios) {
			if(p>muestra) {
				System.out.println("Precio: "+p);
			}
		}
	}

}
