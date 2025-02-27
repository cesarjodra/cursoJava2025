package main;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LanzadorTareas {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> lista = new CopyOnWriteArrayList<>();
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=1; i<=5000; i++) {
			executor.submit(()->lista.add((int)Math.random()*500+1));			
		}
		// Esperamos a que termine
		Thread.sleep(20000);
		
		System.out.println("El tamaño de la lista es "+lista.size());		
		executor.shutdown();
	}

}
