package mesaDeGranito;

public class Lados implements Comparable<Lados>{
	
	private long alto;
	private long ancho;
	
	public Lados(long alto, long ancho) {
		
		this.alto = alto;
		this.ancho = ancho;
	}
	public Lados() {
		
		this.alto = 0;
		this.ancho = 0;
	}
	public long getAlto() {
		return alto;
	}
	public void setAlto(long alto) {
		this.alto = alto;
	}
	public long getAncho() {
		return ancho;
	}
	public void setAncho(long ancho) {
		this.ancho = ancho;
	}
	@Override
	public String toString() {
		return "alto = " + alto + " ancho = " + ancho + "\n";
	}
	@Override
	public int compareTo(Lados o) {
		if(alto*ancho < o.alto *o.ancho)
			return 1;
		else
			return -1;

		
	}
	
	
}
