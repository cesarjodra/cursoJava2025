package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Alumno;

public class AlumnosService {
	List<Alumno> alumnos=new ArrayList<>(List.of(
			new Alumno("al1","Java EE",8.9,LocalDate.of(2023, 11, 10)),
			new Alumno("al2","Spring 6",3.5,LocalDate.of(2024, 7, 20)),
			new Alumno("al3","Spring 6",7,LocalDate.of(2022, 12, 1)),
			new Alumno("al4","Java EE",4.5,LocalDate.of(2023, 5, 22)),
			new Alumno("al5","Hibernate",7.8,LocalDate.of(2024, 4, 4)),
			new Alumno("al6","Java EE",5.5,LocalDate.of(2023, 3, 11))
			));
	
	public List<String> cursos(){
		return alumnos.stream()
				.map(Alumno::getCurso)
				.distinct()
				.toList();
	}
	
	public List<Alumno> alumnosCursos(String curso){
		return alumnos.stream()
				.filter(a->a.getCurso().equals(curso))
				.toList();
	}
	
}
