package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import model.Movimientos;

//Guarda los movimientos que se producen en la cuenta
	// Tipo(ingreso,extracción), fecha, cantidad
	// Incluye un método que devuelve los movimientos producidos

public class CuentaMovimientos extends CuentaLimitada{
	
	private ArrayList<Movimientos> movimientos = new ArrayList<>();
	
	public CuentaMovimientos(double saldo,double limite) {
		super(saldo, limite);
		
	}

	@Override
	public void extraer(double cantidad) {
		super.extraer(cantidad);		
		Movimientos movimiento = altaMovimiento("Extracción", LocalDateTime.now(), cantidad);
		movimientos.add(movimiento);
	}

	@Override
	public void ingresar(double cantidad) {
		super.ingresar(cantidad);	
		Movimientos movimiento = altaMovimiento("Ingreso", LocalDateTime.now(), cantidad);
		movimientos.add(movimiento);
	}
	
	public Movimientos altaMovimiento(String tipo, LocalDateTime fecha, double cantidad) {		
		Movimientos movimiento = new Movimientos(cantidad, fecha, tipo);
		return movimiento;
	}
	
	public ArrayList<Movimientos> devolverMovimientos() {		
		return movimientos;
	}
}




	
	