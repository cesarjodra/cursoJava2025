package service;

import java.util.ArrayList;
import java.util.Scanner;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	// Método para introducir notas
	public void guardarNota(double nota) {		
			notas.add(nota);
	}
	
	// Método para calcular media
	public double media() {	
			double suma=0;
			for(double n:notas) {
				suma+=n;
			}
			return suma/notas.size();
	}
	
	// Método para contar aprobados
	public int aprobados() {		
			int aprobados = 0;
			for(double n:notas) {
				if(n>=5) {
					aprobados++;
				}
			}
			return aprobados;
	}
	
	// Método para calcular nota máxima
	public double notaMax() {
			double masAlta = notas.get(0);
			for(double n:notas) {
				if(n>=masAlta) {
					masAlta = n;
				}
			}
			return masAlta;			
	}
}

 
