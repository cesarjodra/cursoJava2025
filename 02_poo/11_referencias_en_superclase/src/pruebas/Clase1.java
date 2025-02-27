package pruebas;

public class Clase1 {
	public void m1() {
		System.out.println("método de clase 1");
	}
}

class Clase2 extends Clase1{
	@Override
	public void m1() {
		System.out.println("versión de m1 en clase 2");
	}
	public void m2() {
		System.out.println("método de clase 2");
	}
}
