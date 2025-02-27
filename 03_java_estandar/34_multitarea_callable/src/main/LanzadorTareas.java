package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import tareas.Factorial;
import tareas.Sumatorio;

public class LanzadorTareas {

	public static void main(String[] args) throws Exception {
			
			ExecutorService service = Executors.newCachedThreadPool();			
			Future<Integer> f1 = service.submit(new Sumatorio(100));
			Future<Integer> f2 = service.submit(new Factorial(6));
			
			while(!f1.isDone() || !f2.isDone()) {
				System.out.println("Esperando a que termine...");
				Thread.sleep(50);				
			}
			
			System.out.println("La suma de los números es "+f1.get());
			System.out.println("El factorial del número es "+f2.get());
			
			service.shutdown();

	}

}
