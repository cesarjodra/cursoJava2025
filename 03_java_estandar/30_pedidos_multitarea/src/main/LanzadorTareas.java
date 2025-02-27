package main;

import service.PedidosService;
import service.PedidosServiceFactory;

public class LanzadorTareas {

	public static void main(String[] args) {

		String ruta1="c:\\ficheros-tarde\\tienda1.json";
		String ruta2="c:\\ficheros-tarde\\tienda2.json";
		String ruta3="c:\\ficheros-tarde\\tienda3.json";
		
		String tienda1="Jamones Pepito";  
		String tienda2="Todo a domicilio";
		String tienda3="Casi de Todo";
		
		PedidosService pedidosService = PedidosServiceFactory.getPedidosService();
		
		// Implementación de Runnable mediante expresiones Lambda
		new Thread( ()->pedidosService.procesarPedidosTienda(ruta1, tienda1)).start();
		new Thread( ()->pedidosService.procesarPedidosTienda(ruta2, tienda2)).start();
		new Thread( ()->pedidosService.procesarPedidosTienda(ruta3, tienda3)).start();

	}

}
