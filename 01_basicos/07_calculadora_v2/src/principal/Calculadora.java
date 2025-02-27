package principal;

public class Calculadora {

	public static void main(String[] args) {
		double n1=56;
		double n2=24;
		char operacion='x';
		
		// Realizar un programa que muestre le resultado de la
		// operacion entre dos números usando SWITCH
		
		double res=0; // Si no la inicializo, al haber una posibilidad
					// de que quede indefinida (por el default),
					// da error de compilación
		
		switch(operacion) {
			case '+': res=n1+n2; break;
			case '-': res=n1-n2; break;
			case 'x': res=n1*n2; break;
			case '/': res=n1/n2; break;
			default: System.out.println("Error al operar.");
		}
		
		System.out.println("El resultado es: "+res);	
		
		// Usando EXPRESIONES SWITCH (desde Java 17)
		
		double resultado=switch(operacion) {
			case '+' -> n1+n2;
			case '-' -> n1-n2;
			case 'x' -> n1*n2;
			case '/' -> n1/n2;
			default -> 0;
		};
		
		System.out.println("El resultado es: "+resultado);
		
	}

}
