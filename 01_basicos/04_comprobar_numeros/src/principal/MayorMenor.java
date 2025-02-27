package principal;

public class MayorMenor {

	public static void main(String[] args) {
		int n1=13;
		int n2=9;

		// El programa debe imprimir el mayor de los dos números
		
		if(n1>n2) {
			System.out.println("El número mayor es "+n1);
		}
		else if(n1<n2) {
			System.out.println("El número mayor es "+n2);
		}
		else {
			System.out.println("Ambos números son iguales");
		}
	}

}
