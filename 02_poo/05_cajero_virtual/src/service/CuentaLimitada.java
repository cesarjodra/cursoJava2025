package service;

// El límite será proporcionado en el constructor
// Solo se podrá extraer si la cantidad es inferior o igual al límite

public class CuentaLimitada extends CuentaBase {	
	private double limite;
	public CuentaLimitada(double saldo, double limite) {
		super(saldo);
		this.limite=limite;
	}	
	
	@Override
	public void extraer(double cantidad) {		
		if(cantidad<=limite) {
			super.extraer(cantidad);
		}
		else {
			super.extraer(limite);
		}
	}
	
}