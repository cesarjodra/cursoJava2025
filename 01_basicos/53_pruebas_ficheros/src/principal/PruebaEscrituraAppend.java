package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PruebaEscrituraAppend {

	public static void main(String[] args) {
		String dir = "c:\\ficheros-tarde\\datos.txt";
		FileOutputStream fos = null;
		PrintStream salida = null;		
		try {
			fos=new FileOutputStream(dir, true);
			salida= new PrintStream(fos); 
			salida.println("Tercera frase.");
			salida.println("Cuarta frase.");
			salida.close();
		} 
		catch (FileNotFoundException ex) {
			System.out.println("Ha habido un error recuperando el archivo.");
			ex.printStackTrace();
		}	
		finally { // Vaya tela !!!
			if(salida!=null) {
				salida.close();
			}	
			if(fos!=null) {
				try{
					fos.close();
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
	}
}
