package Figura;

public abstract class Figura {

	String color;

	public Figura(String color) {
		this.color = color;
	}

	public abstract String toString();

	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public String getColor() {
		return color;
	}

}
