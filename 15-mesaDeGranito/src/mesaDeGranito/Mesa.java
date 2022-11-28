package mesaDeGranito;

import java.util.ArrayList;

public class Mesa {

	private ArrayList<Lados> mesas;
	private long cantApilados;

	public Mesa(ArrayList<Lados> mesas) {
		this.mesas = mesas;
	}

	public void apilar() {

		ArrayList<Lados> apilando = new ArrayList<>();
		int bandera = 0;
		for (int i = 0; i < mesas.size(); i++) {
			bandera = 0;

			for (int j = 0; j < i; j++) {
				if ((mesas.get(i).getAlto() <= mesas.get(j).getAlto()
						&& mesas.get(i).getAncho() <= mesas.get(j).getAncho())
						|| (mesas.get(i).getAncho() <= mesas.get(j).getAlto()
								&& mesas.get(i).getAlto() <= mesas.get(j).getAncho()))
					bandera = 1;
			}
			for (int k = i + 1; k < mesas.size(); k++) {
				if ((mesas.get(i).getAlto() <= mesas.get(k).getAlto()
						&& mesas.get(i).getAncho() <= mesas.get(k).getAncho())
						|| (mesas.get(i).getAncho() <= mesas.get(k).getAlto()
								&& mesas.get(i).getAlto() <= mesas.get(k).getAncho()))
					bandera = 1;
			}

			if (bandera == 0)// si la banera quedo en cero es porque nadie es mas chico que el
				apilando.add(mesas.get(i));
		} // primer for

		this.cantApilados = apilando.size();
		apilando.clear();
		
		if (cantApilados == 0)
			cantApilados = 1;
		System.out.println(cantApilados);
	}

	public long getCantApilados() {
		return cantApilados;
	}
}
