package ar.edu.unq.poo2.tp6Solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
class CreditoHipotecarioTest {
	Cliente cliente;
	Propiedad casa;
	CreditoHipotecario credito;
	@BeforeEach
	void setUp() throws Exception {
		cliente = mock(Cliente.class);
		casa = mock(Propiedad.class);
		credito = new CreditoHipotecario(cliente, 300.0, 10, casa);
	}

	@Test
	void testCuotaNoSuperaCincuentaPorcientoDeSueldoDelTitular() {
		when(cliente.getSueldoMensual()).thenReturn(300.0);
		
		assertTrue(credito.cumpleCriterioDeSueldo());
	}
	
	@Test
	void testCuotaSuperaCincuentaPorcientoDeSueldoDelTitular() {
		when(cliente.getSueldoMensual()).thenReturn(30.0);
		
		assertFalse(credito.cumpleCriterioDeSueldo());
	}
	
	@Test
	void montoSolicitadoNoEsMayorQueElSetentaPorcientoDelValorFiscalDeLaPropiedad() {
		when(casa.getValorFiscal()).thenReturn(3000.0);
		
		assertTrue(credito.cumpleCriterioDeMonto());
	}
	
	@Test
	void montoSolicitadoEsMayorQueElSetentaPorcientoDelValorFiscalDeLaPropiedad() {
		when(casa.getValorFiscal()).thenReturn(300.0);
		
		assertFalse(credito.cumpleCriterioDeMonto());
	}
	
	@Test 
	void creditoEsAceptable() {
		when(cliente.getSueldoMensual()).thenReturn(300.0);
		when(casa.getValorFiscal()).thenReturn(3000.0);
		assertTrue(credito.esAceptable());
	}
	
}
