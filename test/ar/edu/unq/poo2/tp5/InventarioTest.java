package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventarioTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAumentarInventario() {
		Inventario x = new Inventario("harina", 12);
		
		x.aumentar(1);
		
		assertEquals(13, x.getCantidad());
	}
	
	@Test
	void testDecrementarInventario() {
		Inventario x = new Inventario("harina", 12);
		
		x.decrementar();
		
		assertEquals(11, x.getCantidad());
	}
}
