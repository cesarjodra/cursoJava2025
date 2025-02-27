package geometria;

public class Test {

	public static void main(String[] args) {
		
		// Crear un objeto triángulo y un objeto círculo con valores inventados
		// Mostrar en color y la superficie de ambas figuras
		
		// Llamando directamente a las clases hijas	
		
		Triangulo f1 = new Triangulo("rojo", 15, 6);
		Circulo f2 = new Circulo("Verde", 12);		
		
		System.out.println("Color: " + f1.getColor());
		System.out.println("Superficie: " + f1.superficie());
		
		System.out.println("Color: " + f2.getColor());
		System.out.println("Superficie: " + f2.superficie());

		// Con referencia en superclase (Polimorfismo)
		
		imprimir(f1);
		imprimir(f2);
		
	}
	
	// Polimorfismo
	public static void imprimir(Figura f) {
		System.out.println("Color: " + f.getColor());
		System.out.println("Superficie: " + f.superficie());
	}
	

}
