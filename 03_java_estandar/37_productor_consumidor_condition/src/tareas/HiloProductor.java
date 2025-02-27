package tareas;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

import recursos.RecursoCola;

public class HiloProductor implements Runnable {
	private RecursoCola cola;	
	private Lock lc;
	Condition condicionLleno;
	Condition condicionVacio;
	
	public HiloProductor(RecursoCola cola, Lock lc, Condition condicionLleno, Condition condicionVacio) {
		this.cola = cola;
		this.lc = lc;
		this.condicionLleno = condicionLleno;
		this.condicionVacio = condicionVacio;
	}

	@Override
	public void run() {
		while(true) {
			int num=(int)(Math.random()*100+1);
			lc.lock();			
				if(cola.estaLleno()) {				
					try {
						System.out.println("Recurso lleno, esperando a guardar");
						condicionLleno.await(); //Espera a recibir notificación de continuar
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				cola.guardar(num);
				condicionVacio.signal();
			lc.unlock();
			System.out.println("He generado el "+num);	
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
