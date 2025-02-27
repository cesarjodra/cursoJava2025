package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import model.Producto;
import utilidades.Conversor;

public class ProductosServiceFile {
	Path ruta=Path.of("c:\\ficheros\\productos.txt");
	
	public List<Producto> productos(){
		try {
			return Files.lines(ruta)
					.map(Conversor::lineaAProducto) //Stream<Producto>
					.toList();//List<Producto>
		} catch (IOException e) {
			e.printStackTrace();
			return List.of();
		}
	}
	
}
