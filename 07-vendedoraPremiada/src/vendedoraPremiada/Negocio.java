package vendedoraPremiada;

public class Negocio extends Vendedora {

	private Vendedora vendedoras[];
	private int comparaciones;
	private int cantVendedoras;

	public Negocio(Vendedora[] vendedoras, int comparaciones, int cantVendedoras) {

		this.vendedoras = vendedoras;
		this.comparaciones = comparaciones;
		this.cantVendedoras = cantVendedoras;
	}

	public Negocio() {
		super();
		this.vendedoras = new Vendedora[0];
		this.comparaciones = 0;
		this.cantVendedoras = 0;
	}

	public int calcularImportesTotal(int cantComparaciones) {
		// retornara un valor el cual refleja si todavia queda alguna participante en
		// competencia

		int importeAUX = 0;
		int[] ventas;
		int esPosible = 0;

		for (int i = 0; i < this.cantVendedoras; i++) {// recorro todas las vendedoras del negocio 1X1

			if (this.vendedoras[i].getVentas().length >= cantComparaciones) {// verifico si la vendedora cumple con
																				// ventas nesesarias

				esPosible = 1;// cambio la bandera
				ventas = vendedoras[i].getVentas();// copio las ventas en el nuevo vector

				importeAUX = 0;

				for (int j = 0; j < ventas.length; j++) {// tengo que recorrer las ventas 1X1

					importeAUX = 0;// cuando empieza la acumulacion de ventas consecutivas esta en 0
					int contador = 0;
					int k = j;

					while (k < ventas.length && contador < comparaciones) {// lo utilizo para no pasarme de rango

						importeAUX += ventas[k];
						contador++;
						k++;
					}

					if (this.vendedoras[i].getImporte() < importeAUX)// si el nuevo importe consecutivo es mayor lo
						// actualizo
						this.vendedoras[i].setImporte(importeAUX);

				}

			} else
				this.vendedoras[i].setImporte(0);

		}

		return esPosible;
	}

	public Vendedora calcularGanadora() {

		Vendedora vendedoraGanadora = new Vendedora();
		int esPosible = calcularImportesTotal(this.comparaciones);
		int esEmpate = 1;

		if (esPosible == 0)// si da 0 en primera instancia significa que ninguna puede competir
			return vendedoraGanadora;

		while (esPosible == 1 && esEmpate == 1) {// finaliza cuando no tenga mas opcion de comparar y este en empate

			esEmpate = 0;

			if (esPosible == 1) {// entra al verdadero si hay posible ganador

				for (int j = 0; j < this.cantVendedoras; j++) {// compara el importe de todas las vendedoras

					if (vendedoraGanadora.getImporte() < this.vendedoras[j].getImporte()) {// i > i + 1

						vendedoraGanadora.setImporte(this.vendedoras[j].getImporte());
						vendedoraGanadora.setN_vendedora(j + 1);
						vendedoraGanadora.setVentasCons(comparaciones);
						esEmpate = 0;

					} else {

						if (this.vendedoras[j].getImporte() == this.vendedoras[j].getImporte()) {// EMPATE i == i+1
							esEmpate = 1;
							vendedoraGanadora.setN_vendedora(-1);
						}
					}
				}
			}
			if (esEmpate == 1)
				this.comparaciones++;
			esPosible = calcularImportesTotal(this.comparaciones);
		}
		return vendedoraGanadora;
	}

	public int getCantVendedoras() {
		return cantVendedoras;
	}

	public void setCantVendedoras(int cantVendedoras) {
		this.cantVendedoras = cantVendedoras;
	}

	public Vendedora[] getVendedoras() {
		return vendedoras;
	}

	public void setVendedoras(Vendedora[] vendedoras) {
		this.vendedoras = vendedoras;
	}

	public int getComparaciones() {
		return comparaciones;
	}

	public void setComparaciones(int comparaciones) {
		this.comparaciones = comparaciones;
	}

}
