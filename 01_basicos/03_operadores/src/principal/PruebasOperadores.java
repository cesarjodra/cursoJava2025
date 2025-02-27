package principal;

public class PruebasOperadores {

	public static void main(String[] args) {
		int a=10;
		int b=6;
		int sum=a+b;
		int div=a/b;
		a++;
		b--;
		System.out.println("Suma: "+sum);
		System.out.println("Division: "+div);
		System.out.println("La variable a ahora vale "+a);
		System.out.println("La variable b ahora vale "+b);
		
		// Probando operadores condicionales
		
		System.out.println(3>6);
		System.out.println(8==2);
		System.out.println(1!=7);
		System.out.println(8<10);
	}

}
