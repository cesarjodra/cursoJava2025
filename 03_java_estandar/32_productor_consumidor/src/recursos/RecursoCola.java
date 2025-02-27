package recursos;

import java.util.ArrayList;
import java.util.List;

public class RecursoCola {
	List<Integer> cola = new ArrayList<>();
	final int CAPACIDAD = 5;
	
	// Método para guardar en la cola
	public void guardar(Integer num) {
		cola.add(0, num);
	}
	
	// Método para sacar de la cola
	public int sacar() {
		return cola.remove(cola.size()-1);
	}
	
	// Método para ver si está lleno
	public boolean estaLleno() {
		return cola.size()==CAPACIDAD;
	}
	
	// Método para ver si está vacío
	public boolean estaVacio() {
		return cola.size()==0;
	}
}
