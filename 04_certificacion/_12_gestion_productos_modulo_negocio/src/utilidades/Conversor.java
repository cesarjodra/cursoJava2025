package utilidades;

import model.Producto;

public class Conversor {
	public static Producto lineaAProducto(String linea) {
		String[] datos=linea.split(",");
		return new Producto(datos[0],datos[1],Double.parseDouble(datos[2]),datos[3]);
	}
	public static String productoALinea(Producto producto) {
		return producto.getNombre()+","+producto.getCodigo()+","+producto.getPrecio()+","+producto.getCategoria();
	}
}
