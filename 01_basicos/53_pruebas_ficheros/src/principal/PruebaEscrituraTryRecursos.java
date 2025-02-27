package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscrituraTryRecursos {

	public static void main(String[] args) {
		String dir = "c:\\ficheros-tarde\\datos.txt";		
		
		// El "Try con recursos" declara los objetos como parámetros del propio try
			// haciendo que se cierren solos al salir del try sin necesitar close()
		try ( FileOutputStream fos = new FileOutputStream(dir, true);
				PrintStream salida = new PrintStream(fos); ) {
			salida.println("Quinta frase.");
			salida.println("Sexta frase.");
			salida.close();
		} 
		catch (FileNotFoundException ex) {
			System.out.println("Ha habido un error recuperando el archivo.");
			ex.printStackTrace();
		}	
		catch (IOException ex) {
			System.out.println("Ha habido un error recuperando el archivo.");
			ex.printStackTrace();
		}

	}
}