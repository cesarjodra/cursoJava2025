package main;

import recursos.Contador;

public class LanzadorTareas {

	public static void main(String[] args) {

		Contador contador=new Contador();
		
		for(int i=1; i<=100;i++) {
			new Thread( ()->contador.incrementar() ).start();
		}

		// Esperamos para sacar el valor del contador
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("El valor final es "+contador.getValue());
		
	}

}
