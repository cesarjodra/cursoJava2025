package principal;

import java.util.ArrayList;
import model.Curso;

public class Prueba {

	public static void main(String[] args) {
		Curso curso = new Curso("Java SE", 150, 300);
		Curso curso2 = new Curso("Spring", 60, 100);
		Curso curso3 = new Curso("Hibernate", 50, 90);
		ArrayList<Curso> lista = new ArrayList<>();
		lista.add(curso);
		lista.add(curso2);
		lista.add(curso3);
		
		for(Curso c:lista) {
			System.out.println(c.getNombre());
			System.out.println(c.getPrecio());
			System.out.println(c.getDuracion());
			System.out.println("");
		}
	}

}
