package ar.edu.unq.poo2.tp6Solid;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClienteTest {
	Cliente x;
	@BeforeEach
	void setUp() throws Exception {
		x = new Cliente("alex", 22, "abc", "ferragut", 81.000);
	}

	@Test
	void testInicializacion() {
		assertEquals("alex", x.getNombre());
		assertEquals(22, x.getEdad());
		assertEquals("abc", x.getDireccion());
		assertEquals("ferragut", x.getApellido());
		assertEquals(81.000, x.getSueldoMensual());
		assertEquals(972.000, x.getSueldoNetoAnual());
	}

}
