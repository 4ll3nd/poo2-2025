package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.DosFichas;

class DosFichasTest {
	DosFichas dosFichas;
	@BeforeEach
	void setUp() throws Exception {
		dosFichas = new DosFichas();
	}

	@Test
	void testDosFichasIniciaElJuego() {
		assertEquals("Modo dos jugadores", dosFichas.iniciar());
	}

}
