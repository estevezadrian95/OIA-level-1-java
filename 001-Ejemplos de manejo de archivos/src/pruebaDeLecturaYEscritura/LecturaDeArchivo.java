package pruebaDeLecturaYEscritura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaDeArchivo {

	public static void main(String[] args) throws FileNotFoundException {

		File archivo = new File ("entrada.in");// creo el nuevo archivo para lectura
		Scanner scArchivo = new Scanner (archivo);//creo un scanner para leer los archivos... el scanner se puede utilizar para entrada por teclado
		
		int tam = scArchivo.nextInt();
		/* tam toma el primer valor int que tiene el archivo. 
		 * nexInt() sirve para tomar la entrada por teclado o por archivo.
		 * */
		for(int i = 0; i < tam ; i++) {
			int numero = scArchivo.nextInt();
			System.out.println(numero);
			
		}		
	scArchivo.close();
	}
}
