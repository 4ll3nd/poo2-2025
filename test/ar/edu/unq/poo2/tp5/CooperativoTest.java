package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CooperativoTest {
	@Test
	void testPrecio() {
		Producto arroz = new Cooperativo("Arroz", 100.0);
		
		assertEquals(90.0, arroz.getPrecio());
	}

}
