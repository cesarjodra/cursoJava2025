package principal;

class MiClase{
	public MiClase(String a) {
		System.out.println("Constructor con parámetro "+a);
	}
	public MiClase() {
		System.out.println("Constructor sin parámetros");
	}
}

public class Prueba {

	public static void main(String[] args) {

		MiClase m1=new MiClase();
		
		MiClase m2=new MiClase("Boo");

	}

}
