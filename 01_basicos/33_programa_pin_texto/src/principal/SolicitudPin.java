package principal;
import java.util.Scanner;

public class SolicitudPin {

	public static void main(String[] args) {
		// Pide el pin, y si es correcto dí que es correcto
		// Si no lo es, te informa de ello y lo pide de nuevo
		// Si falla 3 veces, le muestra mensaje de error y termina
		
		Scanner scan = new Scanner(System.in);	
		
		final String PINBUENO = "AB10";
		int intentos = 0;
		do {
			intentos++;			
			System.out.println("Introduce el pin");
			String pin = scan.nextLine(); // Metodo de Scanner para leer textos			
			
			if(pin.equals(PINBUENO)) {
				System.out.println("Tiene acceso al sistema con el pin "+pin);
				intentos=3;				
			}
			else {				
				String msg=(intentos<3) ? "Ha gastado "+intentos+" intentos" : "Ya no puede seguir tras 3 intentos";
				System.out.println("El pin "+pin+" no es correcto. "+msg);	
			}
		}
		while(intentos<3);		
	}
}
