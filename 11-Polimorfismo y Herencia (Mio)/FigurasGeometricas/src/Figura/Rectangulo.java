package Figura;

public class Rectangulo extends Figura {

	private double altura;
	private double base;

	public Rectangulo(String color, double altura, double base) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	@Override
	public double calcularArea() {
		return (this.altura * this.base);
	}

	@Override
	public String toString() {
		return "Rectangulo [altura=" + altura + ", base=" + base + "]";
	}

	@Override
	public double calcularPerimetro() {
		return (this.altura * 2 + this.base * 2);
	}

}
