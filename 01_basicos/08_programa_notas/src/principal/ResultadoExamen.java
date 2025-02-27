package principal;
import java.util.Scanner;

public class ResultadoExamen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		
		System.out.println("Introduce la nota:");
		
		// Llamamos a una funcion del objeto Scanner que hace la lectura (un método)		
		int nota = scan.nextInt(); // Lee lo que pulse el usuario hasta INTRO
		
		String resultado;
		
		// Realizar un programa que muestre el resultado del examen
			// 1-4 Suspenso
			// 5-6 Aprobado
			// 7-8 Notable
			// 9-10 Sobresaliente
		
		// CON IF:
		
		if(nota>=1 && nota<=4) {
			resultado="Suspenso";
		}
		else if(nota>=5 && nota<=6) {
			resultado="Aprobado";
		}
		else if(nota>=7 && nota<=8) {
			resultado="Notable";
		}
		else if(nota>=9) {
			resultado="Sobresaliente";
		}
		else {
			resultado="Valor no válido";
		}
		System.out.println("Su nota es: "+resultado);
		
		// CON SWITCH
		
		String resultado2;
		
		switch(nota) {
			case 10: case 9: resultado2="Sobresaliente";break;
			case 8: case 7: resultado2="Notable";break;
			case 6: case 5: resultado2="Aprobado";break;
			case 4: case 3: case 2: case 1: resultado2="Suspenso";break;
			default: resultado2="Valor no válido";
		}
		
		System.out.println("El resultado es: "+resultado2);
		
		// CON EXPRESIONES SWITCH:		
		
		String resultado3=switch(nota) {
			case 10 -> "Sobresaliente";
			case 9 -> "Sobresaliente";
			case 8 -> "Notable";
			case 7 -> "Notable";
			case 6 -> "Aprobado";
			case 5 -> "Aprobado";
			case 4 -> "Suspenso";
			case 3 -> "Suspenso";
			case 2 -> "Suspenso";
			case 1 -> "Suspenso";
			default -> "Valor no válido";
		};
			
		System.out.println("El resultado es: "+resultado3);
		
		// CON SWITCH "ABREVIADO" (desde Java 17)
		
		String resultado4;
				
		switch(nota) {
			case 10, 9: resultado4="Sobresaliente";break;
			case 8, 7: resultado4="Notable";break;
			case 6, 5: resultado4="Aprobado";break;
			case 4, 3, 2, 1: resultado4="Suspenso";break;
			default: resultado4="Valor no válido";
		}
		
		System.out.println("El resultado es: "+resultado4);
		
		// CON EXPRESIONES SWITCH "ABREVIADAS":		
		
			String resultado5=switch(nota) {
				case 10, 9 -> "Sobresaliente";					
				case 8, 7 -> "Notable";
				case 6, 5 -> "Aprobado";
				case 4, 3, 2, 1 -> "Suspenso";
				default -> "Valor no válido";
			};	
				
			System.out.println("El resultado es: "+resultado5);

	}

}
