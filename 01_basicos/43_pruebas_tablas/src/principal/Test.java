package principal;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		HashMap<Integer,String> productos = new HashMap<>();	
		
		// Las claves no se pueden repetir
		productos.put(123, "agua");
		productos.put(124, "pan");
		productos.put(124, "vino"); // Sustituiría el "pan"
		productos.put(125, "leche");
		
		//System.out.println(productos.get(124));
		
		// System.out.println(productos.size());
		
		// String eliminado = productos.remove(125); // Devuelve "leche", que lo elimina
		
		// Recorrer los valores
		
		Collection<String> valores = productos.values();
		for(String s:valores) {
			System.out.println(s);
		}
		
		// Recorrer las claves
		
		Set<Integer> claves = productos.keySet();
		for(Integer s:claves) {
			System.out.println(s);
		}

		// Métodos para saber si existe una clave o un valor ya en la colección
		
		System.out.println(productos.containsKey(125));
		System.out.println(productos.containsValue("azucar"));	
	
		
	}

}
