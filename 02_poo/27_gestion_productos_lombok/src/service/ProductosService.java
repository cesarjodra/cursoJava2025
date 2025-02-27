package service;

import java.util.ArrayList;

import model.Productos;

public class ProductosService {
	private ArrayList<Productos> productos =  new ArrayList<>();

	// Método altaProducto: recibe un producto y lo da de alta
	
	public void altaProducto(Productos producto) {		
		productos.add(producto);	
	}
	
	// Método bajarPrecios: recibe un porcentaje y baja 
	// el precio de todos los productos en dicho porcentaje
	
	public void bajarPrecios(Double porcentaje) {		
		productos.forEach( n -> n.setPrecio(n.getPrecio()-n.getPrecio()*porcentaje));			
	}
	
	// Método subirPreciosCategoria: recibe un porcentaje y una categoría y
	// sube el precio en dicho porcentaje a los productos de esa categoria
	
	public void subirPreciosCategoria(Double porcentaje, String categoria) {		
		productos.forEach( n -> {
			if(n.getCategoria().equals(categoria)) {
				n.setPrecio(n.getPrecio()+n.getPrecio()*porcentaje);
			}
		});			
	}
	
	// Método eliminarCategoria: recibe una categoría y elimina todos sus productos
	
	public void eliminarCategoria(String categoria) {		
		productos.removeIf( n -> n.getCategoria().equals(categoria));			
	}
	
	// Método obtenerProductos: devuelve una lista con los productos existentes
	
	public ArrayList<Productos> obtenerProductos() {		
		return productos;			
	}
	
	// Método ordenarPorPrecio: ordena la lista de productos de menor a mayor precio
	
	public void ordenarPorPrecio() {		
		productos.sort( (a, b) -> Double.compare(a.getPrecio(), b.getPrecio()) );			
	}	
	
}
