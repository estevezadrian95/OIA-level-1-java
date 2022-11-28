package formandoEquipo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**FALLAS
 * - Cuenta mal la cantidad de personas
 * - Ineficiente el metodo comparacionDeFormularios
 * - Error de carga del archivo(arreglado a lo negro)----Mejorar
 **/

public class ArchivoEquipo {

	public Equipo leerArchivo(String nombreDoc) throws FileNotFoundException {

		// creando objetos para el manejo de archivos
		File archivo = new File(nombreDoc);
		Scanner sc = new Scanner(archivo);
		// variables auxiliares para la recopilacion de la informacion
		Equipo equipo = new Equipo();

		equipo.setCantPreguntas(sc.nextInt());// primera linea indica cantidad de preguntas
		equipo.setCantColaboradores(sc.nextInt());// segunda linea indica la cantidad de personas

		Colaborador[] colaboradores = new Colaborador[equipo.getCantColaboradores()];

		// System.out.println(equipo.getCantPreguntas());
		// System.out.println(equipo.getCantColaboradores());

		for (int i = 0; i < equipo.getCantColaboradores(); i++) {

			colaboradores[i] = new Colaborador();
			colaboradores[i].setFormulario(sc.nextLine());// luego de obtener ek formulario, añado a la lista al
			// System.out.println(colaboradores[i].getFormulario());

		}

		colaboradores[0].setFormulario(sc.nextLine());

		equipo.setColaboradores(colaboradores);// una vez que tengo todos los colaboradores los pongo en el equipo

		sc.close();// cierro el archivo

		return equipo;// retorno equipo

	}

	public void escribirArchivo(Colaborador colaborador, String nombreDoc) throws IOException {

		PrintWriter salida = new PrintWriter(new FileWriter(nombreDoc));
		salida.println(colaborador.getAfinidad());
		salida.println(colaborador.getFormulario());

		System.out.println("AFinidad: " + colaborador.getAfinidad());
		System.out.println("Formulario: " + colaborador.getFormulario());

		salida.close();
	}

}
