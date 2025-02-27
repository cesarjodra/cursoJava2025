package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Anotaciones de LOMBOK

@AllArgsConstructor // Genera el constructor CON parametros
@NoArgsConstructor // Genera el constructor SIN parametros
//@Getter // Genera los getters
//@Setter // Genera los setters
@Data  // Genera los getters y setters y implementa el toString() y equals()

public class Productos {
	private String nombre;	
	private double precio;
	private String categoria;
	
}
