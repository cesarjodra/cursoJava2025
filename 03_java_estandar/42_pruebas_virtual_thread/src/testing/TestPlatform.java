package testing;

import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TestPlatform {

	public static void main(String[] args) {

		// var executor=Executors.newCachedThreadPool(); // Hilos normales
		
		var executor=Executors.newVirtualThreadPerTaskExecutor(); // Hilos virtuales
		
		long ini=System.currentTimeMillis(); // Me da el tiempo absoluto. Lo uso para medir.
		
		IntStream.rangeClosed(1, 1_000_000)
			.forEach(n->executor.submit(()->n*n));
		
		long fin=System.currentTimeMillis();
		
		System.out.println("Ha tardado "+ (fin-ini) +" milisegundos.");

	}

}
