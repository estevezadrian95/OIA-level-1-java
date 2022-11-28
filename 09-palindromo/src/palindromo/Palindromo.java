package palindromo;

import java.util.ArrayList;

public class Palindromo {
	/*
	 * El problema consiste en recibir una palabra y determinar los cortes, si los
	 * hubiera, que la descomponen en DOS PALABRAS DISTINGUIDAS, e indicar para cada
	 * una de ellas de que tipo o tipos es.
	 */

	String palabra;
	ArrayList<Frase> distinquidas;

	public Palindromo(String palabra) {
		this.palabra = palabra;
	}

	public Palindromo() {
		this.palabra = null;
	}

	public ArrayList<Frase> getDistinquidas() {
		return distinquidas;
	}

	public void setDistinquidas(ArrayList<Frase> distinquidas) {
		this.distinquidas = distinquidas;
	}

	public int tipoDePalabra(String palabra) {
		int i = 0;
		int j = palabra.length() - 1;

		while (i < j && palabra.charAt(i) == palabra.charAt(j)) {
			i++;
			j--;
		}
		if (i == j)
			return 1;// palindromo

		i = 0;
		j = palabra.length() - 2;

		while (i < j && palabra.charAt(i) == palabra.charAt(j)) {
			i++;
			j--;
		}

		int a = 1;
		int b = palabra.length() - 1;

		while (a < b && palabra.charAt(a) == palabra.charAt(b)) {
			a++;
			b--;
		}

		if (a == b && i == j)
			return 4;// es d-palindromo e i-palindromo
		if (a == b && i != j)
			return 3;// i-palindromo
		if (a != b && i == j)
			return 2;// d-palindromo
		return -1;// no es nada
	}

	public void quePalindromoEs() {

		this.distinquidas = new ArrayList<>();
		Frase aux = new Frase(); // la utilizo para guardar de a una palabra y luego ponerla en la lista

		if (this.palabra.length() <= 2)
			System.out.println("no se puede separar");

		int pos = 3; // para que sea palindromo o algo asi tiene que empezar minimo con 3 letras
		
		while (pos <= this.palabra.length() - 2) {
			String palabra1 = this.palabra.substring(0, pos);
			String palabra2 = this.palabra.substring(pos, this.palabra.length());
			int valor1 = tipoDePalabra(palabra1);
			int valor2 = tipoDePalabra(palabra2);

			if (valor1 != -1 && valor2 != -1) {// ocurre si se puede dividir la palabra en dos distinguidas

				if (valor1 == 1) {
					aux.setPalabra(palabra1);
					aux.setTipoPalabra("Palindromo");
				} else {
					if (valor1 == 2) {
						aux.setPalabra(palabra1);
						aux.setTipoPalabra("d-Palindromo");
					} else {
						if (valor1 == 3) {
							aux.setPalabra(palabra1);
							aux.setTipoPalabra("i-Palindromo");
						} else {
							if (valor1 == 4) {
								aux.setPalabra(palabra1);
								aux.setTipoPalabra("i-Palindromo, d-Palindromo");
							}
						}
					}
				}
				this.distinquidas.add(aux);// lo agrego a la lista
				aux = new Frase();

				if (valor2 == 1) {
					aux.setPalabra(palabra2);
					aux.setTipoPalabra("Palindromo");
				} else {
					if (valor2 == 2) {
						aux.setPalabra(palabra2);
						aux.setTipoPalabra("d-Palindromo");
					} else {
						if (valor2 == 3) {
							aux.setPalabra(palabra2);
							aux.setTipoPalabra("i-Palindromo");
						} else {
							if (valor2 == 4) {
								aux.setPalabra(palabra2);
								aux.setTipoPalabra("i-Palindromo, d-Palindromo");
							}
						}
					}
				}
				
				this.distinquidas.add(aux);
				aux = new Frase();
			}
			pos++;
		}
	}
}
