package service;

public class ProvinciasServiceFactory {
	public static ProvinciasService getProvinciasService() {
		return new ProvinciasServiceImp();
	}
}
