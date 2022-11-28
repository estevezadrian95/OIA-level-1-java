package formandoEquipo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquipoTest extends Equipo {

	@Test
	void compararFormularios() {
		assertEquals(0, comparacionDeFormularios("abcac", "bbcad"));

	}

	@Test
	void compararFormularios1() {
		System.out.println(comparacionDeFormularios("abcde", "abcde"));
		assertEquals(5, comparacionDeFormularios("abcde", "abcde"));
		

	}



	@Test
	void compararFormularios3() {
		assertEquals(3, comparacionDeFormularios("abcac", "abcpd"));

	}

	@Test
	void compararFormularios4() {
		System.out.println(comparacionDeFormularios("aa", "aa"));
		assertEquals(2, comparacionDeFormularios("aa", "aa"));

	}

	@Test
	void compararFormularios5() {
		assertEquals(1, comparacionDeFormularios("a", "a"));
	}

}
