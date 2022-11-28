package vendedoraPremiada;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class ArchivoNegocio extends Vendedora {

	public Negocio leerArchivoNegocio(String nombreArchivo) throws FileNotFoundException {

		File archivo = new File(nombreArchivo);
		Scanner sc = new Scanner(archivo);
		sc.useLocale(Locale.ENGLISH);// NOSE QUE HACE

		int cantVendedoras = sc.nextInt();// obtengo la cantidad de vendedoras
		int cantComparaciones = 0;
		Vendedora[] vendedora = new Vendedora[cantVendedoras];// inicializo al vector con la cantidad correspondiente

		for (int i = 0; i < cantVendedoras; i++) {

			vendedora[i] = new Vendedora();
			int cantVentasVendedora = sc.nextInt(); // el primer numero refleja la cant de ventas de esa vendedora
			int[] ventas = new int[cantVentasVendedora];

			for (int j = 0; j < cantVentasVendedora; j++)
				ventas[j] = sc.nextInt();

			vendedora[i].setN_vendedora(i);
			vendedora[i].setVentas(ventas);

		}
		cantComparaciones = sc.nextInt();
		Negocio negocio = new Negocio(vendedora, cantComparaciones, cantVendedoras);
		sc.close();
		return negocio;
	}

	public void escribirGanadora(Vendedora vendedora, String nombreDoc) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter(nombreDoc));

		if (vendedora.getN_vendedora() > 0) {
			// salida por archivo
			salida.println(vendedora.getN_vendedora());
			salida.print(vendedora.getVentasCons() + " ");
			salida.print(vendedora.getImporte());

			// salida por consola
			System.out.println(vendedora.getN_vendedora());
			System.out.print(vendedora.getVentasCons() + " ");
			System.out.print(vendedora.getImporte());
		}

		else {
			if (vendedora.getN_vendedora() == -1) {
				salida.println("NO SE PUDO DESEMPATAR"); // salida por archivo
				System.out.println("NO SE PUDO DESEMPATAR"); // salida por consola
			}
			else {
				salida.println("NO HAY GANADOR"); // salida por archivo
				System.out.println("NO HAY GANADOR"); // salida por consola
				
			}
		}
		salida.close();
	}
}
