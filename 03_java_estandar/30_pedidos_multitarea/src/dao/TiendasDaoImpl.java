package dao;

import java.util.List;

import locator.StreamLocator;
import model.Pedido;

public class TiendasDaoImpl implements TiendasDao{

	@Override
	public List<Pedido> findByDir(String dir) {
		return StreamLocator.streamPedidos(dir)
				.toList();
	}

}



