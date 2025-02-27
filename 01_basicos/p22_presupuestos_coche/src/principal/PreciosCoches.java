package principal;

import java.util.Scanner;

public class PreciosCoches {

	public static void main(String[] args) {
		double[] precios= {11500,22300,17400,9800,18000,25450,16200};
		boolean[] disponibles= {true,true,true,false,true,false,false};
		//realizar un programa que nos pida el presupuesto y nos diga
		//que coches podemos comparar
		Scanner scan=new Scanner(System.in);
		System.out.println("Presupuesto disponible: ");
		double presupuesto=scan.nextDouble();
		for(int i=0;i<precios.length;i++) {
			if(precios[i]<=presupuesto&&disponibles[i]) {
				System.out.println("Puedes comprar: "+precios[i]);
			}
		}

	}

}
