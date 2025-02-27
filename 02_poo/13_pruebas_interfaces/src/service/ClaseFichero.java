package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

//La escritura (metodo) se realizará en fichero, cuya direccón se le pasa al constructor de la clase,
// y la lectura (metodo) será la primera línea de ese fichero

public class ClaseFichero implements Operaciones {
	private String ruta;

	public ClaseFichero(String ruta) {
		super();
		this.ruta = ruta;
	}

	@Override
	public void escribir(String dato) {
		try(FileOutputStream fos = new FileOutputStream(ruta, true);
				PrintStream salida = new PrintStream(fos);)
		{
			salida.println(dato);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

	@Override
	public String leer() {
		String linea="";	
		try( 
			FileReader fr=new FileReader(ruta); 
			BufferedReader br=new BufferedReader(fr) 
			){				
			linea=br.readLine();				
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		return linea;
	}

	

}
