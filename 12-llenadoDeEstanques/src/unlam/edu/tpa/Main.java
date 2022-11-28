package unlam.edu.tpa;

import java.io.IOException;

import unlam.edu.tpa.Estanque.Pileta;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Pileta pileta = ArchivoEstanque.leerArchivoYcargar();
		
		int balanceAgua = pileta.verificarDesborde();
		if(  balanceAgua > 0)
			System.out.println("Hay un desborde de: " + balanceAgua);
		else
			pileta.distribuirAgua();
			
	}
}
