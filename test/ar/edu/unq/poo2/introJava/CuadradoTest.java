package ar.edu.unq.poo2.introJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTest {
	Cuadrado a;
	@BeforeEach
	void setUp() throws Exception {
		Point x = new Point(3,4);
		a = new Cuadrado(3, x);
	}

	@Test
	void testArea() {
		assertEquals(9, a.area());
	}
	
	@Test
	void testPerimetro() {
		assertEquals(12, a.perimetro());
	}

}
