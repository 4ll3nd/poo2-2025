package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.Arrays;
class MercadoTest {
	Mercado mercado;
	InventarioTest harina;
	InventarioTest arroz;
	InventarioTest vino;
	@BeforeEach
	void setUp() throws Exception {
		harina = mock(InventarioTest.class);
		arroz = mock(InventarioTest.class);
		vino = mock(InventarioTest.class);
		mercado = new Mercado(Arrays.asList(harina, arroz, vino));
	}

	@Test
	void testDecrementarInventarioDeHarina() {
		Producto harinaProducto = mock(Producto.class);
		when(harina.getNombre()).thenReturn("harina");
		when(arroz.getNombre()).thenReturn("arroz");
		when(vino.getNombre()).thenReturn("vino");
		when(harinaProducto.getNombre()).thenReturn("harina");
		
		mercado.decrementarStock(harinaProducto);
		
		verify(harina).decrementar();
	}
}
