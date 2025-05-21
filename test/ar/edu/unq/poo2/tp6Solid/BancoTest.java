package ar.edu.unq.poo2.tp6Solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
class BancoTest {
	private Banco banco;
	private Cliente cliente;
	private Solicitud prestamo;
	private Solicitud otroPrestamo;
	@BeforeEach
	void setUp() throws Exception {
		banco = new Banco();
		cliente = mock(Cliente.class);
		prestamo = mock(Solicitud.class);
		otroPrestamo = mock(Solicitud.class);
	}

	@Test
	void testAgregarCliente() {
		banco.agregarCliente(cliente);
		
		assertEquals(1, banco.getClientes().size());
	}
	
	@Test
	void testAgregarSolicitud() {
		banco.agregarSolicitud(prestamo);
		
		assertEquals(1, banco.getSolicitudes().size());
	}
	
	@Test
	void testTotalADesembolsar() {
		banco.agregarSolicitud(otroPrestamo);
		banco.agregarSolicitud(prestamo);
		when(otroPrestamo.getMonto()).thenReturn(3000.0);
		when(otroPrestamo.esAceptable()).thenReturn(true);
		when(prestamo.getMonto()).thenReturn(3000.0);
		when(prestamo.esAceptable()).thenReturn(true);
		
		assertEquals(6000.0, banco.getTotalADesembolsar());
	}
}
