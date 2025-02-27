package principal;

public class SumaMil {

	public static void main(String[] args) {
		// Hasta que número tenemos que sumar empezando por 1 para que la suma
		// alcance o supere el valor 1000
		
		int num = 0;
		int numSuma = 0;
		
		do {	
			numSuma++;
			num+=numSuma;	
						
		}
		while(num<1000);
		
		System.out.println("El último número es "+num);
		System.out.println("El  número sumado es "+numSuma);

	}

}
