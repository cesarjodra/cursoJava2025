package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Alumno;
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
					+ "1.- Introduce Alumno\r\n"
					+ "2.- Nota Media Global\r\n"
					+ "3.- Total Aprobados\r\n"
					+ "4.- Ver alumno con la nota más alta\r\n"
					+ "5.- Buscar alumno\r\n"
					+ "6.- Listar alumnos de un curso\r\n"
					+ "7.- Salir\r\n"
					+ "Introduzca la opción deseada");
			opcion = scan.nextInt();
			
			switch(opcion) {
				
				case 1 -> meteAlumno(); 
				case 2 -> verMedia(); 
				case 3 -> verAprobados();
				case 4 -> verAlumnoNotaMax();
				case 5 -> buscarAlumno();
				case 6 -> alumnosCurso();
			}
			
		}while(opcion != 7);		
		
	}
	
	// Método de introdución de alumno
	
	static void meteAlumno() {		
		Scanner scan = new Scanner(System.in);			
			System.out.println("Introduzca el DNI del alumno");
		String dni = scan.nextLine();
			System.out.println("Introduzca el nombre del alumno");
		String nombre = scan.nextLine();
			System.out.println("Introduzca la nota del alumno");
		double nota = ( Double.parseDouble(scan.nextLine()) );
			System.out.println("Introduzca el curso del alumno");
		String curso = scan.nextLine();
		
		Alumno alumno = new Alumno(dni, nombre, nota, curso);
		notasService.guardarAlumno(alumno);
		
	}
	
	// Método de calculo de media
	
	static void verMedia() {						
		System.out.println("La nota media del grupo es: "+notasService.media());
		System.out.println("----------------------------------------------------\n");
	}
	
	// Método de ver aprobados
	
	static void verAprobados() {						
		System.out.println("El número de aprobados en el grupo es: "+notasService.aprobados());
		System.out.println("----------------------------------------------------\n");
	}
	
	// Método de ver alumno con nota más alta
	
	static void verAlumnoNotaMax() {
		Alumno alumno = notasService.alumnoNotaMax();
		System.out.print("El alumno con la nota más alta es "+alumno.getNombre()+"("+alumno.getDni()+"), que ha sacado un "+alumno.getNota()+" en el curso de "+alumno.getCurso()+".");
		System.out.println("----------------------------------------------------\n");
	}
	
	// Método de ver alumno con nota más alta
	
	static void buscarAlumno() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduzca el DNI del alumno");
		String dni = scan.nextLine();
		
		Alumno alumno = notasService.buscarAlumno(dni);
		
		if(alumno!=null) {
			System.out.println("El alumno con dni "+alumno.getDni()+" es "+alumno.getNombre()+", del curso de "+alumno.getCurso()+" (nota: "+alumno.getNota()+").");
			System.out.println("----------------------------------------------------\n");
		}
		else {
			System.out.println("Ese alumno no está matriculado en ningún curso.");
			System.out.println("----------------------------------------------------\n");
		}
		
	}
	
	// Método de ver alumnos de un curso
	
		static void alumnosCurso() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introduzca el curso que busca");
			String curso = scan.nextLine();
			
			ArrayList<Alumno> listado = notasService.alumnosCurso(curso);
			
			for(Alumno a:listado) {
				System.out.println(a.getNombre());
			}
			
			
		}
	
}


