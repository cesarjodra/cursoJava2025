package main;

import java.util.List;
import java.util.Optional;

import model.Ciudad;

public class CalculosCiudades {

	public static void main(String[] args) {
		List<Ciudad> ciudades = List.of(
				new Ciudad("Sevilla", 1100000),
				new Ciudad("Madrid", 3300000),
				new Ciudad("Zaragoza", 70000),
				new Ciudad("Londres", 5600000)
				);
		
		// Nombre de la ciudad más poblada
		
		Optional<Ciudad> opC = ciudades.stream()
				.max( (a,b)-> Long.compare(a.habitantes(),b.habitantes() ) 
				);
				
		System.out.println( opC.get().nombre() );	
		
		// Nombre de todas las ciudades de más de 1M habitantes
			// Ordenados alfabeticamente
		
		ciudades.stream()
				.filter(c-> c.habitantes()>1000000)
				.sorted( (a,b) -> a.nombre().compareTo(b.nombre()) )
				.forEach(c->System.out.println(c.nombre())
				);
				
		
		
	}

}
