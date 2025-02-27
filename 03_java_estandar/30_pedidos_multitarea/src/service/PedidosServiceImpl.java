package service;

import java.nio.file.Path;

import dao.DaoFactory;
import dao.PedidosDao;
import dao.TiendasDao;

public class PedidosServiceImpl implements PedidosService {
	TiendasDao tiendasDao;
	PedidosDao pedidosDao;	
	
	@Override
	public void procesarPedidosTienda(String ruta, String tienda) {
		
		var pedidosDao = DaoFactory.getPedidosDao();
		var tiendasDao = DaoFactory.getTiendasDao();	
				
		// Como vendrán varios, hay que recorrerlo con un bucle			
		
		// Comprobar si el pedido ya está en la BD, y meterlo solo si no está
		
		tiendasDao.findByDir(ruta).stream()  // Stream<Pedidos>
			.peek(p->p.setTienda(tienda))
			.filter(p->pedidosDao.findByProductoAndTiendaAndFechaPedido(p.getProducto(), tienda, p.getFechaPedido())==null)
			.forEach(p->pedidosDao.save(p));
	}	
}
