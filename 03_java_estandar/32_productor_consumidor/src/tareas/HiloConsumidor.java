package tareas;

import recursos.RecursoCola;

public class HiloConsumidor implements Runnable {
	private RecursoCola cola;	
	public HiloConsumidor(RecursoCola cola) {
		super();
		this.cola = cola;
	}

	@Override
	public void run() {
		while(true) {
			synchronized (cola) {			
				if(cola.estaVacio()) {				
					try {
						System.out.println("Recurso vacío, esperando para procesar.");
						cola.wait(); //Espera a recibir notificación de continuar
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				System.out.println("Estoy consumiendo el "+cola.sacar());
				cola.notify();
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
