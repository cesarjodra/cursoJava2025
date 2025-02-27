package service;

import dao.DaoFactory;
import dao.MunicipiosDao;
import dao.ProvinciasDao;
import locator.LocatorPais;

class ProvinciasServiceImp implements ProvinciasService{

	MunicipiosDao municipiosDao = DaoFactory.getMunicipiosDao();
	ProvinciasDao provinciasDao = DaoFactory.geProvinciasDao();
	
	@Override
	public void guardarProvincias() {
		LocatorPais.streamProvincias()// stream<Provincia>
			.filter(p->provinciasDao.findByCodigo(p.getCodigoProvincia())==null)
			.forEach(p->provinciasDao.save(p));		
	}

	@Override
	public void guardarMunicipios() {
		municipiosDao.saveAll(
			LocatorPais.streamProvincias() // Stream<Provincia>
				.flatMap(p->LocatorPais.streamMunicipios(p.getCodigoProvincia())) // stream<Municipio>
				.filter(p->municipiosDao.findByCodigo(p.getCodigoMunicipio())==null)
				.toList()
		);
		
	}
		
}
