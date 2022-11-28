package reinasEnConflicto;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ArchivoTablero archivo = new ArchivoTablero();
		Tablero tablero = archivo.leer("conflictoFila.in");
		tablero.calcularConflictos("conflicto.out");
				
	}

}
