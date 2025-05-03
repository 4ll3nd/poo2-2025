package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class ProductoTest {
	Producto arroz;
	Inventario arrozInventario;
	@BeforeEach
	void setUp() throws Exception {
		arrozInventario = mock(Inventario.class);
		arroz = new Producto("arroz", 300.0, arrozInventario); 
	}

	@Test
	void testProcesar() {
		arroz.procesar();
		
		verify(arroz.getInventario()).decrementar();
		assertEquals(300.0, arroz.procesar());
	}

}
