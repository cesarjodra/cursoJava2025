package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
// Comentario de prueba para ver Github
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Cliente {

	private int dni;
	private String nombre;
	private String direccion;
	private int telefono;
	@Override
	public String toString() {
		return nombre;
	}
	
	

} 
