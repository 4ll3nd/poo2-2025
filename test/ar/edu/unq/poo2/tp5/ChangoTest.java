package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
class ChangoTest {
	
	private Chango chango;
	private Pagable unPagable;
	
	@BeforeEach
	void setUp() throws Exception {
		chango = new Chango();
		unPagable = mock(Pagable.class);
	}

	@Test
	void testAgregarUnPagableAlChango() {
		chango.agregarPagable(unPagable);
		
		assertEquals(1, chango.getCantPagables());
	}
	
	@Test
	void testQuitarPagable() {
		chango.agregarPagable(unPagable);

		
		chango.quitarPagable(unPagable);
		
		assertEquals(0, chango.getCantPagables());
	}

}
