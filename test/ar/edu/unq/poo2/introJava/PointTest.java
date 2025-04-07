package ar.edu.unq.poo2.introJava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTest {
	Point a;
	@BeforeEach
	void setUp() throws Exception {
		a = new Point(3, 4);
	}

	@Test
	void testMoverPunto() {
		a.moverPuntoA(1, 2);
		assertEquals(1, a.getX());
		assertEquals(2, a.getY());
	}
	
	@Test
	void testSumarPuntos() {
		Point b = new Point(1,2);
		a.sumarA(b);		
		assertEquals(4, a.getX());
		assertEquals(6, a.getY());
	}
}
