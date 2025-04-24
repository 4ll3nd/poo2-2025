package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.IngresoPorHoraExtra;

class IngresoPorHoraExtraTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMontoImponible() {
		IngresoPorHoraExtra x = new IngresoPorHoraExtra(LocalDate.of(2002, 3, 24), "hora", 3, 
				300.0);
		
		assertEquals(0, x.montoImponible());
	}

}
