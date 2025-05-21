package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.DosFichas;
import ar.edu.poo2.tpCompositeState.MaquinaDeJuegos;
import ar.edu.poo2.tpCompositeState.UnaFicha;

class MaquinaDeJuegosTest {
	UnaFicha unaFicha;
	DosFichas dosFichas;
	MaquinaDeJuegos maquina;
	@BeforeEach
	void setUp() throws Exception {
		unaFicha = mock(UnaFicha.class);
		dosFichas = mock(DosFichas.class);
		maquina = new MaquinaDeJuegos();
	}

	@Test
	void testMaquinaEnReposoSeIniciaYSaleUnCartelParaIngresarFichas() {
		assertEquals("Ingrese Fichas", maquina.iniciar());
	}
	
	@Test
	void testMaquinaRecibeUnaFichaYIniciaElJuegoParaUnJugador() {
		when(unaFicha.iniciar()).thenReturn("Modo un jugador");
		
		assertEquals("Modo un jugador", maquina.iniciar(unaFicha));
		verify(unaFicha).iniciar();
	}
	
	@Test
	void testMaquinaRecibeDosFichaYIniciaElJuegoParaDosJugadores() {
		when(dosFichas.iniciar()).thenReturn("Modo dos jugadores");
		
		assertEquals("Modo dos jugadores", maquina.iniciar(dosFichas));
		verify(dosFichas).iniciar();
	}
	
	@Test
	void testMaquinaTerminaElJuego() {
		maquina.iniciar(unaFicha);
		
		assertEquals("Se termino el juego", maquina.terminar());
	}
}
