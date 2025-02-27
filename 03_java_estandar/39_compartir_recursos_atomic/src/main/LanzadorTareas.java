package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class LanzadorTareas {

	public static void main(String[] args) {

		AtomicInteger contador=new AtomicInteger();
		
		ExecutorService executor = Executors.newCachedThreadPool();
		for(int i=1; i<=5000;i++) {
			executor.submit(()->contador.incrementAndGet());
		}

		// Esperamos para sacar el valor del contador
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("El valor final es "+contador.get());
		
	}

}
