package main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

record Coche(String marca, double precio, LocalDate fechaFabricacion, int kilometros) {
	
}

public class Ordenar {

	public static void main(String[] args) {
		List<Coche> coches=new ArrayList<>(List.of(
				new Coche("Nissan",16000,LocalDate.of(2016, 8, 11),99500),
				new Coche("Seat Leon",11000,LocalDate.of(2012, 11, 4),135000),
				new Coche("Toyota Yaris",14200,LocalDate.of(2017, 3, 24),165000),
				new Coche("Audi A3",27000,LocalDate.of(2021, 5, 10),67000),
				new Coche("Golf",16000,LocalDate.of(2014, 9, 22),140000)
			)); 
		
		// Mostrar las marcas de coches ordenados de menor a mayor precio
			
		
		/*coches.sort( (a, b) -> Double.compare(a.precio(), b.precio())  );
		coches.forEach(n->System.out.println( n.marca() ));*/
		
		// en caso de igualdad de precio, ordenar por fecha (thenComparing)
		
		Comparator<Coche> comparacionPrecio = (a, b) -> Double.compare(a.precio(), b.precio());
		Comparator<Coche> comparacionFecha = (a, b) -> a.fechaFabricacion().compareTo(b.fechaFabricacion());
		
		coches.sort( comparacionPrecio.thenComparing(comparacionFecha) );		
				
		coches.forEach(n->System.out.println( n.marca() ));
		
	}

}
