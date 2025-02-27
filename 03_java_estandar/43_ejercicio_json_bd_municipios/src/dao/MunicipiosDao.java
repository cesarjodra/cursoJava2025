package dao;

import java.util.List;

import model.Municipio;

public interface MunicipiosDao {
	void save(Municipio municipio);
	Municipio findByCodigo(String codigo);
	void saveAll(List<Municipio> municipios);
}
