package ar.edu.unq.poo2.introJava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiOperadorTest {
	MultiOperador x;
	@BeforeEach
	void setUp(){
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		x = new MultiOperador(numeros);
	}

	@Test
	void testSumarTodos() {
		assertEquals(10, x.sumarTodos());
	}
	
	@Test
	void testRestarTodos() {
		assertEquals(-8, x.restarTodos());
	}
	
	@Test
	void testMultiplicarTodos() {
		assertEquals(24, x.multiplicarTodos());
	}
}
