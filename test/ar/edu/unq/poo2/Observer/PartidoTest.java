package ar.edu.unq.poo2.Observer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PartidoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testInicializacion() {
		Partido partido = new Partido("3-2", "Futbol", Arrays.asList("coni", "alex"));
		
		assertEquals("3-2", partido.getResultado());
		assertEquals("Futbol", partido.getDeporte());
		assertEquals(2, partido.getContrincantes().size());
	}

}
