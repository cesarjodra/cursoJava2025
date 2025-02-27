package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PruebaLectura {

	public static void main(String[] args) {
		//String dir = "c:\\ficheros-tarde\\datos.txt";
		String dir = "/ficheros-tarde/datos.txt";
		try( 
			FileReader fr=new FileReader(dir); 
			BufferedReader br=new BufferedReader(fr) 
			){
			
			String linea=br.readLine();
			while(linea!=null) {
				System.out.println(linea);
				linea=br.readLine();
			}
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
