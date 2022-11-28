package reinasEnConflicto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Tablero {

	private Reina reinas[];
	private int cantReinas;

	public Tablero(Reina[] reinas, int cantReinas) {

		this.reinas = reinas;
		this.cantReinas = cantReinas;
	}

	@Override
	public String toString() {
		return "Tablero [reinas=" + Arrays.toString(reinas) + ", cantReinas=" + cantReinas + "]";
	}

	public void calcularConflictos(String miDoc) throws IOException {
		ArchivoTablero archivo = new ArchivoTablero();
		ArrayList<Long> resultados = new ArrayList<>();

		for (int i = 0; i < cantReinas; i++) {

			long restaFila = 0;
			long restaColumna = 0;
			long restaSec = 0;
			long restaPri = 0;
			long columnaAUX = 0;
			long filaAUX = 0;

			int banderaColumna = 0;
			int banderaFila = 0;
			int banderaDiaPri = 0;
			int banderaDiaSec = 0;

			long n_reinaAUX = 0; // n_reina de columna
			long n_reinaAUX2 = 0; // n_reina de fila
			long n_reinaAUX3 = 0; // n_reina de diagonal principal
			long n_reinaAUX4 = 0; // n_reina de diagonal secundaria

			for (int j = 0; j < cantReinas; j++) {

//////////////////////////////////////////Control de Columna///////////////////////////////////////////////////////////

				if (i != j) {

					if (reinas[i].getColumna() == reinas[j].getColumna() && banderaColumna == 0) {
						//cuando entra al primer if es porque es el primero
						restaFila = Math.abs(reinas[i].getFila() - reinas[j].getFila());
						banderaColumna = 1;
						filaAUX = reinas[i].getFila(); // lo utilizo para realizar la comparacion por si hay otro 
						n_reinaAUX = reinas[j].getN_reina();
						resultados.add(n_reinaAUX);
					}

					if (reinas[i].getColumna() == reinas[j].getColumna() && banderaColumna == 1) {
					//entra en este if por la bandera (ya hay otro)
						if ( filaAUX > reinas[i].getFila() && reinas[j].getFila() > reinas[i].getFila()
						  || filaAUX < reinas[i].getFila() && reinas[j].getFila() < reinas[i].getFila() ){
					// va a entrar a este if en caso de que la nueva reina encontrada este del mismo lado

							

							if (filaAUX > reinas[j].getFila()) { // si el nuevo esta mas cerca
								
								resultados.remove(n_reinaAUX);// saco el anterior mas cercano
								n_reinaAUX = reinas[j].getN_reina();// pongo a la nueva reina mas cercana
								resultados.add(n_reinaAUX);// pongo en la lista a la nueva reina
							}
						} else {
							restaFila = Math.abs(reinas[i].getFila() - reinas[j].getFila());
							banderaColumna = 1;
							filaAUX = reinas[i].getFila();
							n_reinaAUX = reinas[j].getN_reina();
							resultados.add(n_reinaAUX);
						}
					}

				}
////////////////////////////////////////////Control de Fila///////////////////////////////////////////////////////////

				if (i != j) {
					if (reinas[i].getFila() == reinas[j].getFila() && banderaFila == 0) {// es el primero
						restaColumna = Math.abs(reinas[i].getColumna() - reinas[j].getColumna());
						banderaFila = 1;
						columnaAUX = reinas[j].getColumna();// -----> lo uso para comparar si estan del mismo lado o no
						n_reinaAUX2 = reinas[j].getN_reina();
						resultados.add(n_reinaAUX2);
					}

					if (reinas[i].getFila() == reinas[j].getFila() && banderaFila == 1) {// ya hay otro con la misma
																							// fila

						if ( columnaAUX > reinas[i].getColumna() && reinas[j].getColumna() > reinas[i].getColumna()
						  || columnaAUX < reinas[i].getColumna() && reinas[j].getColumna() < reinas[i].getColumna()){
								

								resultados.remove(n_reinaAUX2);// saco el anterior mas cercano
								n_reinaAUX2 = reinas[j].getN_reina();// pongo a la nueva reina mas cercana
								resultados.add(n_reinaAUX2);// pongo en la lista a la nueva reina
							

						} else {
							restaColumna = Math.abs(reinas[i].getColumna() - reinas[j].getColumna());
							banderaFila = 1;
							columnaAUX = reinas[j].getColumna();// -----> lo uso para comparar si estan del mismo lado
							n_reinaAUX2 = reinas[j].getN_reina();
							resultados.add(n_reinaAUX2);
						}
					}
				}
///////////////////////////////////////////Control de Diagonales secundaria///////////////////////////////////////////
//				if (reinas[i].getSumaFC() == reinas[j].getSumaFC() && banderaDiaSec == 0) {
//
//					banderaDiaSec = 1;
//					restaSec = Math.abs(reinas[i].getFila() - reinas[j].getFila());
//					n_reinaAUX4 = reinas[j].getN_reina();
//					resultados.add(n_reinaAUX4);
//				}
//				if (reinas[i].getSumaFC() == reinas[j].getSumaFC() && banderaDiaSec == 1) {// ya hay otro con la misma
//					// fila
//
////SE TIENE QUE CALCULAR LA DISTANCIA DE LA NUEVA REINA
//					long restaD = Math.abs(reinas[i].getColumna() - reinas[i].getColumna());
//
//					if (restaD < restaSec) { // si el nuevo esta mas cerca
//						restaSec = restaD; // pongo los nuevos valores
//						resultados.remove(n_reinaAUX4);// saco el anterior mas cercano
//						n_reinaAUX4 = reinas[j].getN_reina();// pongo a la nueva reina mas cercana
//						resultados.add(n_reinaAUX4);// pongo en la lista a la nueva reina
//					}
//				}
/////////////////////////////////////////control de Diagonal Principal/////////////////////////////////////////////////
//				if (reinas[i].getDiagonalP() == reinas[j].getDiagonalP() && banderaDiaPri == 0) {
//
//					banderaDiaPri = 1;
//					restaPri = Math.abs(reinas[i].getFila() - reinas[j].getFila());
//					n_reinaAUX3 = reinas[j].getN_reina();
//					resultados.add(n_reinaAUX3);
//				}
//				if (reinas[i].getDiagonalP() == reinas[j].getDiagonalP() && banderaDiaPri == 1) {// ya hay otro con la
//					// misma fila
//
////SE TIENE QUE CALCULAR LA DISTANCIA DE LA NUEVA REINA
//					long restaE = Math.abs(reinas[i].getColumna() - reinas[i].getColumna());
//
//					if (restaE < restaPri) { // si el nuevo esta mas cerca
//						restaPri = restaE; // pongo los nuevos valores
//						resultados.remove(n_reinaAUX3);// saco el anterior mas cercano
//						n_reinaAUX3 = reinas[j].getN_reina();// pongo a la nueva reina mas cercana
//						resultados.add(n_reinaAUX3);// pongo en la lista a la nueva reina
//					}
//				}
//				//}

			} // termina el segundo for
			System.out.println(
					"reina n°= " + (i + 1) + " cant de conflictos: " + resultados.size() + resultados.toString());
			resultados.clear();// borro el arraylist
		}

	}

}
