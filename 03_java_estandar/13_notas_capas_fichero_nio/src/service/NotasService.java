package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NotasService {
	Path ruta = Path.of("c:\\ficheros-tarde\\notas.txt");
	
	private void crearFichero() {
		try {
			Files.createFile(ruta);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Método para introducir notas
	public void guardarNota(double nota) {	
			try {
				Files.writeString(ruta, String.valueOf(nota)+"\n", StandardOpenOption.APPEND,StandardOpenOption.CREATE);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	// Método para calcular media
	public double media() {	
			try {
				return Files.lines(ruta) //Stream de String
						.mapToDouble(s->Double.parseDouble(s)) //Stream de Double
						.average()
						.orElse(0);
			} catch (IOException e) {
				
				if(!ruta.toFile().exists()){
					crearFichero();
				}			
				
				return 0;
			}
	}
	
	// Método para contar aprobados
	public int aprobados() {		
		try {
			return (int) Files.lines(ruta) //Stream de String					
					.filter(s-> Double.parseDouble(s) >=5)
					.count();
					
		} catch (IOException e) {

			if(!ruta.toFile().exists()){
				crearFichero();
			}			
			
			return 0;
		}
			
	}
	
	// Método para calcular nota máxima
	public double notaMax() {
		try {
			return Files.lines(ruta) //Stream de String
					.mapToDouble(s->Double.parseDouble(s)) //Stream de Double
					.max()
					.orElse(0);
					
		} catch (IOException e) {

			if(!ruta.toFile().exists()){
				crearFichero();
			}			
			
			return 0;
		}			
	}
	
}

 
