package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	private String categoria;
	
}
