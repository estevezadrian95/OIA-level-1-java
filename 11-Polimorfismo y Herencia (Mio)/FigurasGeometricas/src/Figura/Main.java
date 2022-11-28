package Figura;

public class Main {

	public static void main(String[] args) {

		Circulo circulo = new Circulo("ROJO", 6.3);
		Cuadrado cuadrado = new Cuadrado("ROJO", 7.0);
		Triangulo triangulo = new Triangulo("ROJO", 10.0, 15.0, 15.0);
		Rectangulo rectangulo = new Rectangulo("ROJO", 6.0, 12.0);

		Figura[] vec = new Figura[4];
		double sumaPerimetro = 0.0;
		double sumaArea = 0.0;
		
		vec[0] = circulo;
		vec[1] = cuadrado;
		vec[2] = triangulo;
		vec[3] = rectangulo;

		for (int i = 0; i < 4; i++) {

			sumaPerimetro += vec[i].calcularPerimetro();
			sumaArea += vec[i].calcularArea();
		}

		System.out.println(sumaArea);
		System.out.println(sumaPerimetro);

	}

}
