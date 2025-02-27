package tareas;

import java.util.function.Supplier;

public class Factorial implements Supplier<Integer> {
	
	private int numero;
	public Factorial(int numero) {
		this.numero=numero;
	}

	@Override
	public Integer get() {
		int resultado = 1;
		for(int i=2;i<=numero;i++) {
			resultado*=i;
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return resultado;
	}

}
