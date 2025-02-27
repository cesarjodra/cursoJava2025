package dao;

public class DaoFactory {
	public static PedidosDao getPedidosDao() {
		return new PedidosDaoImpl();
	}
	
	public static TiendasDao getTiendasDao() {
		return new TiendasDaoImpl();
	}
}
