package service;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	// Método para introducir notas
	public void guardarNota(double nota) {		
			notas.add(nota);
	}
	
	// Método para calcular media
	public double media() {	
		/*return notas.stream()
				.mapToDouble(t->t)
				.average()
				.orElse(0)
				;*/
		return notas.stream()
				.collect(Collectors.averagingDouble(t->t))				
				;
	}
	
	// Método para contar aprobados
	public int aprobados() {		
		return (int)notas.stream()
				.filter(n->n>=5)
				.count()
				;
	}
	
	// Método para calcular nota máxima
	public double notaMax() {
		return notas.stream()				
				.mapToDouble(t->t)
				.max()
				.orElse(0)
				;	
	}
}

 
