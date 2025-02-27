package pruebas;

class ClaseA{
	public void m() {
		System.out.println("m de clase A");
		}
	
	public static void s() {
		System.out.println("s de clase A");
		}
}

class ClaseB extends ClaseA{
	public void m() {
		System.out.println("m de clase B");
		}
	
	public static void s() {
		System.out.println("s de clase B");
		}
}

public class Test3 {

	public static void main(String[] args) {
		ClaseA ca=new ClaseB();
		ca.m(); // Como es un método NO estatico, se tiene en cuenta el objeto (B)
		ca.s(); // Como es un método estatico, se tiene en cuenta al tipo de la variable (A)
	}
	
}
