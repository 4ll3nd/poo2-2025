package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Parcela;
import ar.edu.poo2.tpCompositeState.ParcelaPura;

class ParcelaPuraTest {
	Parcela parcela;
	@BeforeEach
	void setUp() throws Exception {
		parcela = new ParcelaPura(3000.0);
	}

	@Test
	void testGananciaDeParcela() {
		assertEquals(3000.0, parcela.ganancias());
	}
}
