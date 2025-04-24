package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CajaTest {
	Chango chango;
	Mercado mercado;
	Tradicional harina;
	Cooperativo arroz;

	@BeforeEach
	void setUp() throws Exception {
		chango = mock(Chango.class);
		mercado = mock(Mercado.class);
		harina = mock(Tradicional.class);
		arroz = mock(Cooperativo.class);
	}

	@Test
	void testRegistrarProductos() {
		Caja caja = new Caja(mercado);
		when(harina.getPrecio()).thenReturn(300.0);
		when(arroz.getPrecio()).thenReturn(90.0);
		when(chango.getProductos()).thenReturn(Arrays.asList(harina, arroz));
		
		assertEquals(390.0, caja.registrarProductos(chango));
		verify(mercado).decrementarStock(harina);
		verify(mercado).decrementarStock(arroz);
	}
	
	@Test
	void testRegistrarElPagoDeUnaFactura() {
		Caja caja = new Caja(mercado);
		Factura impuesto = new Impuesto(300);
		Agencia agencia = mock(Agencia.class);
		caja.setAgencia(agencia);
		
		caja.registrarPago(impuesto);
		
		verify(agencia).registrarPago(impuesto);
	}
}
