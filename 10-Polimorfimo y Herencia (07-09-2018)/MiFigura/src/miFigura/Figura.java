package miFigura;

public abstract class Figura {
	String Color;
	Punto origen;
	
	public Figura(String Color, Punto origen)
	{
		this.Color = Color;
		this.origen = origen;
	}
	
	public abstract double calcularArea();
	
	public String getColor()
	{
		return this.Color;
	}
	
	public void desplazar(Punto punto)
	{
		this.origen.desplazar(punto);
	}
}
