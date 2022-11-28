package miFigura;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Punto2DTest {

	@Test
	public void caso01() {
		Punto2D punto1 = new Punto2D();
		assertEquals("(0.0;0.0)", punto1.toString());
		}

	@Test
	public void caso02() {
		Punto2D punto1 = new Punto2D(1, 1);
		assertEquals("(1.0;1.0)", punto1.toString());
		}
	/*
	@Test
	public void caso03() {
		Punto2D punto1 = new Punto2D(1, 1);
		Punto2D punto2 = Punto2D.clone(punto1);
		assertEquals("(1.0;1.0)", punto1.toString());
		}
	*/


}
