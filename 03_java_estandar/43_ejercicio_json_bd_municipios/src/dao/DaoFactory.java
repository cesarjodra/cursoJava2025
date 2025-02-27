package dao;

public class DaoFactory {
	public static MunicipiosDao getMunicipiosDao() {
		return new MunicipiosDaoImp();
	}
	public static ProvinciasDao geProvinciasDao() {
		return new ProvinciasDaoImp();
	}

}
