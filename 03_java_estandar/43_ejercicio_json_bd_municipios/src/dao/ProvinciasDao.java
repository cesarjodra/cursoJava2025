package dao;

import java.util.List;

import model.Provincia;

public interface ProvinciasDao {
	void save(Provincia provincia);
	Provincia findByCodigo(String codigo);
	void saveAll(List<Provincia> provincias);
}
