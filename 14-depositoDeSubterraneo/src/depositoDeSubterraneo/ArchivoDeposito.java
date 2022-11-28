package depositoDeSubterraneo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ArchivoDeposito {

	private Scanner sc;

	public CalculoSubterraneo leerArchivo(String miDOC) throws FileNotFoundException {

		File archivo = new File(miDOC);
		sc = new Scanner(archivo);
		sc.useLocale(Locale.ENGLISH);
		long cantDepositos = sc.nextLong();
		ArrayList<Deposito> depositos = new ArrayList<>();

		for (int i = 0; i < cantDepositos; i++) {
			Deposito aux = new Deposito();
			aux.setSuperficie(sc.nextLong());
			aux.setProfundidad(sc.nextLong());
			depositos.add(aux);
		}
		long vol = sc.nextLong();
		CalculoSubterraneo nuevo = new CalculoSubterraneo(depositos, cantDepositos, vol);
		return nuevo;
	}

}
