package principal;

public class Dados {

	public static void main(String[] args) {
		
		//realizar el lanzamiento del dado 100000 y mostrar los 
		//porcentajes de cada cara
		final int LANZAMIENTOS=100_000;
		int[] contadores=new int[6];
		for(int i=1;i<=LANZAMIENTOS;i++) {
			int dado=(int)(Math.random()*6+1);
			//incrementar el contador que lleva la cuenta
			//de las veces que ha salido ese número
			contadores[dado-1]++;
		}
		for(int i=0;i<contadores.length;i++) {
			System.out.println("porcentaje de "+(i+1)+": "+contadores[i]*100.0/LANZAMIENTOS);
		}
	}

}
