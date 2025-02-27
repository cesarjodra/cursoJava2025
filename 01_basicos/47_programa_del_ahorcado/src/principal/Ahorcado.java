package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		
		System.out.println("BIENVENIDO AL JUEGO DEL AHORCADO");
		System.out.println("La frase a adivinar es el título de una película española");
		
		//////////////////////////////////////////////////////////////////////////////////

		// Este es el array con las frases
		String[] frases = {
				"AMANECE QUE NO ES POCO",
				"LA COLMENA",
				"OCHO APELLIDOS VASCOS",
				"AS BESTAS",
				"EL VERDUGO",
				"LOS SANTOS INOCENTES",
				"LA LENGUA DE LAS MARIPOSAS",
				"LOS LUNES AL SOL",
				"EL BOSQUE ANIMADO",
				"MAR ADENTRO",
				"EL LABERINTO DEL FAUNO"
		};
		
		//////////////////////////////////////////////////////////////////////////////////
		
		// Elegimos una frase al azar
		String elegida = frases[(int) (Math.random()*(frases.length)) ];
		
		int fallos = 3;	// Inicializamos el número posible de fallos
		
		// Aqui guardaremos las letras que se vayan probando
		ArrayList<Character> letras = new ArrayList<>();
				
		do {
			
			// Escribimos la frase en pantalla
			
			int guiones = 0; // Inicializamos el número de guiones en la palabra
			
			for(int i=0;i<elegida.length();i++) {
							
				int pos = letras.indexOf(elegida.charAt(i));
							
				if(pos != -1 || elegida.charAt(i) == ' ') {
					System.out.print(elegida.charAt(i));
				}
				else {
					System.out.print('-');
					guiones++;	// Si escribe un guión, sumamos uno al contador
				}				
							
			}
			
			if(guiones == 0) {				
				break; // Si ya no hay guiones, es que ha acertado todas las letras
			}	
		
			/* Llamamos al método para pedir la letra y la añadimos a la lista
			     de probadas si no está ya dentro de la lista  */
			
			char letra = comprobarLetra(letras, fallos); 
			
			if(letra!='~') {
				letras.add(letra);
			}	
			
			/* Llamamos al método para comprobar si la letra está en la frase  */
			
			boolean acierto = aciertoError(letra, elegida);
			
			if (!acierto && letra!='~') {
				fallos--;
			}
				
		}
		while(fallos>0);
		
		// Mensajes tras el bucle
			// Si llega al limite de fallos, pierde
			// Si no hay "guiones" en la palabra, gana
		
		if(fallos==0) {
			System.out.println("\nLo siento. Has perdido.");
		}
		else {
			System.out.println("\nEnhorabuena. Has ganado.");
		}
		
		
	}
	
	/* Método para preguntar letra al usuario y devolverla
		habiendo comprobado que no la hubiera elegido antes */	
	
	static char comprobarLetra(ArrayList<Character> letras, int fallos) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Introduce la letra que quieres probar. Puedes fallar "+fallos);
		char letra = Character.toUpperCase( scan.nextLine().charAt(0) );
				
		if ( letras.indexOf(letra) != -1 ) {
			System.out.println("Esa letra ya la has usado antes");
			return '~';
		}		
		else{
			return letra;			
		}
        
    }	
	
	/*/ Método para el control de aciertos */
		// Si la letra está en la palabra devuelve true, de lo contrario false
	
	static boolean aciertoError(char letra, String cadena) {	
		
		// return cadena.contains(letra);  // contains ya devuelve un booleano
		
		if( cadena.indexOf(letra) == -1 ) {
			return false;
		}
		else {
			return true;
		}			
			    
	}
}
