package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;

public class NotasService {
	String dir = "c:\\ficheros-tarde\\notas.txt";
	
	// Método para introducir notas
	public void guardarNota(double nota) {		
			//notas.add(nota);
			try ( FileOutputStream fos = new FileOutputStream(dir, true);
					PrintStream salida = new PrintStream(fos); ) {
				salida.println(nota);
			} 
			catch (IOException ex) {
				System.out.println("Ha habido un error recuperando el archivo.");
				ex.printStackTrace();
			}
	}
	
	// Método para calcular media
	public double media() {	
			double suma=0;
			int numero = 0;
			try( 
				FileReader fr=new FileReader(dir); 
				BufferedReader br=new BufferedReader(fr) 
				){
					
				String linea = br.readLine();				
				while(linea!=null) {
					numero++;	
					suma += Double.parseDouble(linea);
					linea=br.readLine();
				}
					
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			
			return suma/numero;
	}
	
	// Método para contar aprobados
	public int aprobados() {		
			int aprobados = 0;
			try( 
				FileReader fr=new FileReader(dir); 
				BufferedReader br=new BufferedReader(fr) 
				){
						
				String linea = br.readLine();				
				while(linea!=null) {						
					if(Double.parseDouble(linea)>=5) {
						aprobados++;
					}
					linea=br.readLine();
				}
						
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}
			return aprobados;
	}
	
	// Método para calcular nota máxima
	public double notaMax() {
		double masAlta = 0;
			try( 
				FileReader fr=new FileReader(dir); 
				BufferedReader br=new BufferedReader(fr) 
				){
					
				String linea = br.readLine();					
				while(linea!=null) {						
					if(Double.parseDouble(linea) > masAlta) {
						masAlta = Double.parseDouble(linea);
					}
					linea=br.readLine();
				}
						
			}
			catch(IOException ex) {
				ex.printStackTrace();
			}			
			return masAlta;			
	}
	
}

 
