package service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

import exceptions.CorruptDataException;
import model.Producto;
import utilidades.Conversor;

public class ProductosService {
	Path ruta=Path.of("c:\\ficheros\\productos.txt");
	private void crearFichero() {
		try {
			Files.createFile(ruta);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void guardarProducto(Producto producto) {
		try {
			Files.writeString(ruta, Conversor.productoALinea(producto)+"\n", StandardOpenOption.APPEND,StandardOpenOption.CREATE);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Producto buscarProductoCodigo(String codigo) {
		try {
			return Files.lines(ruta)
					.map(Conversor::lineaAProducto) //Stream<Producto>
					.filter(p->p.getCodigo().equals(codigo)) //Stream<Producto>
					.findFirst() //Optional<Producto>
					.orElse(null); //Producto
		} catch (IOException e) {
			crearFichero();
			e.printStackTrace();
			return null;
		}
				
	}
	public List<Producto> productosCategoria(String categoria){
		try {
			return Files.lines(ruta)
					.map(Conversor::lineaAProducto) //Stream<Producto>
					.filter(p->p.getCategoria().equals(categoria)) //Stream<Producto>
					.toList();//List<Producto>
		} catch (IOException e) {
			crearFichero();
			e.printStackTrace();
			return List.of();
		}
	}
	public List<String> categorias() throws CorruptDataException{
		try {
			return Files.lines(ruta)
					.map(s->Conversor.lineaAProducto(s).getCategoria()) //Stream<String>
					.distinct()
					.toList();
		} catch (IOException e) {
			crearFichero();
			e.printStackTrace();
			return List.of();
		}
		catch(Exception ex) {
			throw new CorruptDataException();
		}
	}
	
	
	public void eliminarProducto(String codigo) {
		try {
			List<String> productos=Files.lines(ruta)
					.filter(s->!Conversor.lineaAProducto(s).getCodigo().equals(codigo))
					.toList();
			Files.write(ruta, productos);
		} catch (IOException e) {
			crearFichero();
			e.printStackTrace();
			
		}
	}
}
