package formandoEquipo;

import java.io.IOException;

/**FALLAS
 * - Cuenta mal la cantidad de personas
 * - Ineficiente el metodo comparacionDeFormularios
 * - Error de carga del archivo(arreglado a lo negro)----Mejorar
 **/

public class Main {

	public static void main(String[] args) throws IOException {
		ArchivoEquipo archivo = new ArchivoEquipo();
		Equipo equipo = archivo.leerArchivo("EntradaSalida/equipo.in");
		
		//System.out.println(equipo.toString());
		archivo.escribirArchivo(equipo.equipoFormado(), "EntradaSalida/equipo.out");

	}
}
