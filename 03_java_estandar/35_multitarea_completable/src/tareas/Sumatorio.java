package tareas;

import java.util.function.Supplier;

public class Sumatorio implements Supplier<Integer> {
	
	private int numero;
	public Sumatorio(int numero) {
		this.numero=numero;
	}

	@Override
	public Integer get() {
		int suma = 0;
		for(int i=1; i<=numero ;i++) {
			suma += i;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return suma;
	}

}
