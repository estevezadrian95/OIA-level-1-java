package nombreRepetido;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ArchivoJuego archivo = new ArchivoJuego();
		Juego juego = archivo.leerArchivo("ES/1.in");
		juego.nombresRepetidos();
		archivo.escribirArchivo(juego, "ES/1.out");
		
	}
}
