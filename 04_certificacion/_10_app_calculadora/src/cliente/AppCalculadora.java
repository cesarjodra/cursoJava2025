package cliente;

import operaciones.Calculadora;

public class AppCalculadora {

	public static void main(String[] args) {
		int a=6;
		int b=25;
		Calculadora cal = new Calculadora();
		System.out.println(cal.sumar(a, b));
		System.out.println(cal.restar(a, b));
		System.out.println(cal.multiplicar(a, b));
		System.out.println(cal.dividir(a, b));	
	}

}
