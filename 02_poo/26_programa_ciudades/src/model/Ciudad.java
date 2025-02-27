package model;

public record Ciudad(String nombre,long habitantes) {

	public String nombre() {
		return nombre;
	}

	public long habitantes() {
		return habitantes;
	}

}
