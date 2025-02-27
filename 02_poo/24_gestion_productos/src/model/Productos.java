package model;

public class Productos {
	private String nombre;	
	private double precio;
	private String categoria;
	public Productos(String nombre, double precio, String categoria) {
		this.nombre=nombre;
		this.precio=precio;
		this.categoria=categoria;
	}
	public Productos() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
