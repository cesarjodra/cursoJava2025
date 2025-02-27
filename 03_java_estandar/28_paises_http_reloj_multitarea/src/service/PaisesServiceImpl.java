package service;

import java.util.List;

import locator.StreamLocator;
import model.Pais;

public class PaisesServiceImpl implements PaisesService {
	
	@Override
	public List<String> continentes() {
		return StreamLocator.streamPaises()
				.map(p->p.getRegion())
				.distinct()
				.toList();
	}

	@Override
	public List<Pais> paisesPorContinente(String continente) {
		return StreamLocator.streamPaises()
				.filter(p->p.getRegion().equals(continente))
				.toList();
	}

}
