package miFigura;

public class Punto3D extends Punto2D{
	double z;
	
	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public Punto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}

	public Punto3D()
	{
		super();
		this.z = 0;
	}
	
	
	public boolean equals(Punto3D otroPunto)
	{
		return (this.z == otroPunto.z && this.getX() == otroPunto.getX() && this.getY() == otroPunto.getY());
	}
	
	public double distanciaAlOrigen()
	{
		return (Math.sqrt( Math.pow (this.getX(), 2) + Math.pow(this.getY(), 2) + Math.pow(this.z, 2)));
	}
	
	public double distancia(Punto3D otroPunto)
	{
		return (Math.sqrt( Math.pow (this.getX() - otroPunto.getX(), 2) + Math.pow(this.getY() - otroPunto.getY(), 2) + Math.pow(this.z - otroPunto.z, 2)));
	}
	
	public String toString()
	{
		return "("+this.getX()+";"+this.getY()+";"+this.z+")";
	}
	
	public static Punto3D clone(Punto3D punto)
	{
		Punto3D puntoClone = new Punto3D();
		puntoClone.setX(punto.getX());
		puntoClone.setY(punto.getY());;
		puntoClone.z = punto.z;
		return puntoClone;
	}
	
	public void desplazar(Punto3D punto)
	{
		this.setX(this.getX() + punto.getX());
		this.setY(this.getY() + punto.getY());
		this.z += z;
	}
}
