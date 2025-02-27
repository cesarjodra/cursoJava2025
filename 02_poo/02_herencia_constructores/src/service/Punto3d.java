package service;

public class Punto3d extends Punto {
	private int z;
	public Punto3d(int z) {
		this.z=z;
	}
	public Punto3d(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}	
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.print(", "+z);
	}
}
