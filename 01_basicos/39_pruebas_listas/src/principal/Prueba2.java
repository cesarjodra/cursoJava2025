package principal;

import java.util.ArrayList;

public class Prueba2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> edades = new ArrayList<>();
		
		edades.add(20); // Se convierte a objeto por el Autoboxing
		edades.add(30);
		int suma=0;
		
		for(Integer n:edades) {
			suma+=n;
		}
		
		System.out.println(suma);

	}

}
