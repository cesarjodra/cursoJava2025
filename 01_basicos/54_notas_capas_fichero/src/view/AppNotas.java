package view;

import java.util.ArrayList;
import java.util.Scanner;

import service.NotasService;

public class AppNotas {
	static NotasService notasService = new NotasService();
	public static void main(String[] args) {		

		// Mostrar menu en pantalla y esperar respuesta
		Scanner scan = new Scanner(System.in);
		int opcion;
		do {				
			System.out.println(
					"MENU DE OPCIONES: \r\n"
					+ "1.- Introduce nota\r\n"
					+ "2.- Media\r\n"
					+ "3.- Total Aprobados\r\n"
					+ "4.- Nota más alta\r\n"
					+ "5.- Salir\r\n"
					+ "Introduzca la opción deseada");
			opcion = scan.nextInt();
			
			switch(opcion) {
				// case 1: meteNotas(); break;
				// case 2: verMedia(); break;
				// case 3: verAprobados(); break;
				// case 4: verNotaMax(); break;
				
				case 1 -> meteNotas(); 
				case 2 -> verMedia(); 
				case 3 -> verAprobados();
				case 4 -> verNotaMax();
			}
			
		}while(opcion != 5);		
		
	}
	
	// Método de introdución de notas
	
	static void meteNotas() {		
		Scanner scan = new Scanner(System.in);				
		System.out.println("Introduzca la nota del alumno");
		notasService.guardarNota( Double.parseDouble(scan.nextLine()) );
		System.out.println("----------------------------------------------------");
	}
	
	// Método de calculo de media
	
	static void verMedia() {						
		System.out.println("La nota media del grupo es: "+notasService.media());
		System.out.println("----------------------------------------------------");
	}
	
	// Método de ver aprobados
	
	static void verAprobados() {						
		System.out.println("El número de aprobados en el grupo es: "+notasService.aprobados());
		System.out.println("----------------------------------------------------");
	}
	
	// Método de ver nota más alta
	
	static void verNotaMax() {						
		System.out.println("La nota más alta del grupo es: "+notasService.notaMax());
		System.out.println("----------------------------------------------------");
	}
	
}


