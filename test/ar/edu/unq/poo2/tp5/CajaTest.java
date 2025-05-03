package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	private List<Pagable> pagables;
	private Chango chango;
	private Caja caja;
	private Pagable arroz;
	private Pagable servicio;
	@BeforeEach
	void setUp() throws Exception {
		arroz = mock(Pagable.class);
		servicio = mock(Pagable.class);
		pagables = Arrays.asList(arroz, servicio);
		chango = mock(Chango.class);
		caja = new Caja();
	}

	@Test
	void testProcesarPagables() {
		when(chango.getPagables()).thenReturn(pagables);
		when(arroz.procesar()).thenReturn(300.0);
		when(servicio.procesar()).thenReturn(200.0);
		caja.procesar(chango);
		
		verify(arroz).procesar();	
		verify(servicio).procesar();
		assertEquals(500.0, caja.procesar(chango));
	}
}
