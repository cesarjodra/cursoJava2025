package service;

public class EmpleadosServiceFactory {
	public static EmpleadosService getEmpleadosService() {
		return new EmpleadosApp();
	}
}
