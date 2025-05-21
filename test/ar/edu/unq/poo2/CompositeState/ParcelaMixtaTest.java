package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Parcela;
import ar.edu.poo2.tpCompositeState.ParcelaMixta;

class ParcelaMixtaTest {
	Parcela arroz;
	Parcela trigo;
	Parcela cebada;
	Parcela papas;
	Parcela mixta;
	Parcela otraMixta;
	@BeforeEach
	void setUp() throws Exception {
		arroz = mock(Parcela.class);
		cebada = mock(Parcela.class);
		trigo = mock(Parcela.class);
		papas = mock(Parcela.class);
		mixta = new ParcelaMixta();
		otraMixta = new ParcelaMixta();
	}

	@Test
	void testGetChild() {
		mixta.add(arroz);
		assertEquals(arroz, mixta.getChild(0));
	}
	
	@Test
	void testGananciaDeParcela() {
		when(arroz.ganancias()).thenReturn(300.0);
		when(cebada.ganancias()).thenReturn(300.0);
		when(trigo.ganancias()).thenReturn(300.0);
		when(papas.ganancias()).thenReturn(1000.0);
		mixta.add(arroz);
		mixta.add(cebada);
		mixta.add(trigo);
		otraMixta.add(papas);
		mixta.add(otraMixta);
		
		assertEquals(1900.0, mixta.ganancias());
	}
}
