package ar.edu.unq.poo2.introJava;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	private Counter counter;
	
	@BeforeEach
	void setUp() {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(3);
		numeros.add(5);
		numeros.add(6);
		numeros.add(8);
		counter = new Counter(numeros);
	}

	@Test
	void testContarPares() {
		assertEquals(2, counter.contarPares());
	}
	
	@Test
	void testContarImpares() {
		assertEquals(2, counter.contarImpares());
	}

}
