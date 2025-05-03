package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
class ImpuestoTest {
	private Impuesto impuesto;
	private Agencia agencia;
	@BeforeEach
	void setUp() throws Exception {
		agencia = mock(Agencia.class);
		impuesto = new Impuesto(300, agencia);
	}

	@Test
	void testProcesar() {
		impuesto.procesar();
		
		verify(impuesto.getAgencia()).registrarPago(impuesto);
		assertEquals(300, impuesto.getMonto());
	}

}
