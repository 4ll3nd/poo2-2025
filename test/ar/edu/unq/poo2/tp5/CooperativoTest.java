package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CooperativoTest {
	Cooperativo arroz;
	Inventario arrozInventario;
	@BeforeEach
	void setUp() throws Exception {
		arrozInventario = mock(Inventario.class);
		arroz = new Cooperativo("arroz", 300.0, arrozInventario); 
	}

	@Test
	void testProcesar() {
		arroz.procesar();
		
		verify(arroz.getInventario()).decrementar();
		assertEquals(270.0, arroz.procesar());
	}

}
