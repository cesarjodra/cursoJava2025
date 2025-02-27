package principal;

public class NotasAulas {

	public static void main(String[] args) {
		//array con las notas de los alumnos de cuatro aulas
		
		double[][] notas= {
				{3.4,8.1,5.6,6.2,4.4},
				{7.7,4.6,1.3,5.8,9.0},
				{6.3,2.7,8.0,5.9,4.6},
				{4.4,5.6,3.2,8.9,6.7}
				};
		
		// Llamamos al metodo para que calcule la media
		double[] notasMedias=calcularMedias(notas);
		
		// Llamamos al segundo método
		System.out.println("El aula con la nota media más alta es la "+aulaMediaMax(notasMedias));
	}
	
	static double[] calcularMedias(double[][] datos){
		double[] medias=new double[datos.length];
		for(int i=0;i<datos.length;i++) {
			for(int k=0;k<datos[i].length;k++) {
				medias[i]+=datos[i][k];
			}
			medias[i]/=5;
		}
		return medias;
	}
	
	static int aulaMediaMax(double[] datos) {
		double mediaMax=0;
		int numAula=0;
		for(int i=0;i<datos.length;i++) {
			//System.out.println(datos[i]);
			if(datos[i]>mediaMax) {
				mediaMax=datos[i];
				numAula=(i+1);
			}			
		}
		return numAula;
	}

}
