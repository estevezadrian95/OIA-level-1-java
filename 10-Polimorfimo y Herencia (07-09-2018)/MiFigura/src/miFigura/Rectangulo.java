package miFigura;

public class Rectangulo extends Figura {
	private double h;
	private double b;

	public Rectangulo(String Color, Punto origen, double h, double b) {
		super(Color, origen);
		this.h = h;
		this.b = b;
	}
	
	@Override
	public double calcularArea() {

		return (this.h * this.b);
	}

}
