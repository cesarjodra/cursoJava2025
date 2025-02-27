package service;

public class CuentaBase {
	private double saldo;
	public CuentaBase(double saldo) {
		this.saldo=saldo;
	}
	public double obtenerSaldo() {
		return saldo;
	}
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
}
