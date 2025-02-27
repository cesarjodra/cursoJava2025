package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tareas.Tabla;

public class LanzadorTareas {

	public static void main(String[] args) {
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		service.submit(new Tabla(3));
		service.submit(new Tabla(5));
		service.submit(new Tabla(7));
		
		service.shutdown();
		
	}
}
