package view;

import java.util.List;
import java.util.Map;

import model.Cuenta;
import service.CuentasService;

public class AppCuentas {

	public static void main(String[] args) {
		// Para cada divisa, mostrar los números de cada cuenta			
		
		//var cuentasService = new CuentasService();		
		//Map<String, List<Cuenta>> map= cuentasService.apruparPorDivisa();
		
		// Se puede hacer de una:
		Map<String, List<Cuenta>> map = new CuentasService().apruparPorDivisa();
		
		map.forEach((k,v)->{
			System.out.println(k+": ");
			v.forEach(c->System.out.println("\t"+c.getNumeroCuenta()));
		});	
		
		// Para cada booleano, mostrar los números de cada cuenta	
		
		Map<Boolean, List<Cuenta>> map2 = new CuentasService().apruparPorFecha();
		
		System.out.println("Antiguas: ");
		map2.get(true).forEach(c->System.out.println("\t"+c.getNumeroCuenta()));
		
		System.out.println("Modernas: ");
		map2.get(false).forEach(c->System.out.println("\t"+c.getNumeroCuenta()));
		
	}

}
