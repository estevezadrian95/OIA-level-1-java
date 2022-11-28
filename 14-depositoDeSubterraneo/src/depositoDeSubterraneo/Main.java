package depositoDeSubterraneo;

import java.io.FileNotFoundException;

// 1.in ----------> rebasan:2
// 2.in ----------> cantidad de depositos: 2, profundidad: 1
// 3.in ----------> rebasan:1
// 4.in ----------> ////explota
// 5.in ----------> cantidad de depositos: 4, profundidad: 4
// 6.in ----------> rebasan: 12
// F.in ----------> 
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArchivoDeposito archivoDeposito = new ArchivoDeposito();
		CalculoSubterraneo calculo = archivoDeposito.leerArchivo("EntradaSalida/F.in");
		calculo.calcular();
	}

}
