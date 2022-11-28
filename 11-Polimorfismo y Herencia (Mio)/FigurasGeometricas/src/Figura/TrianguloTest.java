package Figura;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TrianguloTest {

	@Test
	void casoAltura() {
		Triangulo tri = new Triangulo("ROJO",10.0, 15.0, 15.0);

		assertEquals(10.0 * Math.sqrt(2.0), tri.calcularAltura());
	}

	@Test
	void casoArea() {
		Triangulo tri = new Triangulo("ROJO", 10.0, 15.0, 15.0);

		assertEquals((10 * (10.0 * Math.sqrt(2.0)) / 2), tri.calcularArea());

	}
}
