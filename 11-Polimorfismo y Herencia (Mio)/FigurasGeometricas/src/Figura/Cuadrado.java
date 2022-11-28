package Figura;

public class Cuadrado extends Figura {

	private double base;

	public Cuadrado(String color, double base) {
		super(color);
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return (Math.pow(this.base, 2));
	}

	@Override
	public String toString() {
		return "Cuadrado [base=" + base + "]";
	}

	@Override
	public double calcularPerimetro() {

		return (this.base * 4);
	}

}
