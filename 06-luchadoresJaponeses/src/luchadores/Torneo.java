package luchadores;

public class Torneo {

	Luchador[] luchadores;
	private int[] resultados;
	int contador;

	public int[] resolver(int cantLuchadores) {// devuelve el vector de los
												// resultados
		luchadores = new Luchador[cantLuchadores];
		resultados = new int[cantLuchadores];
		for (int i = 0; i < cantLuchadores; i++) {
			contador = 0;
			for (int j = 0; j < i; j++) {

				if (luchadores[i].domina(luchadores[j]))
					contador++;
			}
			for (int k = i + 1; k < cantLuchadores; k++) {
				if (luchadores[i].domina(luchadores[k]))
					contador++;

			}

			resultados[i] = contador;

		}

		return resultados;

	}
}
