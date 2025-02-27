package principal;

public class TableroAjedrez {

	public static void main(String[] args) {
		int[][] tablero=new int[8][8];
		//rellenar tablero
		for(int i=0;i<tablero.length;i++) {
			for(int k=0;k<tablero[i].length;k++) {
				/*if((i+k)%2==0) {
					tablero[i][k]=0;
				}else {
					tablero[i][k]=1;
				}*/
				tablero[i][k]=(i+k)%2==0?0:1;
			}
		}
		//mostrar tablero
		for(int[] fila:tablero) {
			for(int c:fila) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
