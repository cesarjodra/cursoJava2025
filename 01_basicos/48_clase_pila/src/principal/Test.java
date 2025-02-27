package principal;

import service.Pila;

public class Test {

	public static void main(String[] args) {
		Pila pila=new Pila();
		pila.agregar("uno");
		pila.agregar("dos");
		pila.agregar("tres");
		System.out.println(pila.total());
		System.out.println(pila.sacar());
		System.out.println(pila.sacar());
		System.out.println(pila.sacar());
		System.out.println(pila.total());
	}

}
