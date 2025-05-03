package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventerioTest {
	Inventario inventario;
	@BeforeEach
	void setUp() throws Exception {
		inventario = new Inventario("harina", 3);
	}

	@Test
	void testAumentar() {
		inventario.aumentar(3);
		
		assertEquals(6, inventario.getCantidad());
	}
	
	@Test
	void testDecrementar() {
		inventario.decrementar();
		
		assertEquals(2, inventario.getCantidad());
	}

}
