package service;

import java.util.Scanner;

// Crea una clase llamada ClaseUsuario que implemente la interfaz Operaciones
// La escritura (metodo) se realizará en consola, y la lectura (metodo) será del teclado

public class ClaseUsuario implements Operaciones {

	@Override
	public void escribir(String dato) {
		System.out.println(dato);

	}

	@Override
	public String leer() {
		Scanner scan=new Scanner(System.in);
		return scan.nextLine();
	}

}
