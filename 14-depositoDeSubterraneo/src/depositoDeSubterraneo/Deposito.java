package depositoDeSubterraneo;

public class Deposito {
	private long superficie;
	private long profundidad;

	public Deposito(long superficie, long profundidad) {

		this.superficie = superficie;
		this.profundidad = profundidad;
	}

	public Deposito() {

		this.superficie = 0;
		this.profundidad = 0;
	}

	public long getSuperficie() {
		return superficie;
	}

	public void setSuperficie(long superficie) {
		this.superficie = superficie;
	}

	public long getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(long profundidad) {
		this.profundidad = profundidad;
	}

	@Override
	public String toString() {
		return "Deposito [superficie=" + superficie + ", profundidad=" + profundidad + "]";
	}

}
