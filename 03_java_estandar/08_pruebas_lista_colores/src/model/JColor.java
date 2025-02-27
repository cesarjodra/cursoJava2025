package model;

import java.awt.Color;

public class JColor {
	private String nombre;
	private Color color;
	public JColor(String nombre, Color color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}
	public JColor() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return nombre;
	}
}
