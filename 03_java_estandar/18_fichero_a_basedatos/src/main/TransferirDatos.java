package main;

import service.ProductosServiceBd;
import service.ProductosServiceFile;

public class TransferirDatos {

	public static void main(String[] args) {
		var productosFile=new ProductosServiceFile();
		var productosBd=new ProductosServiceBd();
		productosFile.productos()
		.forEach(p->{
			if(productosBd.buscarProductoCodigo(p.getCodigo())==null) {
				productosBd.guardarProducto(p);
			}
		});
		System.out.println("Datos transferidos!");
	}

}
