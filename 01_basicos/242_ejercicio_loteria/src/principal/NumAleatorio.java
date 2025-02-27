package principal;

public class NumAleatorio {

	public static void main(String[] args) {
		// Lotería con números aleatorios
			// Generar 6 numeros entre 1 y 49
			// No puede haber repetidos
			// Mostrar ordenados
		
		// Creo una matriz para guardar los numeros	según vayan saliendo	
		int[] numeros = new int[6];
		
		// Con un bucle for vamos a generar los 6 números
		for(int i=0;i<6;i++) {				
			
			// Variables vacías que se llenaran en el bucle
			int numAleatorio; 		
			boolean existe;	// Booleana de control
			
			do {
				existe = false; // Reinicio de la booleana de control
				
				numAleatorio = (int)Math.floor(Math.random()*49+1);
					/* Usamos (int) para la concordancia de tipos,
					ya que Math genera double */
				
				// Recorro la matriz en busca del número que ha salido
				for(int j=0;j<6;j++) {				
					
					if(numAleatorio==numeros[j]) {
						// Si hay concordancia, existe ya el número						
							// Marcamos la condición booleana como true
						existe = true;						
							// Y salimos del bucle interno
						j=6; // Se incumple la condición del bucle. O usamos break
					
					}				
				} 
			}
			while (existe);				
				
				// Guardamos el número generado en la posición i del array
					numeros[i]=numAleatorio;						
		}
		
		// Imprimimos la matriz original sin ordenar
		System.out.print("Números sin ordenar: ");  
		for(int n:numeros) {
			System.out.print(n+" ");
		}	
		System.out.println("");
		
		
		
		// Forma de ordenar los números ( hasta ver sort() )
		
		// Nueva matriz para ir guardando los número por orden
		int[] numerosOrdenados = new int[6];
		
		// La recorremos buscando el número más bajo
		for(int k=0;k<6;k++) {
		
			int numMenor = 50; // El límite por arriba, que iremos bajando
			int indice = -1; // La posición del índice de la matriz, donde escribiremos
			
			for(int l=0;l<6;l++) {	
				// Buscamos un número menor que el numeMenor
				if (numeros[l]<=numMenor) {
					numMenor = numeros[l]; // Si lo hay, actualizamos numMenor con ese
					indice = l; // Cambiamos el índice por la pos del numero encontrado
				}				
			}
			
			numerosOrdenados[k]=numMenor; // Escribimos el número menos en la nueva matriz			
			numeros[indice] = 50; // Cambiamos el valor antiguo del número menor original
								  // por 50, para que lo ignore en sucesivas iteraciones
		
		}		
		
		// Imprimimos la nueva matriz tras la ordenación
		System.out.print("Números ya ordenados: ");
		for(int n:numerosOrdenados) {
			System.out.print(n+" ");
		}	
		System.out.println("");
		
		// Imprimimos la matriz original con todos los números cambiados a 50
		System.out.print("Matriz original cambiada: ");
		for(int n:numeros) {
			System.out.print(n+" ");
		}
		System.out.println("");
	}
}