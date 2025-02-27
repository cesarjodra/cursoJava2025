package principal;

public class Estadisticas {

	public static void main(String[] args) {

		String palabras="barco,casa,coche,vacaciones,barco,vida,noche,casa,barco,vida,coche,noche,barco,mar";
		
		// Cuál es la palabra más buscada?
		
		String[] matriz = palabras.split(",");
		int[]repeticiones = new int[matriz.length];
				
		String masBuscada = "";
		int numPalabras = 0;
		
		for(int i=0;i<matriz.length;i++) {
			repeticiones[i]=apariciones(matriz[i], matriz);	
			if(repeticiones[i]>=numPalabras) {
				masBuscada=matriz[i];
				numPalabras=repeticiones[i];
			}
		}
		
		System.out.println("Una de las palabras que más se repite ("+numPalabras+") es " +masBuscada);			

	}
	
	static int apariciones(String palabra, String[] listado){		
		int contador = 0;		
		for(int j=0;j<listado.length;j++) {				
			if(palabra.equals( listado[j] ) ) {
				contador++;
			}			
		}		
		return contador;		
	}
}
