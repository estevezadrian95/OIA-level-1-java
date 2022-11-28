package nombreRepetido;

public class Nombre implements Comparable<Nombre> {

	String nombre;
	long cantRepet;

	public Nombre(String nombre, long cantRepet) {

		this.nombre = nombre;
		this.cantRepet = cantRepet;
	}

	public Nombre() {

		this.nombre = null;
		this.cantRepet = 0;
	}


	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public long getCantRepet() {
		return cantRepet;
	}

	public void setCantRepet(long cantRepet) {
		this.cantRepet = cantRepet;
	}
	
	
	@Override
	public int compareTo(Nombre nombre02) {

		if (this.cantRepet < nombre02.cantRepet)
			return 1;
		else if (this.cantRepet > nombre02.cantRepet)
			return -1;

		return 0;

	}

}
