package palindromo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ArchivoPalindromo {

	private Scanner sc;
	private PrintWriter salida;

	public Palindromo leer(String miDOC) throws FileNotFoundException {
		File archivo = new File(miDOC);
		sc = new Scanner(archivo);
		Palindromo nuevo = new Palindromo(sc.nextLine());
		sc.close();
		return nuevo;
	}

	public void escribir(Palindromo palindromo, String miDOC) throws IOException {
		salida = new PrintWriter(new FileWriter(miDOC));
		if (palindromo.getDistinquidas().size() == 0) {
			salida.println("no se puede.");
			salida.close();
		} else {
			for (int i = 0; i < palindromo.getDistinquidas().size(); i++) {
				salida.println(palindromo.getDistinquidas().get(i).getPalabra() + "  "
						+ palindromo.getDistinquidas().get(i).getTipoPalabra());
				// salida por sistema
				System.out.println(palindromo.getDistinquidas().get(i).getPalabra() + "  "
						+ palindromo.getDistinquidas().get(i).getTipoPalabra());
			}
			salida.close();
		}
	}
}
