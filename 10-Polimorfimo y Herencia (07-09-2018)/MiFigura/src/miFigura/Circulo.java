package miFigura;

public class Circulo extends Figura{
	private double radio;
	
	public Circulo(String Color, Punto punto, double radio)
	{
		super(Color, punto);
		this.radio = radio;
	}
	
	public double calcularArea()
	{
		return Math.PI * Math.pow(this.radio, 2);
	}
}
