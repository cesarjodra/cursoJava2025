package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BuscadorFechas {

	public static void main(String[] args) {
		String[] fechas= {"11/02/1989","12/07/2023","23/07/2020","01/12/2018","30/10/2017"}; 
		
		// Imprimir la fecha más actual
		
		LocalDate fechaActual = convertirFecha(fechas[0]);
		
		for(String f:fechas) {
			LocalDate fechaNueva = convertirFecha(f);
			if(fechaNueva.isAfter(fechaActual)) {
				fechaActual = fechaNueva;
			}
		}		
		System.out.println(fechaActual);

	}
	
	// Método para convertir textos a fechas
	
	static LocalDate convertirFecha(String texto) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld=LocalDate.parse(texto, formato);
		return ld;				    
	}
		
	

}
