package palindromo;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ArchivoPalindromo archivo = new ArchivoPalindromo();
		Palindromo palabra = archivo.leer("Lotes de Prueba/Entrada/01.in");
		palabra.quePalindromoEs();
		archivo.escribir(palabra, "Lotes de Prueba/Salida Esperada/01.out");
		
	}
}
