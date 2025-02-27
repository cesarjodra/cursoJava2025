package pruebas;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// Crea una lista de enteros con cuatro números
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(3);
		lista.add(5);
		lista.add(7);
		
		// Otra forma (desde Java 9), de crear implementaciones desde métodos estáticos
			// Mátodos "de factoria"
		List<Integer> lista2 = List.of(1,3,5,7);
	}

}
