package empresas;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

/*
 * Clase Empleado. Tendrá los siguientes atributos:
    -nombre, edad,fechaIngreso y salario
    Incluye también una constante llamada BONO con un valor cualquiera
    Además tendrá el método void incentivar(),
       que deberá ser implementado por las subclases
*/

public abstract class Empleado {
	private String nombre;
	private int edad;
	private LocalDate fechaIngreso;
	public double salario;
	public static final double BONO = 1800;

	public abstract void incentivar();
	
}
