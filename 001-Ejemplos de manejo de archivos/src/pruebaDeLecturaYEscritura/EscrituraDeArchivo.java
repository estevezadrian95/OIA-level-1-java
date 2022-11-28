package pruebaDeLecturaYEscritura;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscrituraDeArchivo {

	public static void main(String[] args) throws IOException {

		FileWriter wtArchivo = new FileWriter("salida.out");
		PrintWriter salida = new PrintWriter(wtArchivo);

		for (int i = 0; i < 100; i++) {
			// salida = Integer.toString(i);//convierto el int a string;
			salida.println(i);
			System.out.println(i);
		}
		wtArchivo.close();//SI O SI (sino no graba )
	}

}
