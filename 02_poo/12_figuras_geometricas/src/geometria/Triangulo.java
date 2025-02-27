package geometria;

// Atributos base y altura

public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	public Triangulo(String color, int base, int altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}		

	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double superficie() {
		return base*altura/2;
	}

}
