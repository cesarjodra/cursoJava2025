package main;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import recursos.RecursoCola;
import tareas.HiloConsumidor;
import tareas.HiloProductor;

public class LanzadorTareas {

	public static void main(String[] args) {

		RecursoCola cola = new RecursoCola();
		Lock lc = new ReentrantLock();
		Condition cLleno = lc.newCondition();
		Condition cVacio = lc.newCondition();
			
		ExecutorService executor = Executors.newCachedThreadPool();
		CompletableFuture.runAsync(new HiloProductor(cola, lc, cLleno, cVacio), executor);
		CompletableFuture.runAsync(new HiloConsumidor(cola, lc, cLleno, cVacio), executor);

	}

}
