package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {

	@Test
	void testMonto() {
		Servicio luz = new Servicio(150.0, 2);
		
		assertEquals(300.0, luz.monto());
	}

}
