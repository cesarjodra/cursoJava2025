package tareas;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {
	
	private int numero;
	public Factorial(int numero) {
		this.numero=numero;
	}

	@Override
	public Integer call() throws Exception {
		int resultado = 1;
		for(int i=2;i<=numero;i++) {
			resultado*=i;
			Thread.sleep(50);
		}
		return resultado;
	}

}
