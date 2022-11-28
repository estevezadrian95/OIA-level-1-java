package vendedoraPremiada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NegocioTest {

	@Test
	void testRecorrido() {

		int[] v = new int[6];
		v[0] = 1;
		v[2] = 2;
		v[3] = 55;
		v[4] = 55;
		v[5] = 2;

		int importe = 0;
		int importeactual = 0;

		for (int i = 0; i < 6; i++) {
			importe = 0;

			int k = i;
			int contador = 0;

			while (k < 6 && contador < 2) {
				importe += v[k];
				k++;
				contador++;

			}

			if (importeactual < importe)
				importeactual = importe;
		}

		assertEquals(110, importeactual);

	}

	@Test
	void testRecorrido2() {

		int[] v = new int[7];
		v[0] = 1;
		v[2] = 2;
		v[3] = 55;
		v[4] = 55;
		v[5] = 2;
		v[6] = 110;

		int importe = 0;
		int importeactual = 0;

		for (int i = 0; i < 7; i++) {
			importe = 0;

			int k = i;
			int contador = 0;

			while (k < 7 && contador < 3) {
				importe += v[k];
				k++;
				contador++;

			}

			if (importeactual < importe)
				importeactual = importe;
		}

		assertEquals(167, importeactual);

	}

}
