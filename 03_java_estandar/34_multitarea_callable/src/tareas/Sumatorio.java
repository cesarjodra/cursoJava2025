package tareas;

import java.util.concurrent.Callable;

public class Sumatorio implements Callable<Integer> {
	
	private int numero;
	public Sumatorio(int numero) {
		this.numero=numero;
	}

	@Override
	public Integer call() throws Exception {
		int suma = 0;
		for(int i=1; i<=numero ;i++) {
			suma += i;
			Thread.sleep(50);
		}
		return suma;
	}

}
