package reinasEnConflicto;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ArchivoTablero {

	public Tablero leer(String miDoc) throws FileNotFoundException {

		// creo los objetos

		File archivo = new File(miDoc);
		Scanner sc = new Scanner(archivo);
		sc.useLocale(Locale.ENGLISH);// ----->nose que hace

		int tamMat = sc.nextInt();
		int cantReinas = sc.nextInt();
		Reina[] reinas = new Reina[cantReinas];

		for (int i = 0; i < cantReinas; i++) {
			reinas[i] = new Reina(i + 1, sc.nextInt(), sc.nextInt());
		}

		sc.close();
		Tablero tablero = new Tablero(reinas, cantReinas);
		//System.out.println(tablero.toString());
		return tablero;
	}

	public void imprimirResultado(ArrayList<Long> lista, String miDoc) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter(miDoc));

		salida.println(lista.size() + " " + lista.toString());
		salida.close();

	}
}
