package principal;

import java.time.LocalDate;

public class TestFechasNuevas {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		LocalDate ld2 = LocalDate.of(2020, 11, 30);

		// ¿Fecha más moderna?
		
		if(ld.isAfter(ld2)) {
			System.out.println(ld);
		}
		else {
			System.out.println(ld2);
		}
		
		// Que fecha será dentro de dos años, tres meses y veinte días
		
		LocalDate ldf = ld.plusYears(2).plusMonths(3).plusDays(20);
		
		System.out.println(ldf);
		
	}

}
