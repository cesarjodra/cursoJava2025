package main;

import tareas.TareaAscendente;
import tareas.TareaDescendente;

public class LanzadorTareas {

	public static void main(String[] args) {		
		
		var t1 = new TareaAscendente();
		var t2 = new TareaDescendente();
		
		new Thread(t1).start(); // Al no heredar la clase Thread, hay que hacerlo así
		new Thread(t2).start();

	}

}
