package ar.edu.unq.poo2.tp6Solid;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CreditoPersonalTest {
	CreditoPersonal credito;
	Cliente cliente;
	@BeforeEach
	void setUp() throws Exception {
		cliente = mock(Cliente.class);
		credito = new CreditoPersonal(cliente, 3000.0, 12);
	}

	@Test
	void testCumpleCriterioDeSueldo() {
		when(cliente.getSueldoNetoAnual()).thenReturn(20.000);
		assertTrue(credito.cumpleCriterioDeSueldo());
	}
	
	@Test
	void testNoCumpleCriterioDeSueldo() {
		when(cliente.getSueldoNetoAnual()).thenReturn(5.000);
		assertFalse(credito.cumpleCriterioDeSueldo());
	}
	
	@Test
	void testCumpleCriterioDeMonto() {
		when(cliente.getSueldoMensual()).thenReturn(30000.0);
		assertTrue(credito.cumpleCriterioDeMonto());
	}
	
	@Test
	void testNoCumpleCriterioDeMonto() {
		when(cliente.getSueldoMensual()).thenReturn(120.0);
		assertFalse(credito.cumpleCriterioDeMonto());
	}
}
