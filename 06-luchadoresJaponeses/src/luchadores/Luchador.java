package luchadores;

public class Luchador {
	private int peso;
	private int altura;

	public boolean domina(Luchador obj) {
		if ((this.peso > obj.peso && this.altura >= obj.altura) || (this.peso >= obj.peso && this.altura > obj.altura))
			return true;
		return false;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
}
