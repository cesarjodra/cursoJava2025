package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Curso {
	private int idCurso;
	private String denominacion;
	private int duracion;
	private double precio;
	private LocalDate fechaInicio;
}
