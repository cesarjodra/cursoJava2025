package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

import exceptions.CorruptDataException;
import model.Producto;
import utilidades.Conversor;

public class ProductoService {

	private Path ruta = Path.of("/ficheros-tarde/productos.txt");	
	private void crearFichero() {
		try {
			Files.createFile(ruta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void guardar(Producto producto) {			
		try {		
		String linea = Conversor.ProductoALinea(producto);	
		Files.writeString(ruta, linea+"\n", StandardOpenOption.APPEND,StandardOpenOption.CREATE);
				
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	public Producto buscar(String codigo) {		
		try {
			return Files.lines(ruta) 
						.map(s->Conversor.lineaAProducto(s))
						.filter(c->codigo.equals(c.getCodigo()))
						.findFirst()
						.orElse(null);
		} catch (IOException e) {
			crearFichero();
			e.printStackTrace();
			return null;
		}
						
	}
	
	public void eliminar(String codigo) {			
			try {
				List<String> listado = Files.lines(ruta) 
							.map(s->Conversor.lineaAProducto(s))
							.filter(c->!codigo.equals(c.getCodigo()))
							.map(s->Conversor.ProductoALinea(s))
							.collect(Collectors.toList());
				
				// Otra forma
					// .filter(s->!Conversor.lineaAProducto(s).getCodigo().equals(codigo))
					// .toList();
				
				Files.write(ruta, listado);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
						
	}
	
	public List<Producto> buscarPorCategoria(String categoria){
		try {
			return Files.lines(ruta) 
					.map(s->Conversor.lineaAProducto(s))
					.filter(c->categoria.equals(c.getCategoria()))
					.collect(Collectors.toList());
		} catch (IOException e) {
			crearFichero();
			e.printStackTrace();
			return List.of();
		}		
	}
	
	public List<String> categorias() throws CorruptDataException{ //Para poder lanzar esa excepcion
		try {
			return Files.lines(ruta) 
					.map(s->Conversor.lineaAProducto(s).getCategoria())
					.distinct()
					.sorted()
					.toList();
		} catch (IOException e) {
			crearFichero();
			e.printStackTrace();
			return List.of();
		} catch (Exception ex) { //Personalizo una excepcion por si no es IO
			throw new CorruptDataException();
		}
	}
		
}

