package main;

import java.nio.file.Path;

public class TestPath {

	public static void main(String[] args) {
		Path pt=Path.of("c:\\ficheros-tarde\\pruebas.txt");
		System.out.println("Existe? "+pt.toFile().exists());
		System.out.println(pt.getNameCount());
		System.out.println(pt.getName(0));
		System.out.println(pt.getName(1));
		
		Path pt2=Path.of("c:\\ficheros-tarde\\..\\.\\archivos\\datos.txt");
		System.out.println(pt2.normalize());
		System.out.println(pt2.getNameCount());
		
		// ------------------------------------------------------
		Path p1=Path.of("c:\\productos\\datos\\pruebas.txt");
		Path p2=Path.of("c:\\productos\\bases.txt");
		System.out.println(p1.relativize(p2));	
		
		Path p3=Path.of("/datos/varios/archivos.txt"); // Formato Linux
		Path p4=Path.of("/datos/texto.txt");
		System.out.println(p3.relativize(p4));
		
		// ------------------------------------------------------
		System.out.println(p1.resolve(p2)); 
		// Devuelve la union de las dos rutas si son relativas
		// Si ambas son absolutas devuelve la segunda ruta
		
		
		
	}

}
