package main;

import java.util.concurrent.CompletableFuture;

import tareas.Factorial;
import tareas.Sumatorio;

public class LanzadorTareas {

	public static void main(String[] args) throws Exception {			
						
			CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(new Sumatorio(100));
			CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(new Factorial(6));
			
			f1.whenCompleteAsync((r,e)->System.out.println("La suma de los números es "+r));
			f2.whenCompleteAsync((r,e)->System.out.println("El factorial del número es "+r));
			
			for(int i=1;i<=200;i++) {
				System.out.println("Esperando a que termine...");
				Thread.sleep(50);				
			}			

	}

}
