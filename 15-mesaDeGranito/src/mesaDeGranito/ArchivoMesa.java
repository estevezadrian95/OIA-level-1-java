package mesaDeGranito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArchivoMesa {

	public Mesa leerArchivoMesa(String miDoc) throws FileNotFoundException {

		File archivo = new File(miDoc);
		Scanner sc = new Scanner(archivo);
		sc.useLocale(Locale.ENGLISH);

		long cant = sc.nextLong();
		ArrayList<Lados> mesas = new ArrayList<>();
		for (int i = 0; i < cant; i++) {
			Lados aux = new Lados();
			aux.setAlto(sc.nextLong());
			aux.setAncho(sc.nextLong());
			mesas.add(aux);
		}
		sc.close();
		Mesa mesa = new Mesa(mesas);
		return mesa;
	}

	public void imprimir(Mesa mesa, String miDoc) throws FileNotFoundException {

		PrintWriter salida = new PrintWriter(miDoc);
		salida.println(mesa.getCantApilados());
		salida.close();
	}
}
