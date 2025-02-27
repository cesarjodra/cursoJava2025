package principal;

public class NotasArray {

	public static void main(String[] args) {
		// Nota media del grupo
		// Número de aprobados
		// Nota mas alta
		// Nota mas baja
		
		//double[] notas = {7.2 , 2.9 , 8 , 5.7 , 9.1 , 6.7 , 7.7};
		String notasTxt = "7.2,2.9,8,5.7,9.1,6.7,7.7";
		
		double[] notas = convertirTextoArray(notasTxt);
		
		System.out.println("Han aprobado "+ aprobados(notas) +" de "+notas.length+" alumnos. ");		
		System.out.println("La nota media del grupo es "+media(notas));
		System.out.println("La nota más alta es "+maximo(notas));
		System.out.println("La nota más baja es "+minimo(notas));

	}
	
	static double[] convertirTextoArray(String notasTxt) {
		String[] valores=notasTxt.split(",");
		double[] resultado=new double[valores.length];
		
		for(int i=0;i<valores.length;i++) {
			resultado[i] = Double.parseDouble(valores[i]);
		}
		
		return resultado;
	}
	
	// Recibo el array como parámetro
	
	static double media(double[] datos) {
		double sumatorio = 0;
		for(double n:datos) {
			sumatorio += n;
		}	
		return sumatorio/datos.length;
	}
	
	static int aprobados(double[] datos) {
		int numAprobados = 0;
		for(double n:datos) {
			if (n>=5) {numAprobados++;}
		}	
		return numAprobados;
	}
	
	static double maximo(double[] datos) {
		double notaMax = 0;
		for(double n:datos) {
			if (n>notaMax) {notaMax=n;}
		}	
		return notaMax;
	}
	
	static double minimo(double[] datos) {
		double notaMin = 10;
		for(double n:datos) {
			if (n<notaMin) {notaMin=n;}
		}	
		return notaMin;
	}
}
