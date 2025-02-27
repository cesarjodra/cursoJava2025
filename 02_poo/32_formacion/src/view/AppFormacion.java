package view;

import java.util.List;

import model.Alumno;
import service.FormacionService;

public class AppFormacion {

	public static void main(String[] args) {
		var formacionService = new FormacionService();
		List<Alumno> alumnos = formacionService.alumnosPorTema("Programación");
		alumnos.forEach(a->System.out.println(a.getNombre()));

	}

}
