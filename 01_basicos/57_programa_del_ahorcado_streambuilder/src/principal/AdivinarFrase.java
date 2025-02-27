package principal;

import java.util.Scanner;

public class AdivinarFrase {

	public static void main(String[] args) {
		int intentos=3;
		String[] frases= {"Java es dificil",
				"Me voy a certificar",
				"Aprendo Java rapido",
				"Estoy haciendo un ejercicio",
				"A partir de ahora hay que estudiar"};
		
		String plantilla;
		String fraseAleatoria=frases[(int)(Math.random()*5)];
		Scanner scan=new Scanner(System.in);
		plantilla=generarPlantilla(fraseAleatoria);
		do {	
			System.out.println(plantilla);
			System.out.println("Introduce letra: ");
			String letra=scan.nextLine();
			if(contieneLetra(fraseAleatoria,letra)) {
				plantilla=actualizarPlantilla(fraseAleatoria,plantilla,letra.charAt(0));
			}else {
				intentos--;
				System.out.println("Letra no existente, te quedan "+intentos+" intentos");
			}
		}while(intentos>0&&!plantilla.equals(fraseAleatoria));
		
		if(intentos>0) {
			System.out.println("Has ganado!");
		}else {
			System.out.println("Has perdido!");
		}
	}
	
	//indica si la letra está o no en la frase
	static boolean contieneLetra(String frase, String letra) {
		//return frase.contains(letra);
		return frase.indexOf(letra)>-1;
	}
	//genera un texto, sustituyendo cada letra diferente al espacio
	//por un caracter de subrayado
	static String generarPlantilla(String frase) {
		StringBuilder plantilla=new StringBuilder(""); 		
		//recorremos los caracteres de frase. Si es un caracter
		//diferente al espacio, añadimos un "_" a plantilla, si es un espacio,
		//añadimos un espacio
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==' ') {
				plantilla.append(" "); 
			}else {
				plantilla.append("-");
			}
		}
		return plantilla.toString();
	}
	//recibe la frase, la plantilla actual y la letra. Debe generar una nueva 
	//plantilla, susitutyendo los "-" por la letra
	static String actualizarPlantilla(String frase, String plantilla, char letra) {		
		StringBuilder plantillaActual=new StringBuilder("");
		for(int i=0;i<frase.length();i++) {
			if(frase.charAt(i)==letra) {
				plantillaActual.append(letra);
			}else {
				plantillaActual.append(plantilla.charAt(i));
			}
		}
		return plantillaActual.toString();
	}
	

}
