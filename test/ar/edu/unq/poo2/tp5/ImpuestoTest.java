package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTest {

	@Test
	void testMonto() {
		Impuesto iva = new Impuesto(300);
		
		assertEquals(300, iva.monto());
	}

}
