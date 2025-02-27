package principal;

public class NotasArray {

	public static void main(String[] args) {
		// Nota media del grupo
		// Número de aprobados
		// Nota mas alta
		// Nota mas baja
		
		double[] notas = {7.2 , 2.9 , 8 , 5.7 , 9.1 , 6.7 , 7.7};
		
		double sumatorio = 0;
		int numAprobados = 0;
		double notaMax = 0;
		double notaMin = 10;
		
		for(int i=0 ; i<notas.length ; i++) {
			sumatorio += notas[i];
			if (notas[i]>=5) {numAprobados++;}
			if (notas[i]>notaMax) {notaMax=notas[i];}
			if (notas[i]<notaMin) {notaMin=notas[i];}
		}		
		
		double notaMedia = sumatorio/notas.length;
		System.out.println("Han aprobado "+numAprobados+" de "+notas.length+" alumnos. ");		
		System.out.println("La nota media del grupo es "+notaMedia);
		System.out.println("La nota más alta es "+notaMax);
		System.out.println("La nota más baja es "+notaMin);

	}
}
