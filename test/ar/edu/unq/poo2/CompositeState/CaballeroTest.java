package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Caballero;

class CaballeroTest {
	Caballero caballero;
	@BeforeEach
	void setUp() throws Exception {
		caballero = new Caballero(new Point());
	}

	@Test
	void testCaballeroCamina() {
		caballero.caminar(3, 5);
		
		assertEquals(3, caballero.getUbicacion().x);
		assertEquals(5, caballero.getUbicacion().y);
	}

}
