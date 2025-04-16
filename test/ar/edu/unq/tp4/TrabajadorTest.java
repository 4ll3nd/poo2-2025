package ar.edu.unq.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp4.Ingreso;
import ar.edu.unq.poo2.tp4.IngresoPorHoraExtra;
import ar.edu.unq.poo2.tp4.Trabajador;
import unq.poo2.practicas.EmpresaLiquida.Recibo;

class TrabajadorTest {
	private Ingreso uno;
	private Ingreso dos;
	private Trabajador alex;
	
	@BeforeEach
	void setUp() throws Exception {
		dos = new Ingreso(LocalDate.of(2002, 3, 24), "recibo", 100000);
		uno = new IngresoPorHoraExtra(LocalDate.of(2002, 5, 23), "hora", 10, 20000);
		alex = new Trabajador();
	}

	@Test
	void testTotalRecibido() {
		alex.agregarIngreso(uno);
		alex.agregarIngreso(dos);
		assertEquals(120000, alex.getTotalPercibido());
	}
	
	@Test
	void testMontoImponible() {
		alex.agregarIngreso(uno);
		alex.agregarIngreso(dos);
		assertEquals(100000, alex.getMontoImponible());
	}
	
	@Test
	void testImpuestoAPgar() {
		alex.agregarIngreso(uno);
		alex.agregarIngreso(dos);
		assertEquals(2000, alex.getImpuestoAPagar());
	}

}
