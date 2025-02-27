package principal;

enum Operacion{
	SUMA,RESTA,MULTIPLICACION,DIVISION;	
}

public class Calculadora {

	public static void main(String[] args) {
		int n1=56;
		int n2=24;
		Operacion operacion=Operacion.MULTIPLICACION;
		
		System.out.println("El resultado es: "+operacion(n1, n2, operacion));
	}
	
	static int operacion(int a, int b, Operacion oper) {
		return switch(oper) {
			case SUMA->a+b;
			case RESTA->a-b;
			case MULTIPLICACION->a*b;
			case DIVISION->a/b;
		};
	}

}
