package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TestFormato {

	public static void main(String[] args) {
		
		// Convertir texto a fecha
		
		String texto = "10/11/2028";
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld1=LocalDate.parse(texto, dtf1);
		System.out.println(ld1);
		
		// Convertir fecha a texto
		
		//DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd / MM / yyyy"); 
		DateTimeFormatter dtf2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate ld2=LocalDate.now(); 
		System.out.println(ld2.format(dtf2));

	}

}
