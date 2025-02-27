package principal;

public class ComprobacionTemperatura {

	public static void main(String[] args) {
		double tempMin=5;
		double tempMax=35;
		double tempActual=19;
		
		// Realizar un programa que muestre un mensaje indicando
		// si estamos en verano o en invierno (más cerca de los 5
		// es invierno, y más cerca de 35 es verano)
		
		double verano = tempMax-tempActual;
		double invierno = tempActual-tempMin;
		
		// con if
		if(invierno>verano) {
			System.out.println("Estamos en verano");
		}
		else if(verano>invierno) {
			System.out.println("Estamos en invierno");
		}
		
		// con ternario (se comporta de forma "diferente". siempre devuelve un
		// resultado, y no permite asignación dentro de las opciones)
		
		String mensaje;
		
		mensaje=(invierno>verano) ? "Verano" : "Invierno";

	}

}
