package principal;

// Este ejercicio está resuelto de otra forma en una captura de pantalla

public class MediaNumerica {

	public static void main(String[] args) {		
		
		int[] valores= {10,22,1,4,8,10,7,4,11,1};
		
		// Calcular la media de todos los valores sin incluir repetidos más de una vez
		
		System.out.println( buscarRepetidos(valores) );

	}
	
	static int[] buscarRepetidos(int[] matriz) {
		
		int[] sinRepes = new int[matriz.length-1];
		
		for(int i=0;i<matriz.length;i++) {
			for (int j=0;i<sinRepes.length;i++) {
				if(matriz[i]==sinRepes[j]) {
					sinRepes[j]=-1;
				}
				else {
					sinRepes[j]=matriz[i];
				}
			}
		}
		
		for(int n: sinRepes) {
			System.out.println(n+" ");
		}
		
		return sinRepes;
		
	}

}
