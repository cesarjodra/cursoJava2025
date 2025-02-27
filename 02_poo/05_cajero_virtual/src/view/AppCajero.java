package view;

import java.util.ArrayList;

import model.Movimientos;
import service.CuentaMovimientos;

public class AppCajero {

	public static void main(String[] args) {
		// Crear un objeto cuentaMovimientos, realizar tres ingresos de dinero, y dos extracciones
		// Mostrar los movimientos en consola		
		
		CuentaMovimientos cuentaMovimientos = new CuentaMovimientos(5000, 200);
		
		cuentaMovimientos.ingresar(150);
		cuentaMovimientos.ingresar(50);
		cuentaMovimientos.ingresar(350);
		cuentaMovimientos.extraer(100);
		cuentaMovimientos.extraer(190);
		
		System.out.println("Saldo: "+cuentaMovimientos.obtenerSaldo());
		
		ArrayList<Movimientos> movimientos = cuentaMovimientos.devolverMovimientos();
		
		for(Movimientos cm:movimientos) {
			System.out.println(cm.getTipo() +": "+cm.getCantidad() +" -> "+cm.getFecha());
		}

	}

}
