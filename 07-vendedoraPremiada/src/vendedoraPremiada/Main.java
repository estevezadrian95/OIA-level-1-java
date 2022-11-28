package vendedoraPremiada;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		

		ArchivoNegocio archivo = new ArchivoNegocio();
		Negocio negocio = archivo.leerArchivoNegocio("premiadasFatiga.in");
		Vendedora vendedora = negocio.calcularGanadora();
		archivo.escribirGanadora(vendedora, "premiadas.out");
		long timepoInicio = System.currentTimeMillis();
		System.out.println("\n\nTimepo de ejecucion: "+timepoInicio);
	}

}
