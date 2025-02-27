package service;

public class Director extends Empleado {
	private String departamento;
	private int personalCargo;
	public Director(String nombre, double salario, String departamento, int personalCargo) {
		super(nombre, salario);
		this.departamento = departamento;
		this.personalCargo = personalCargo;
	}
	public Director(String nombre, double salario) {
		super(nombre, salario);
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getPersonalCargo() {
		return personalCargo;
	}
	public void setPersonalCargo(int personalCargo) {
		this.personalCargo = personalCargo;
	}	
	public double bonus() {
		return personalCargo * 100 + getSalario();
	}
}
