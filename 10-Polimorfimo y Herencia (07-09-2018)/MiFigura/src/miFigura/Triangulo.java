package miFigura;

public class Triangulo extends Figura {
	private double base;
	private double altura;

	public Triangulo(String Color, Punto origen, double base, double altura) {
		super(Color, origen);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {

		return ((this.base * this.altura) / 2);
	}

}
