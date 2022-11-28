package palabrasExtremas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		/** Lectura de Archivo **/

		/*
		 * File archivo = new File("EXTREMAS.in"); Scanner scArchivo = new
		 * Scanner(archivo);
		 */
		FileReader archivo = new FileReader("EXTREMAS.in");
		BufferedReader scArchivo = new BufferedReader(archivo);

		String tamS = scArchivo.readLine();
		int tam = Integer.parseInt(tamS);
		String letraMasFrectuente = "oa";
		String palabra;

		/** Escritura de Archivo **/
		FileWriter fwArchivo = new FileWriter("EXTREMAS.out");
		PrintWriter salida = new PrintWriter(fwArchivo);

		/*
		 * System.out.println(tam); System.out.println(letraMasFrectuente);
		 * System.out.println(palabra);
		 */

		/** Proceso **/

		for (int k = 0; k < letraMasFrectuente.length(); k++) {

			salida.println(letraMasFrectuente.charAt(k));
			System.out.println(letraMasFrectuente.charAt(k));

			for (int i = 0; i < tam; i++) {// hasta cantidad de palabras

				palabra = scArchivo.readLine();// tomo la palabra
				char letra1 = palabra.charAt(0);
				char letra2 = palabra.charAt(palabra.length() - 1);

				if (letraMasFrectuente.charAt(i).indexOf(letra1) != -1 || letraMasFrectuente.charAt(i).indexOf(letra2) != -1) {

					salida.println(palabra);
					System.out.println(palabra);

				}
				
			}
		}

		fwArchivo.close();
		scArchivo.close();
	}

}
