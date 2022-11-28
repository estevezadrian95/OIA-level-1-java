package Figura;

public class Circulo extends Figura {

	private double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override


	@Override
	public double calcularArea() {
		return (Math.PI * Math.pow(radio, 2));
	}

	@Override
	public String toString() {
		return "Circulo = ( "+getColor();
	}

	@Override
	public double calcularPerimetro() {
		return (2 * Math.PI * this.radio);
	}

}
