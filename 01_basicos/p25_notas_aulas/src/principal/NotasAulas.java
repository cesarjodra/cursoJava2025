package principal;

public class NotasAulas {

	public static void main(String[] args) {
		//array con las notas de los alumnos de cuatro aulas
		
		double[][] notas= {{3.4,8.1,5.6,6.2,4.4},
				{7.7,4.6,1.3,5.8,9.0},
				{6.3,2.7,8.0,5.9,4.6},
				{4.4,5.6,3.2,8.9,6.7}};
		//¿Qué aula tiene la nota media más alta?
		double[] medias=new double[4];
		for(int i=0;i<notas.length;i++) {
			for(int k=0;k<notas[i].length;k++) {
				medias[i]+=notas[i][k];
			}
			medias[i]/=5;
		}
		//ahora hay que buscar la nota más alta de ese array medias
		//y la posición que ocupa
		double mediaMax=0;
		int numAula=0;
		for(int i=0;i<medias.length;i++) {
			System.out.println(medias[i]);
			if(medias[i]>mediaMax) {
				mediaMax=medias[i];
				numAula=(i+1);
			}
		}
		System.out.println("El aula con la nota más alta es la "+numAula);
	}

}
