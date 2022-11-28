package Figura;

public class Triangulo extends Figura {

	private double base;
	private double lado2;
	private double lado3;
	private double altura;

	public Triangulo(String color, double base, double lado2, double lado3) {
		super(color);

		this.base = base;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public double calcularArea() {
		return ((this.base * this.calcularAltura()) / 2);
	}

	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", lado2=" + lado2 + ", lado3=" + lado3 + ", altura=" + altura + "]";
	}

	@Override
	public double calcularPerimetro() {
		return (this.base + this.lado2 + this.lado3);

	}

	public double calcularAltura() {

		return Math.sqrt(Math.pow(lado2, 2) - Math.pow(this.base / 2, 2));
	}

}
