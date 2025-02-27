package model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Alumno {
	private String nombre;
	private String curso;
	private double nota;
	private LocalDate fechaIngreso;
}
