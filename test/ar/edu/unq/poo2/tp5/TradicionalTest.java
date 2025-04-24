package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TradicionalTest {
	@Test
	void testPrecio() {
		Producto harina = new Tradicional("Harina", 300.0);
		
		assertEquals(300.0, harina.getPrecio());
	}
	
}
