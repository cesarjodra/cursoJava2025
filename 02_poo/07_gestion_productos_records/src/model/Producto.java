package model;

public record Producto(String nombre, String codigo, double precio, String categoria) {
	public Producto(){
		this(null,null,0,null);
	}
}
