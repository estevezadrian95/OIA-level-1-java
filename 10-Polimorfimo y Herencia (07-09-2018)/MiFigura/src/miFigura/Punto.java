package miFigura;

public interface Punto {
	
	public double distancia(Object obj);
	public double distanciaAlOrigen();	
	public String toString();
	public boolean equals(Object obj);
	public Object clone();
	public void desplazar(Object obj);
}
