package main;

import service.ProvinciasService;
import service.ProvinciasServiceFactory;

public class LanzarProceso {

	public static void main(String[] args) {

		ProvinciasService provinciasService = ProvinciasServiceFactory.getProvinciasService();
		
		provinciasService.guardarProvincias();
		
		provinciasService.guardarMunicipios();
		
		System.out.println("Proceso realizado!!");

	}

}
