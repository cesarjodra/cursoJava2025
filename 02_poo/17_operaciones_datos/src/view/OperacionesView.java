package view;

import java.util.List;

import service.Condicion;
import service.Operaciones;
import service.Transformacion;

public class OperacionesView {

	public static void main(String[] args) {
		
		List<Integer> lista = List.of(5,8,-1,-6,4,-2,11,25);
		Operaciones operaciones=new Operaciones();
		
		// Mostrar:
		
		// Suma de positivos:		
		System.out.println("Suma de positivos: "+operaciones.sumaPorCondicion(lista, new Positivos()));
		
		// Suma de impares:		
		System.out.println("Suma de impares: "+operaciones.sumaPorCondicion(lista, new Impares()));
		
		// Suma de multiplos de 5:		
		System.out.println("Suma de múltiplos de 5: "+operaciones.sumaPorCondicion(lista, new MultiCinco()));

		List<String> listaTextos = List.of("perro azul", "gato atrigrado mimoso", "tigre que come cebras", "cebra huyendo de un tigre rabioso");
		
		// Contar letras:		
		System.out.println("Número de letras: "+operaciones.transformarCadenas(listaTextos, new Longitudes()));
		
		// Contar espacios:		
		System.out.println("Número de espacios: "+operaciones.transformarCadenas(listaTextos, new Espacios()));

		
	}	

}

// Clases de números

class Positivos implements Condicion{
	@Override
	public boolean test(Integer num) {
		if (num>=0){
			return true;
		}
		return false;
	}	
}

class Impares implements Condicion{
	@Override
	public boolean test(Integer num) {
		if (num%2!=0){
			return true;
		}
		return false;
	}	
}

class MultiCinco implements Condicion{
	@Override
	public boolean test(Integer num) {
		if (num%5==0){
			return true;
		}
		return false;
	}	
}

// Clases de textos

class Longitudes implements Transformacion{
	@Override
	public int test(String texto) {
		return texto.length();
	}	
}

class Espacios implements Transformacion{
	@Override
	public int test(String texto) {
		int espacios = 0;
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i) == ' ') {
				espacios++;
				}
		}		
		return espacios;
	}	
}
