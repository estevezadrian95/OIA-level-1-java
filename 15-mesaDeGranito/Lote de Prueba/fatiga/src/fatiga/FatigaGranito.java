package fatiga;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FatigaGranito {

	public static void main(String[] args) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter("F.in"));
		long decrementador = 1000000;
		salida.println(decrementador);
		for (long i = 0; i < 200355; i++) {
			long p = i + 1;
			salida.println(decrementador + " " + p);
			decrementador--;

		}

	}

}
