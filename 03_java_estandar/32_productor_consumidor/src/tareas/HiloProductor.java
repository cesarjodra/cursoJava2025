package tareas;

import recursos.RecursoCola;

public class HiloProductor implements Runnable {
	private RecursoCola cola;	
	public HiloProductor(RecursoCola cola) {
		super();
		this.cola = cola;
	}

	@Override
	public void run() {
		while(true) {
			int num=(int)(Math.random()*100+1);
			synchronized (cola) {			
			if(cola.estaLleno()) {				
					try {
						System.out.println("Recurso lleno, esperando a guardar");
						cola.wait(); //Espera a recibir notificación de continuar
					} catch (InterruptedException e) {
						e.printStackTrace();
					} 
				}
				cola.guardar(num);
				cola.notify();
			}
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
