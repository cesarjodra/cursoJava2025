package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ManipularColecciones {
	
	// Crea un método que reciba una lista de Integer
	// y devuelva la suma de los pares de dicha lista

	public int devuelveNumeros(List<Integer> lista) {
		int suma = 0;
		for(Integer n:lista) {
			if(n%2==0) {
				suma+=n;
			}
		}
		return suma;
	}
	
	//Crea un método que reciba una colección de Integer
	//y devuelva la media de los valores de dicha lista
	
	public double devuelveMedia(Collection<Integer> col) {
		double suma = 0;
		for(Integer n:col) {			
				suma+=n;			
		}
		return suma/col.size();
	}
	
	// Crea un método que reciba un conjunto de numeros enteros
	// y devuelva una lista con los positivos
	
	public List<Integer> devuelvePositivos(Set<Integer> conjunto) {	
		ArrayList<Integer> listado = new ArrayList<>();
		for(Integer n:conjunto) {			
			if(n>=0) {
				listado.add(n);
			}
		}
		return listado;
	}
	
	//Realizar un método que recibe dos colecciones de enteros
		//y devuelve un conjunto con los números comunes en ambas colecciones 
	
	public Set<Integer> devuelveComunes(Collection<Integer> c1, Collection<Integer> c2) {	
		HashSet<Integer> listaComunes = new HashSet<>();
		
		for(Integer c:c1) {
			if(c2.contains(c)) {
				listaComunes.add(c);
			}
		}	
		
		return listaComunes;
	}
	
}


