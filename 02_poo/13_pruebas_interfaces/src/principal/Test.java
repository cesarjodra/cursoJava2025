package principal;

import java.util.ArrayList;

import service.ClaseFichero;
import service.ClaseUsuario;
import service.Operaciones;

public class Test {

	public static void main(String[] args) {
		// Usando polimorfismo, realizar un programa que muestre una lista de nombres
			// en consola y guarde cada nombre en un fichero
		ArrayList<String> nombres=new ArrayList<>();
		nombres.add("nombre 1");
		nombres.add("nombre 2");
		nombres.add("nombre 3");
		nombres.add("nombre 4");

		operar(new ClaseUsuario(), nombres);
		operar(new ClaseFichero("c:\\ficheros\\names.txt"),nombres);
	}
	static void operar(Operaciones op, ArrayList<String> datos) {
		for(String dato:datos) {
			op.escribir(dato);
		}
		
	}
}
