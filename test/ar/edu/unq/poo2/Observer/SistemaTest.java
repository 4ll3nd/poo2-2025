package ar.edu.unq.poo2.Observer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaTest {
	Partido partido;
	Manager otroManager;
	Sistema sistema;
	Manager manager;
	@BeforeEach
	void setUp() throws Exception {
		partido = mock(Partido.class);
		sistema = new Sistema();
		manager = mock(Manager.class);
		otroManager = mock(Manager.class);
	}

	@Test
	void testAgregarResultado() {
		sistema.addResultado(partido);
		
		assertEquals(1, sistema.getResultados().size());
	}
	
	@Test
	void testSuscribeManager() {
		sistema.suscribe(manager);
		
		assertEquals(1, sistema.getManagers().size());
	}
	
	@Test
	void testUnSuscribe() {
		sistema.suscribe(manager);
		sistema.unSuscribe(manager);
		
		assertEquals(0, sistema.getManagers().size());
	}
	
	@Test
	void testNotificarManagers() {
		sistema.suscribe(manager);
		sistema.suscribe(otroManager);
		sistema.notificar(partido);
		
		verify(manager).notificarSiEsDeInteres(partido);
		verify(otroManager).notificarSiEsDeInteres(partido);
	}
}
