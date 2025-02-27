package tareas;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import recursos.RecursoCola;

public class HiloConsumidor implements Runnable {
	private RecursoCola cola;	
	private Lock lc;
	Condition condicionLleno;
	Condition condicionVacio;
	
	public HiloConsumidor(RecursoCola cola, Lock lc, Condition condicionLleno, Condition condicionVacio) {
		this.cola = cola;
		this.lc = lc;
		this.condicionLleno = condicionLleno;
		this.condicionVacio = condicionVacio;
	}

	@Override
	public void run() {
		while(true) {
			lc.lock();		
				if(cola.estaVacio()) {				
					try {
						System.out.println("Recurso vacío, esperando para procesar.");
						condicionVacio.await(); //Espera a recibir notificación de continuar
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				System.out.println("Estoy consumiendo el "+cola.sacar());
				condicionLleno.signal();
			lc.unlock();
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
