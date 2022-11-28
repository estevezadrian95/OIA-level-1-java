package formandoEquipo;

import java.util.Arrays;

/**FALLAS
 * - Cuenta mal la cantidad de personas
 * - Ineficiente el metodo comparacionDeFormularios
 * - Error de carga del archivo(arreglado a lo negro)----Mejorar
 **/
	
public class Equipo {

	private Colaborador colaboradores[];
	private int cantPreguntas;
	private int cantColaboradores;

	public Equipo(Colaborador[] colaboradores, int cantPreguntas, int cantColaboradores) {

		this.colaboradores = colaboradores;
		this.cantPreguntas = cantPreguntas;
		this.cantColaboradores = cantColaboradores;
	}

	public Equipo() {

		this.cantPreguntas = 0;
		this.cantColaboradores = 0;
	}

	public int comparacionDeFormularios(String cadena01, String cadena02) {

		int contador = 0;

		for (int i = 0; i < cadena01.length(); i++) {
			if (cadena01.charAt(contador) == cadena02.charAt(contador))
				contador++;
		}

		return contador;
	}

	public Colaborador equipoFormado() {

		Colaborador formado = new Colaborador(null);
		int preCorrectas = 0;
		int personasCorrectas = 1;
		int personaCorrectaAUX = 2;
		int preCorrectasAUX = 0;
		int pos = 0;

		for (int i = 0; i < cantColaboradores; i++) {// recorro todos los colaboradores

			for (int j = i + 1; j < cantColaboradores; j++) {// recorro los demas y los comparo

				preCorrectasAUX = comparacionDeFormularios(colaboradores[i].getFormulario(),
						colaboradores[j].getFormulario());

				if (preCorrectasAUX != 0 && preCorrectasAUX > preCorrectas) {
					// personasCorrectas++;
					pos = j;
					preCorrectas = preCorrectasAUX;
				} else {
					String formularioI = colaboradores[i].getFormulario();
					formularioI = formularioI.substring(0, preCorrectas);
					String formularioJ = colaboradores[j].getFormulario();
					formularioJ = formularioJ.substring(0, preCorrectas);
					System.out.println(formularioI);
					System.out.println(formularioJ);
					if (preCorrectasAUX != 0 && preCorrectas == preCorrectasAUX && formularioI == formularioJ)
						personasCorrectas++;

				}

			}

		}

		System.out.println("Preguntas iguales:  " + preCorrectas);
		System.out.println("Personas en el grupo: " + personasCorrectas);
		String aux = colaboradores[pos].getFormulario();
		String formularioGanador = aux.substring(0, preCorrectas);
		formado.setAfinidad(preCorrectas * preCorrectas * personasCorrectas);
		formado.setFormulario(formularioGanador);

		return formado;
	}

	public void setColaboradores(Colaborador[] colaboradores) {
		this.colaboradores = colaboradores;
	}

	public void setCantPreguntas(int cantPreguntas) {
		this.cantPreguntas = cantPreguntas;
	}

	public void setCantColaboradores(int cantColaboradores) {
		this.cantColaboradores = cantColaboradores;
	}

	public int getCantPreguntas() {
		return cantPreguntas;
	}

	public int getCantColaboradores() {
		return cantColaboradores;
	}

	@Override
	public String toString() {
		return "Equipo [colaboradores=" + Arrays.toString(colaboradores) + ", cantPreguntas=" + cantPreguntas
				+ ", cantColaboradores=" + cantColaboradores + "]";
	}

}
