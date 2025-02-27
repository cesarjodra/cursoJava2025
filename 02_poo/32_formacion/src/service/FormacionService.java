package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Alumno;
import model.Curso;

public class FormacionService {
	List<Curso> cursos=new ArrayList<>(List.of(
			new Curso("Java","Programación",120,LocalDate.of(2014, 11, 10),LocalDate.of(2015, 1, 30),List.of(new Alumno("a1",5.6),
					new Alumno("a2",8),new Alumno("a8",6),new Alumno("b7",4))),
			new Curso("Angular","Programación",80,LocalDate.of(2021, 06, 10),LocalDate.of(2021, 9, 8),List.of(new Alumno("r2",3.6),
					new Alumno("a2",7),new Alumno("b4",5))),
			new Curso("HTML y CSS","Web",60,LocalDate.of(2019, 03, 15),LocalDate.of(2019, 5, 30),List.of(new Alumno("r9",4),
					new Alumno("v4",6),new Alumno("h1",3),new Alumno("s9",5),new Alumno("k2",2))),
			new Curso("Oracle","Bases de datos",100,LocalDate.of(2020, 10, 20),LocalDate.of(2021, 2, 12),List.of(new Alumno("s10",9),
					new Alumno("r1",4))),
			new Curso("SQL","Bases de datos",40,LocalDate.of(2018, 02, 06),LocalDate.of(2018, 4, 20),List.of(new Alumno("y6",7),
					new Alumno("u7",2),new Alumno("b8",4),new Alumno("t2",6))),
			new Curso("Python","Programación",90,LocalDate.of(2016, 10, 23),LocalDate.of(2017, 3, 30),List.of(new Alumno("l9",7.6),
					new Alumno("g5",3),new Alumno("n1",8.4),new Alumno("x6",5.9)))
			
			)); 
	
	// Añade un nuevo curso, siempre y cuando no coincida mismo nombre de curso y
		// fecha de inicio con otro ya existente. Tipo de devolución boolean

	public boolean altaCurso(Curso cursoNuevo) {	
		if(cursos.stream()
			.noneMatch(n->cursoNuevo.getNombre().equals(n.getNombre()) 
					&& cursoNuevo.getFechaInicio().equals(n.getFechaInicio()))) {
			cursos.add(cursoNuevo);
			return true;
		}else {
			return false;
		}
	}

	// Precio medio de los cursos cuya temática se recibe como parámetro
	
	public double precioMedio(String tema) {
		return cursos.stream()
				.filter(c->c.getTematica().equals(tema))
				.collect(Collectors.averagingDouble(c->c.getPrecio()))
			;
	}
	
	// Total de cursos finalizados antes de una determinada fecha recibida como param.
	
	public int cursosFinFecha(LocalDate fecha) {
		return (int) cursos.stream()
				.filter(c->c.getFechaFin().isBefore(fecha))
				.count();				
	}
	
	// Lista de cursos correspondientes a la temática recibida como param.
	
	public List<Curso> listadoCursosPorTema(String tema){
		return cursos.stream()
				.filter(c->c.getTematica().equals(tema))
				.collect(Collectors.toList());
	}
	
	// Lista de temáticas
	
	public List<String> listaTemas(){
		return cursos.stream()				
				.map(c->c.getTematica())
				.distinct()
				.sorted()
				.collect(Collectors.toList());				
	}
	
	// Lista de alumnos matriculados en cursos cuya temática se recibe como param.
	
	public List<Alumno> alumnosPorTema(String tema){
		return cursos.stream()
			.filter(c->c.getTematica().equals(tema)) 
			.flatMap(c->c.getAlumnos().stream()) 
			.distinct() // Es necesario sobreescribir el método equals, para solo nombre
			.collect(Collectors.toList())
			;						
	}	
	
	// Alumno con mayor nota
	
	public Alumno alumnoNotaMax(){
		return cursos.stream()	
				.flatMap(c->c.getAlumnos().stream())
				//.max((a,b)->Double.compare(a.getNota(),b.getNota()))
				.max(Comparator.comparingDouble(a->a.getNota()))
				.orElse(null)
			;		
	}
	
	// Nota media del curso que se recibe como párametro
	
	public double notaMediaCurso(String curso){
		return cursos.stream()	
				.filter(c->c.getNombre().equals(curso))
				.flatMap(c->c.getAlumnos().stream())
				.collect(Collectors.averagingDouble(a->a.getNota()))
			;		
	}
}
 