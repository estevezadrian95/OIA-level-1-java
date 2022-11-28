package formandoEquipo;

public class Colaborador {

	private String formulario;
	private double afinidad;

	public double getAfinidad() {
		return afinidad;
	}

	public void setAfinidad(double afinidad) {
		this.afinidad = afinidad;
	}

	public Colaborador(String formulario) {
		super();
		this.formulario = formulario;
	}

	public Colaborador() {
		
	}

	public String getFormulario() {
		return formulario;
	}

	public void setFormulario(String formulario) {
		this.formulario = formulario;
	}

	@Override
	public String toString() {
		return "formulario= " + formulario;
	}

	
}
