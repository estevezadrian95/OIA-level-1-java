package unlam.edu.tpa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import unlam.edu.tpa.Estanque.Pileta;

public class ArchivoEstanque {

	public static Pileta leerArchivoYcargar() throws IOException {

		Scanner scanner = new Scanner(new File("datosEstanques.in"));

		int cant = scanner.nextInt();

		Estanque[] estanques = new Estanque[cant]; // vector para almacenar la lectura
		for (int i = 0; i < estanques.length - 1; i++)
			estanques[i] = new Estanque(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

		estanques[estanques.length - 1] = new Estanque(scanner.nextInt(), scanner.nextInt(), 0);

		Pileta pileta = new Pileta(estanques, scanner.nextInt());
		scanner.close();
		return pileta;
	}// end leerEstanques
}
