package service;

import java.util.ArrayList;
import model.Alumno;

public class NotasService {
	private ArrayList<Alumno> alumnos = new ArrayList<>();
	
	// Método para introducir notas
	public void guardarAlumno(Alumno alumno) {		
		alumnos.add(alumno);	
	}
	
	// Método para calcular media
	public double media() {	
		double media = 0;
		for(Alumno a:alumnos) {
			media += a.getNota();			
		}
		return media/alumnos.size();
	}
	
	// Método para contar aprobados
	public int aprobados() {		
		int aprobados = 0;
		for(Alumno a:alumnos) {
			if(a.getNota() >= 5) {
				aprobados++;
			}
		}
		return aprobados;	
	}
	
	// Método para calcular nota máxima
	public Alumno alumnoNotaMax() {
		double masAlta = alumnos.get(0).getNota();
		Alumno alumno = alumnos.get(0);
		for(Alumno a:alumnos) {
			if(a.getNota()>= masAlta) {
				masAlta = a.getNota();
				alumno = a;
			}
		}
		return alumno;		
	}
	
	// Método para buscar alumno
		public Alumno buscarAlumno(String dni) {			
			Alumno alumno = null;
			for(Alumno a:alumnos) {
				if(a.getDni().equalsIgnoreCase(dni)) {					
					alumno = a;
					break;
				}
			}
			return alumno;		
		}
		
		// Método para ver alumno de un curso
		public ArrayList<Alumno> alumnosCurso(String curso) {			
			ArrayList<Alumno> listado = new ArrayList<>();
			
			for(Alumno a:alumnos) {
				if(a.getCurso().equalsIgnoreCase(curso)) {					
					listado.add(a);
				}
			}
			
			return listado;		
		}
}

 
