package ar.edu.unq.poo2.CompositeState;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Reproduccion;
import ar.edu.poo2.tpCompositeState.Reproductor;
import ar.edu.poo2.tpCompositeState.Song;

class ReproduccionTest {
	Song one;
	Reproductor reproductor;
	Reproduccion reproduccion;
	@BeforeEach
	void setUp() throws Exception {
		one = mock(Song.class);
		reproductor = mock(Reproductor.class);
		reproduccion = new Reproduccion();
	}

	@Test
	void testEstadoReproduccionPausaUnaCancion() {
		reproduccion.pause(reproductor, one);
		
		verify(one).pause();
	}

	@Test
	void testEstadoReproduccionParaUnaCancion() {
		reproduccion.stop(reproductor, one);
		
		verify(one).stop();
	}
	
	@Test
	void testEstadoReproduccionIntentaReproducirUnaCancionYLanzaUnErrorYElEstadoNoCambia() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			reproduccion.play(reproductor, one);
		});
		assertEquals("no se puede reproducir algo que se esta reproduciendo", ex.getMessage());
	}
}
