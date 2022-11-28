package mesaDeGranito;

import java.io.FileNotFoundException;
//1.in ------> 3
//2.in ------> 1
//3.in ------> 1
//4.in ------> 2
//5.in ------> 1
//6.in ------> 2
//7.in ------> 3
//F.in ------> 3

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		long TInicio, TFin, tiempo;
		TInicio = System.currentTimeMillis();

		ArchivoMesa archivo = new ArchivoMesa();
		Mesa mesa = archivo.leerArchivoMesa("Lote de Prueba/1.in");
		mesa.apilar();
		archivo.imprimir(mesa, "Lote de Prueba/1.out");

		TFin = System.currentTimeMillis();
		tiempo = (TFin - TInicio);
		System.out.println("Tiempo de ejecucion en milisegundos: " + tiempo); 
	}
}
