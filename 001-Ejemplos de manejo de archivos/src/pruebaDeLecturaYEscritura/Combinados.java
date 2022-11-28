package pruebaDeLecturaYEscritura;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Combinados {

	public static void main(String[] args) throws IOException {
		//Lectura
		System.out.println("\nNUMEROS DEORDENADOS\n");
				File archivo = new File("numeros desordenados.in");
		Scanner scArchivo = new Scanner(archivo);
		int tam = scArchivo.nextInt();
		int[] numeros = new int[tam];
		for (int i = 0; i < tam; i++) {

			numeros[i] = scArchivo.nextInt();
			System.out.println(numeros[i]);

		}
		Arrays.sort(numeros); // metodo para ordenar un vector de enteros
		//Escritura
		System.out.println("\nNUMEROS ORDENADOS\n");
		FileWriter fwArchivo = new FileWriter("numeros ordenado.out");
		PrintWriter salida = new PrintWriter(fwArchivo);

		for(int i=0; i<tam; i++) {
			
			salida.println(numeros[i]);
			System.out.println(numeros[i]);
						
		}
		
	scArchivo.close();
	fwArchivo.close();
	}
}
