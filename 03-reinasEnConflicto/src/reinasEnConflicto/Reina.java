package reinasEnConflicto;

public class Reina {

	private long n_reina;
	private long fila;
	private long columna;
	private long sumaFC; // para verificar la suma secundaria
	private long diagonalP; // para ver diagonal principal

	public Reina(long n_reina, long fila, long columna) {

		this.n_reina = n_reina;
		this.fila = fila;
		this.columna = columna;
		this.sumaFC = this.fila + this.columna;
		this.diagonalP = this.fila - this.columna;

	}

	public Reina() {

		this.n_reina = 0;
		this.fila = 0;
		this.columna = 0;
		this.sumaFC = this.fila + this.columna;
		this.diagonalP = this.fila - this.columna;

	}

	public long getN_reina() {
		return n_reina;
	}

	public void setN_reina(long n_reina) {
		this.n_reina = n_reina;
	}

	public long getFila() {
		return fila;
	}

	public void setFila(long fila) {
		this.fila = fila;
	}

	public long getColumna() {
		return columna;
	}

	public void setColumna(long columna) {
		this.columna = columna;
	}

	public long getSumaFC() {
		return sumaFC;
	}

	public void setSumaFC(long sumaFC) {
		this.sumaFC = sumaFC;
	}

	public long getDiagonalP() {
		return diagonalP;
	}

	public void setDiagonalP(long diagonalP) {
		this.diagonalP = diagonalP;
	}

	@Override
	public String toString() {
		return "Reina [n_reina=" + n_reina + ", fila=" + fila + ", columna=" + columna + ", sumaFC=" + sumaFC
				+ ", diagonalP=" + diagonalP + "]";
	}
}
