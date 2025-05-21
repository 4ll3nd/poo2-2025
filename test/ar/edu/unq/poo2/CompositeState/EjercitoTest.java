package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Ejercito;
import ar.edu.poo2.tpCompositeState.Tropa;

class EjercitoTest {
	Ejercito ejercito;
	Tropa uno;
	Tropa dos;
	Tropa tres;
	@BeforeEach
	void setUp() throws Exception {
		ejercito = new Ejercito(new Point());
		uno = mock(Tropa.class);
		dos = mock(Tropa.class);
		tres = mock(Tropa.class);
	}

	@Test
	void testEjercitoSeMueve() {
		ejercito.caminar(3, 5);
		
		assertEquals(3, ejercito.getUbicacion().x);
		assertEquals(5, ejercito.getUbicacion().y);
	}
}
