package ar.edu.unq.poo2.CompositeState;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Estado;
import ar.edu.poo2.tpCompositeState.Reproduccion;
import ar.edu.poo2.tpCompositeState.Reproductor;
import ar.edu.poo2.tpCompositeState.Seleccion;
import ar.edu.poo2.tpCompositeState.Song;

class SeleccionTest {
	Reproductor reproductor;
	Song one;
	Estado seleccion;
	Estado reproduccion;
	@BeforeEach
	void setUp() throws Exception {
		reproductor = mock(Reproductor.class);
		one = mock(Song.class);
		reproduccion = mock(Reproduccion.class);
		seleccion = new Seleccion();
	}

	@Test
	void testElEstadoSeleccionReproduceUnaCancion() {
		seleccion.play(reproductor, one);
		when(reproductor.getEstado()).thenReturn(reproduccion);
		
		verify(one).play();
		assertEquals()
	}
	
	/**Se testea el lanzamiento de un error.
	 * */
	@Test
	void testElEstadoSeleccionLanzaUnErrorAlIntentarPausarUnaCancionYElEstadoNoCambia() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			 seleccion.pause(reproductor, one);
		 });
		assertEquals("No se puede pausar, si no se reproduce", ex.getMessage());
	}
	
	@Test
	void testElEstadoSeleccionLanzaUnErrorAlIntentarPararUnaCancionYElEstadoNoCambia() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			seleccion.stop(reproductor, one);
		});
		assertEquals("No se puede parar, si no se reproduce", ex.getMessage());
	}
}
