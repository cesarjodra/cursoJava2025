package principal;

public class ContarVocales {

	public static void main(String[] args) {
		String texto="Esto es una cadenA de prueba";
		
		// Contar el número de vocales en el texto
				
		int contador = 0;
		
		for(int i=0;i<texto.length();i++) {			
			
			switch( texto.toLowerCase().charAt(i) ) {
				case 'a','e','i','o','u': contador++; break;
			}
			
		}

		System.out.println(contador+" vocales en el texto");
		
	}

}
