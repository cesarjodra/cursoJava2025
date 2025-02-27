package main;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tareas.Tabla;

public class LanzadorTareas {

	public static void main(String[] args) throws IOException {
		
		ExecutorService service = Executors.newVirtualThreadPerTaskExecutor();
		
		service.submit(new Tabla(3));
		service.submit(new Tabla(5));
		service.submit(new Tabla(7));
		
		service.shutdown();
		
		System.in.read(); // Sin esto no funciona.
						  // Es un truco que la mantiene esperando a una pulsación
						  // Si no, no llega a funcionar porque termina demasiado rápido
		
	}
}
