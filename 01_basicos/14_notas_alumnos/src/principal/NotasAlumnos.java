package principal;
import java.util.Scanner;
public class NotasAlumnos {

	public static void main(String[] args) {
		// Solicita la introducción de 10 notas de alumnos
		// Las notas estarán entre 1.0 y 10.0
		// Una vez introducidas mostraremos:
			// Nota media del grupo
			// Número de aprobados
			// Nota mas alta
			// Nota mas baja
		
		Scanner scan = new Scanner(System.in);
		double notas = 0;
		int numAprobados = 0;
		double notaMax = 0;
		double notaMin = 10;
		
		for(int i=1;i<=10;i++) {
			System.out.println("Introduce la nota del alumno "+i);
			double nota = scan.nextDouble();	
			if (nota>10 || nota <1) {
				System.out.println("Esa nota no es válida. Debe ser entre 1.0 y 10.0");
				i--;				
			}
			else {
				notas += nota;
				if (nota>=5) {numAprobados++;}
				if (nota>notaMax) {notaMax=nota;}
				if (nota<notaMin) {notaMin=nota;}
			}			
		}
			
		double notaMedia = notas/10;
		System.out.println("Han aprobado "+numAprobados+" alumnos. ");		
		System.out.println("La nota media del grupo es "+notaMedia);
		System.out.println("La nota más alta es "+notaMax);
		System.out.println("La nota más baja es "+notaMin);
	}
}
