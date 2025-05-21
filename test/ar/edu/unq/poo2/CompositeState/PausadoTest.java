package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Pausado;
import ar.edu.poo2.tpCompositeState.Reproductor;
import ar.edu.poo2.tpCompositeState.Song;

class PausadoTest {
	Song one;
	Reproductor reproductor;
	Pausado pausado;
	@BeforeEach
	void setUp() throws Exception {
		one = mock(Song.class);
		reproductor = mock(Reproductor.class);
		pausado = new Pausado();
	}

	@Test
	void testEstadoPausadoReproduceUnaCancion() {
		pausado.play(reproductor, one);
		
		verify(one).play();
	}
	
	@Test
	void testEstadoPausadoParaUnaCancion() {
		pausado.stop(reproductor, one);
		
		verify(one).stop();
	}
	
	/**OBSERVACION: una cualidad del boton pausa es que 
	 * si el reproductor ya estaba pausado y se vuelve a presionar el boton
	 * este reproduce la cancion
	 * */
	@Test
	void testEstadoPausadoPausaUnaCancion() {
		pausado.pause(reproductor, one);
		
		verify(one).play();
	}
}
