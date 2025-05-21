package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.UnaFicha;

class UnaFichaTest {

	@Test
	void testUnaFichaIniciaElJuego() {
		UnaFicha ficha = new UnaFicha();
		assertEquals("Modo un jugador", ficha.iniciar());
	}
}
