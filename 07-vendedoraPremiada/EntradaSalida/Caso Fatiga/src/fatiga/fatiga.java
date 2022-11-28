package fatiga;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fatiga {

	public static void main(String[] args) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter("fatiga.in"));
		salida.println(100);

		for (int j = 1; j <= 100; j++) {
			salida.println(1000);
			for (int i = 1; i <= 1000; i++) {
				salida.println(i);

			}
		}

		salida.close();
	}

}
