package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.awt.Point;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Ingeniero;

class Ingenierotest {
	Ingeniero ing;
	@BeforeEach
	void setUp() throws Exception {
		ing = new Ingeniero(new Point());
	}

	@Test
	void testIngenieroSeMueve() {
		ing.caminar(3, 5);
		
		assertEquals(3, ing.getUbicacion().x);
		assertEquals(5, ing.getUbicacion().y);
	}

}
