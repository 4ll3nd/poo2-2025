package ar.edu.unq.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.ProductoPrimeraNecesidad;

class ProductoPrimeraNecesidadTest {

private ProductoPrimeraNecesidad leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 0.5);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(8.0, leche.getPrecio());
	}

}
