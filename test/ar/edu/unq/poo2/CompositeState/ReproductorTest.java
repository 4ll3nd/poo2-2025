package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Reproductor;
import ar.edu.poo2.tpCompositeState.Song;

class ReproductorTest {
	Reproductor reproductor;
	Song one;
	@BeforeEach
	void setUp() throws Exception {
		reproductor = new Reproductor();
		one = mock(Song.class);
	}

	@Test
	void testPlayCuandoElReprodutorEstaEnSeleccion() {
		reproductor.play(one);
		
		verify(one).play();
	}
	
	@Test
	void testSePausaUnaCancionQueSeEstabaReproduciendo() {
		reproductor.play(one);
		
		reproductor.pause(one);
		
		verify(one).pause();
	}
	
	@Test
	void testSeReproduceUnaCancionCuandoLaCancionEstabaPausada() {
		reproductor.play(one);
		
		reproductor.pause(one);
		reproductor.play(one);
		
		verify(one, atLeast(2)).play();
	}
	
	@Test
	void testSeParaUnaCancionQueSeReproducia() {
		reproductor.play(one);
		
		reproductor.stop(one);
		
		verify(one).stop();
	}
	
	@Test
	void testSeParaUnaCancionQueEstaPausada() {
		reproductor.play(one);
		reproductor.pause(one);
		
		reproductor.stop(one);
		
		verify(one).stop();
	}
}
