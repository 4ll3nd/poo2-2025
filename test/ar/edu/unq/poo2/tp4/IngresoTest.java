package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.Ingreso;

class IngresoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMontoImponible() {
		Ingreso x= new Ingreso(LocalDate.of(2002, 3, 25), "liquidacion", 300.0);
		assertEquals(300.00,x.montoImponible());	
	}

}
