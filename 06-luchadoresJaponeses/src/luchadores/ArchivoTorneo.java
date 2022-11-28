package luchadores;

import java.util.Scanner;

public class ArchivoTorneo {

	public static Torneo leer(String path) {
		Scanner archivo = new Scanner(path);
		Torneo torneo = new Torneo();
		int cantLuchador = archivo.nextInt();
		for(int i = 0; i<cantLuchador ; i++){
			torneo.luchadores[i].setPeso(archivo.nextInt());
			torneo.luchadores[i].setAltura(archivo.nextInt());
		
		}
		archivo.close();
		return torneo;
	}

	/**
	 * public static void main(String[] args) { // TODO Auto-generated method
	 * stub
	 * 
	 * }
	 **/
}
