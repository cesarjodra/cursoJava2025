package principal;

public class InfoTemperaturas {

	public static void main(String[] args) {
		String datos="Soria:11.8,Jaén:23.5,Ávila:13.6,Santander:18.9,Madrid:20.2,Sevilla:31.6";

		// - Nombre de ciudad más calurosa
		// - Nombre de ciudad más fría
		// - Temperatura media global
		
		/* Conversion de arrays */
		String[] arrayDatos = datos.split(",");		
		String[] ciudades = obtenerCiudades(arrayDatos);
		double[] temperaturas = obtenerTemperaturas(arrayDatos);
		
		/* Nombre de ciudad más calurosa */
		int masCalida = tempMax(temperaturas);		
			System.out.println("Ciudad con temperatura máxima: 🥵");
			System.out.print("-> "+ciudades[masCalida]);
			System.out.print(": ");
			System.out.print(temperaturas[masCalida]+"º");
			System.out.println("");
		
		/* Nombre de ciudad más fría */
		int masFria = tempMin(temperaturas);		
			System.out.println("Ciudad con temperatura mínima: 🥶");
			System.out.print("-> "+ciudades[masFria]);
			System.out.print(": ");
			System.out.print(temperaturas[masFria]+"º");
			System.out.println("");
		
		/* Temperatura media global */
		double media = promedio(temperaturas);		
			System.out.println("Temperatura media:");
			System.out.print("-> "+media+"º");
			System.out.println("");
		
	}
	
	
	// Método para formatear datos I. Debe devolver un array string con ciudades
	
	static String[] obtenerCiudades(String[] pArrayDatos) {
		
		String[] ciudades = new String[pArrayDatos.length];
		
		for(int i=0;i<pArrayDatos.length;i++) {
			int indice = pArrayDatos[i].indexOf(":");
			ciudades[i] = pArrayDatos[i].substring(0,indice);
		}
		return ciudades;		
	}	
	
	// Método para formatear datos II. Debe devolver un array double con temperaturas
	
	static double[] obtenerTemperaturas(String[] pArrayDatos) {
		
		double[] temperaturas = new double[pArrayDatos.length];
		
		for(int i=0;i<pArrayDatos.length;i++) {
			int indice = pArrayDatos[i].indexOf(":");
			temperaturas[i] = Double.parseDouble( pArrayDatos[i].substring(indice+1) );
		}
		return temperaturas;		
	}	
	
	// Método para calcular la temperatura máxima. Debe devolver la posición
	
	static int tempMax(double[] pTemperaturas) {
		double maxima = pTemperaturas[0];
		int pos = 0;
		for(int i=0;i<pTemperaturas.length;i++) {
			if(pTemperaturas[i]>maxima) {
				maxima = pTemperaturas[i];
				pos = i;
			}
		}
		return pos;		
	}	
	
	// Método para calcular la temperatura mínima.  Debe devolver la posición
	
	static int tempMin(double[] pTemperaturas) {
		double minima = pTemperaturas[0];
		int pos = 0;
		for(int i=0;i<pTemperaturas.length;i++) {
			if(pTemperaturas[i]<minima) {
				minima = pTemperaturas[i];
				pos = i;
			}
		}
		return pos;		
	}	
	
	// Método para calcular la temperatura promedio. La devuelve
	
	static double promedio(double[] pTemperaturas) {
		double tPromedio = 0;
		
		for(int i=0;i<pTemperaturas.length;i++) {
			tPromedio += pTemperaturas[i];			
		}
		return tPromedio/pTemperaturas.length;		
	}
	
}
