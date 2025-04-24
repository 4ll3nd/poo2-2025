package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChangoTest {
	Producto arroz; 
	Producto harina;
	Producto arroz1;
	Chango chango = new Chango();
	@BeforeEach
	void setUp() throws Exception {
		arroz = new Tradicional("Arroz", 500.0);
		arroz1 = new Tradicional("Arroz", 500.0);
		harina = new Cooperativo("Harina", 1000.0);
	}

	@Test
	void testAñadirProductosAlChango() {
		chango.añadirProducto(arroz);
		chango.añadirProducto(arroz);
		
		assertEquals(2, chango.cantDeProductos());
	}
	
	@Test
	void testQuitarProductosAlChango() {
		chango.añadirProducto(arroz);
		chango.quitarProducto(arroz);
		
		assertEquals(0, chango.cantDeProductos());
	}
}
