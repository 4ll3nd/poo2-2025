package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Reposo;

class TestMaquinaEnReposo {
	Reposo reposo;
	@BeforeEach
	void setUp() throws Exception {
		reposo = new Reposo();
	}

	@Test
	void testReposoIniciaLaMaquina() {
		assertEquals("Ingrese Fichas", reposo.iniciar());
	}

}
