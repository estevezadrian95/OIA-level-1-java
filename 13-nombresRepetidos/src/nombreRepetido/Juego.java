package nombreRepetido;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
/**
 * Complejidad n al cuadrado
 * Conte la cantidad de veces que se repitio el nombre con un for
 * luego ordene la lista de mayor a menor por repeticiones
 * por ultimo los añadi a un HashMap ya que no almacena repetidos (en este caso nombres)
 * **/
public class Juego {

	HashMap<String, Long> listaGanadores; // los ganadores van a ir en esta lista
	private ArrayList<Nombre> listaNombres;
	long cantNombre;
	long nRepeticiones;

	public Juego(ArrayList<Nombre> listaNombres, long cantNombre, long nRepeticiones) {
		this.setListaNombres(listaNombres);
		this.cantNombre = cantNombre;
		this.nRepeticiones = nRepeticiones;
	}

	public void nombresRepetidos() {
		listaGanadores = new HashMap<String, Long>();
		int contador = 0;
		for (int i = 0; i < listaNombres.size(); i++) {
			contador = 1;
			for (int j = 0; j < listaNombres.size(); j++) {

				if (listaNombres.get(i).getNombre().equals(listaNombres.get(j).getNombre())) 
					listaNombres.get(i).setCantRepet(contador++);
			}
		}

		Collections.sort(listaNombres);
		int i = 0;
		while (listaGanadores.size() < nRepeticiones) {

			listaGanadores.put(listaNombres.get(i).getNombre(), listaNombres.get(i).getCantRepet());
			i++;
		}
	}

	public void setListaNombres(ArrayList<Nombre> listaNombres) {
		this.listaNombres = listaNombres;
	}

}
