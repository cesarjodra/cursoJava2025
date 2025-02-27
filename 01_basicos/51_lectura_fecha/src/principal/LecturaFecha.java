package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class LecturaFecha {

	public static void main(String[] args) {
		// Realizar un programa que solicite al usuario la introducción de una fecha
		// en formato días/mes/año. El programa nos dirá si la fecha introducida es
		// o no posterior a la fecha actual.
		// Si introduce mal la fecha, se mostrará un mensaje de advertencia y terminamos
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("Introduce una fecha en formato DD/MM/AAAA");
			String texto = scan.nextLine();		
			DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fecha=LocalDate.parse(texto, formato);
			System.out.println(fecha);
			
			if(fecha.isAfter( LocalDate.now() )) {
				System.out.println("La fecha introducida es posterior a la de hoy.");
			}
			else {
				System.out.println("La fecha introducida es anterior a la de hoy.");
			}
			
		}
		catch(DateTimeParseException ex) {
			System.out.println("El formato introducido no es correcto");
		}
		finally {
			System.out.println("Gracias por usar nuestro programa. Hasta pronto");
		}

	}

}
