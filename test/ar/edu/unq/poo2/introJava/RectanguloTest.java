package ar.edu.unq.poo2.introJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {
	Point b = new Point(3,5);
	Rectangulo a;
	@BeforeEach
	void setUp() throws Exception {
		a = new Rectangulo(b, 3, 6);
	}

	@Test
	void testArea() {
		assertEquals(18, a.area());
	}
	
	@Test 
	void testPerimetro() {
		assertEquals(18, a.perimetro());
	}

	@Test
	void testEsHorizontal() {
		assertTrue(a.esHorizontal());
		assertFalse(!a.esHorizontal());
	}
	
	@Test
	void testEsVerticla() {
		assertFalse(!a.esHorizontal());
	}
}
