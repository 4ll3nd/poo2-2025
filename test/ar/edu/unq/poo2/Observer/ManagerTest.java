package ar.edu.unq.poo2.Observer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerTest {
	Manager manager;
	Observer observer1;
	Observer observer2;
	Partido partido;
	List<String> contrincantes;
	@BeforeEach
	void setUp() throws Exception {
		contrincantes = Arrays.asList("cobi", "don");
		manager = new Manager("3-2", "Futbol", contrincantes);
		observer1 = mock(Observer.class);
		observer2 = mock(Observer.class);
		partido = mock(Partido.class);
	}

	@Test
	void testInicializacion() {
		assertEquals("3-2", manager.getResultado());
		assertEquals("Futbol", manager.getDeporte());
		assertEquals(2, manager.getContrincantes().size());
	}
	
	@Test
	void testSuscribir() {
		manager.suscribir(observer1);
		manager.suscribir(observer2);
		
		assertEquals(2, manager.getObservers().size());
	}
	
	@Test
	void testDesuscribir() {
		manager.suscribir(observer1);
		manager.suscribir(observer2);
		
		manager.desSuscribir(observer1);
		
		assertEquals(1, manager.getObservers().size());
	}
	
	@Test
	void testPartidoEsDeInteresYSeLesNotificaALosObservers() {
		when(partido.getContrincantes()).thenReturn(contrincantes);
		when(partido.getDeporte()).thenReturn("Futbol");
		when(partido.getResultado()).thenReturn("3-2");
		manager.suscribir(observer1);
		manager.suscribir(observer2);
		
		manager.notificarSiEsDeInteres(partido);
		
		verify(observer1).update(partido);
		verify(observer2).update(partido);
	}
	
	@Test
	void testPartidoNoEsDeInteresYNoSeLesNotificaALosObservers() {
		when(partido.getContrincantes()).thenReturn(Arrays.asList("don","juan"));
		when(partido.getDeporte()).thenReturn("Hokey");
		when(partido.getResultado()).thenReturn("4-5");
		manager.suscribir(observer1);
		manager.suscribir(observer2);
		
		manager.notificarSiEsDeInteres(partido);
		
		verifyNoInteractions(observer1);
		verifyNoInteractions(observer2);
	}
}
