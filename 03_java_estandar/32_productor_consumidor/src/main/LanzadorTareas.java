package main;

import recursos.RecursoCola;
import tareas.HiloConsumidor;
import tareas.HiloProductor;

public class LanzadorTareas {

	public static void main(String[] args) {

		RecursoCola cola = new RecursoCola();
		
		new Thread(new HiloProductor(cola)).start();
		new Thread(new HiloConsumidor(cola)).start();

	}

}
