package palindromo;

public class Frase {
	private String palabra;
	private String tipoPalabra;
	
	public String getPalabra() {
		return palabra;
	}
	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	public String getTipoPalabra() {
		return tipoPalabra;
	}
	public void setTipoPalabra(String tipoPalabra) {
		this.tipoPalabra = tipoPalabra;
	}
	@Override
	public String toString() {
		return palabra + ": " + tipoPalabra + " ";
	}
	
}
