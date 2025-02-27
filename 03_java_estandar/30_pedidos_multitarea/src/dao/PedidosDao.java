package dao;

import java.time.LocalDate;

import model.Pedido;

public interface PedidosDao {
	void save(Pedido pedido);
	Pedido findByProductoAndTiendaAndFechaPedido(String producto, String tienda, LocalDate fechaPedido);
}
