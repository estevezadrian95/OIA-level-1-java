package nombreRepetido;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArchivoJuego {

	public Juego leerArchivo(String miDoc) throws FileNotFoundException{

		File archivo = new File(miDoc);
		Scanner sc = new Scanner(archivo);
		sc.useLocale(Locale.ENGLISH);
		ArrayList<Nombre> listaDeNombres = new ArrayList<>();
		Nombre nombreAUX;
		long cantNombres = sc.nextLong();
		long nRepetidos = sc.nextLong();

		for (int i = 0; i < cantNombres; i++) {
			nombreAUX = new Nombre();
			nombreAUX.setNombre(sc.nextLine());
			listaDeNombres.add(nombreAUX);

		}
		/**
		 * parche mistico, el primero de la lista no lo toma y se queda sin guardar el
		 * ultimo
		 **/
		nombreAUX = new Nombre();
		nombreAUX.setNombre(sc.nextLine());
		listaDeNombres.add(nombreAUX);
		listaDeNombres.remove(0);

		sc.close();
		Juego juego = new Juego(listaDeNombres, cantNombres, nRepetidos);
		return juego;
	}

	public void escribirArchivo(Juego juego, String miDoc) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter(miDoc));
		salida.println(juego.listaGanadores.toString());
		System.out.println(juego.listaGanadores.toString());
		salida.close();
	}

}
