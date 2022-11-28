package miFigura;

public class Punto2D implements Punto{
	private double x;
	private double y;
	

	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}


	public Punto2D()
	{
		this.x = 0;
		this.y = 0;
	}
	
	
	public Punto2D(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public double distanciaAlOrigen()
	{
		return (Math.sqrt( Math.pow (this.x, 2) + Math.pow(this.y, 2)));
	}
	
	public double distancia(Object punto)
	{
		Punto2D otroP = (Punto2D) punto;
		return (Math.sqrt( Math.pow (this.x - otroP.x, 2) + Math.pow(this.y - otroP.y, 2)));
	}
	
	public String toString()
	{
		return "("+this.x+";"+this.y+")";
	}
	
	public boolean equals(Punto2D punto)
	{	
		return (this.x == punto.x && this.y == punto.y);
	}
	/*
	public Object clone(Object punto)
	{
		
		Punto2D puntoClone = (Punto2D) punto; //Se casteo despues de hacer la interfaz
		puntoClone.x = punto.x;
		puntoClone.y = punto.y;
		return puntoClone;
	}
	*/
	public Object clone() {
		return new Punto2D(this.x, this.y);
	}
	
	public void desplazar(Object punto)
	{
		Punto2D otroPunto = (Punto2D) punto;
		this.x += otroPunto.x;
		this.y += otroPunto.y;
	}
}
