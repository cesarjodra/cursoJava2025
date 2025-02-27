package principal;

public class Prueba {

	public static void main(String[] args) {
		String texto="Una cadena";
		System.out.println(texto.length());
		System.out.println(texto.charAt(0));
		//System.out.println(texto.charAt(20)); //Me salgo. Error
		
		String frase="Esto es una frase nueva de pruebas";
		String[] palabras=frase.split(" ");
		System.out.println(palabras.length);

	}

}
