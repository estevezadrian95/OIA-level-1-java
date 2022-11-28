package fatigaDeposito;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fatigaDeposito {

	public static void main(String[] args) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter("F.in"));
		salida.println(500);
		for (int i = 0; i < 500; i++) {
			salida.println(400 + " " + 200);
		}
		salida.println(1000000);
salida.close();
	}

}
