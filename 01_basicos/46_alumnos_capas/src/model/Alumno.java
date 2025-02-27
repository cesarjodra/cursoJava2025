package model;

public class Alumno {
	private String dni;
	private String nombre;
	private double nota;
	private String curso;
	
	public Alumno(String dni, String nombre, double nota, String curso) {
		this.dni = dni;
		this.nombre = nombre;
		this.nota = nota;
		this.curso = curso;
	}
	
	public Alumno() {
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
