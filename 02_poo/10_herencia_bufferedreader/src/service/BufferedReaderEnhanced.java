package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class BufferedReaderEnhanced extends BufferedReader {
	
	public BufferedReaderEnhanced(Reader in){
		super(in);
	}
	public ArrayList<String> readAll() throws IOException{
		
		ArrayList<String> lista=new ArrayList<String>();
		String linea = readLine();
		
		while(linea!=null) {			
			lista.add(linea);
			linea = readLine();
		}				
		return lista;
	}
}
	