package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PruebaEscritura {

	public static void main(String[] args) {		
		String dir = "c:\\ficheros-tarde\\datos.txt";		
		PrintStream salida=null;
		try {
			salida = new PrintStream(dir);
			salida.println("Primera frase.");
			salida.println("Segunda frase.");			
		} 
		catch (FileNotFoundException ex) {
			System.out.println("Ha habido un error recuperando el archivo.");
			ex.printStackTrace();
		}	
		finally {
			if(salida!=null) {
				salida.close();
			}			
		}
	}

}
