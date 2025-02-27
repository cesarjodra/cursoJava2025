package principal;

public class Calculadora {

	public static void main(String[] args) {
		double n1=56;
		double n2=24;
		char operacion='y';
		
		// Realizar un programa que muestre le resultado de la
		// operacion entre dos números
		
		double res=0; // Si no la inicializo, al haber una posibilidad
					// de que quede indefinida (por el else),
					// da error de compilación
		
		if(operacion=='+') {
			res=n1+n2;
		}
		else if(operacion=='-') {
			res=n1-n2;
		}
		else if(operacion=='x') {
			res=n1*n2;
		}
		else if(operacion=='/') {			
			res=n1/n2;
		}
		else {
			System.out.println("Error al operar.");
		}
		
		System.out.println("El resultado es: "+res);

	}

}
