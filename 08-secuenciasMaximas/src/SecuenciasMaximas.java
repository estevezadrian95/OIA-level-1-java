import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class SecuenciasMaximas {

	public static void main(String[] args) throws IOException {

		int auxiliar;
		int maxConsecutivos = 0;
		int sumadorConsecutivos = 0;
		int contadorValidos = 0;
		int tamanio;
		//LECTURA
		File fArchivo = new File("entrada.in");
		Scanner scArchivo = new Scanner(fArchivo);
		tamanio = scArchivo.nextInt();
		for(int i = 0; i<tamanio ; i++) {
			auxiliar = scArchivo.nextInt();
			if(auxiliar%2!=0 && auxiliar%3!=0 && auxiliar%5!=0) {
				sumadorConsecutivos++;
				contadorValidos++;
			}
			else {
				if(sumadorConsecutivos>maxConsecutivos)
					maxConsecutivos=sumadorConsecutivos;
					sumadorConsecutivos = 0;
			}
			
		}
		scArchivo.close();
		//ESCRITURA
		FileWriter fwArchivo = new FileWriter("salida.out");
		PrintWriter salida = new PrintWriter(fwArchivo);
		salida.println(contadorValidos);
		salida.println(maxConsecutivos);
		fwArchivo.close();
	}
}
