package principal;

import java.util.Scanner;

public class Acertijo {

	public static void main(String[] args) {
		//partimos de un número cualquiera entre 1 y 10 almacenado
		//en una variable
		int numero=7;
		//se pide al usuario que introduzca un número entre 1 y 10
		//si coincide con el número oculto, se le dice que ha acertado
		//y el programa acaba. Si no coincide, se le pide otro. Así, hasta
		//4 oportunidades. Si tras cuatro oportunidades no acierta
		//se muestra un mensaje indicando que ha perdido y el programa termina
		Scanner scan=new Scanner(System.in);
		boolean acertado=false;
		for(int i=1;i<=4;i++) {
			System.out.println("Introduce número:");
			int nLeido=scan.nextInt();
			if(nLeido==numero) {
				acertado=true;
				break;
			}else {
				if(i!=4) {
					System.out.println("No acertado, intenta otra vez");
				}
			}
		}
		if(acertado) {
			System.out.println("Enhorabuena, has acertado");
		}else {
			System.out.println("Fin del juego, has perdido!");
		}
	}

}
