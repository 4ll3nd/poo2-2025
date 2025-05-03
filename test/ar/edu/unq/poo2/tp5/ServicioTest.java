package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
class ServicioTest {
	private Servicio servicio;
	private Agencia agencia;
	@BeforeEach
	void setUp() throws Exception {
		agencia = mock(Agencia.class);
		servicio = new Servicio(300, 5, agencia);
	}

	@Test
	void testProcesar() {
		servicio.procesar();
		
		verify(servicio.getAgencia()).registrarPago(servicio);
		assertEquals(1500, servicio.getMonto());
	}

}
