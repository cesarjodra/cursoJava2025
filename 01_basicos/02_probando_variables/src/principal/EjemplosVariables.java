package principal;

public class EjemplosVariables {
	float x=4.5f; // variables atributo
		//(lleva la f para forzar a float))
	static long distancia;
	public static void main(String[] args) {
		int num=100; // variables locales
		char opcionElegida='s';
		boolean res;
		res=false;
		double calculo;
		
		System.out.println("El valor del número es "+num);
		System.out.println("El valor del texto es "+opcionElegida);
		System.out.println("El valor de la booleana es "+res);
		//System.out.println("El valor del número decimal es "+x);
			// Falta la declaración como static de la variable atributo
		//System.out.println("El valor del doble es "+calculo);
			// Al ser local, no tiene valor por defecto sin inicializar
		System.out.println("El valor del long es "+distancia);
	}

}
