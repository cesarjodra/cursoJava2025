package principal;

import java.util.Scanner;

public class Precios {

	public static void main(String[] args) {
		//realizar un programa que solicite la introducción
		//de los precios de cinco productos. Después, solicita el precio
		//de un producto de muestra
		//se mostrarán los precios almacenados en el array, que sean
		//superiores al precio de muestra
		double[] precios=new double[5];
		double precioMuestra;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<precios.length;i++) {
			System.out.println("Introduce un precio:");
			precios[i]=scan.nextDouble();
		}
		System.out.println("Introduce precio de muestra");
		precioMuestra=scan.nextDouble();
		/*for(int i=0;i<precios.length;i++) {
			if(precios[i]>precioMuestra) {
				System.out.println("Precio: "+precios[i]);
			}
		}*/
		for(double p:precios) {
			if(p>precioMuestra) {
				System.out.println("Precio: "+p);
			}
		}

	}

}
