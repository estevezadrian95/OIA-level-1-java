package miFigura;

public class Cuadrado extends Figura {
	public Cuadrado(String Color, Punto origen, double lado) {
		super(Color, origen);
		this.lado = lado;
	}

	private double lado;

	@Override
	public double calcularArea() {

		return (this.lado * this.lado);
	}

}
