package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasAlumnos {

	public static void main(String[] args) {
		// Solicita la introducción de una nota y la guarda
		// Pregunta si quiere introducir otra
			// Si afirmativo, lo vuelve a hacer
			// Si negativo, muestra en pantalla la nota media, total aprobados y nota mas alta
		
		ArrayList<Double> notas = new ArrayList<>();
		
		boolean seguir = false;
		
		Scanner scan = new Scanner(System.in);
		
		do {
			
			System.out.println("Introduzca la nota del alumno");
			notas.add( Double.parseDouble(scan.nextLine()) );
			
			System.out.println("¿Desea usted introducir otra nota?");
			String masNotas = scan.nextLine();
			if(masNotas.equalsIgnoreCase("si")) {
				seguir = true;
			}
			else {
				seguir = false;
			}
		}
		while(seguir);
		
		System.out.println("La nota media de la clase es "+calculaMedia(notas));
		System.out.println("Han aprobado "+cuentaAprobados(notas)+" alumnos.");
		System.out.println("La nota más alta de la clase es "+calculaMax(notas));	
		
	}
	
	// Método de calculo de media. Devuelve la media (double)
	
	static double calculaMedia(ArrayList<Double> listaDatos) {
		double suma=0;
		for(double n:listaDatos) {
			suma+=n;
		}
		return suma/listaDatos.size();
	}	
	
	// Método de calculo de aprobados. Devuelve el numero (int)	
	
	static int cuentaAprobados(ArrayList<Double> listaDatos) {
		int aprobados = 0;
		for(double n:listaDatos) {
			if(n>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}	
	
	// Método de calculo de nota más alta. Devuelve la más alta (double)
	
	static double calculaMax(ArrayList<Double> listaDatos) {
		double masAlta = listaDatos.get(0);
		for(double n:listaDatos) {
			if(n>=masAlta) {
				masAlta = n;
			}
		}
		return masAlta;
	}	

}
