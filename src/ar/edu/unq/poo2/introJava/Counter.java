package ar.edu.unq.poo2.introJava;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public List<Integer> getNumeros() {
		return numeros;
	}

	public Counter(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public Long contarPares() {
		return this.getNumeros().stream().filter(n -> n%2 == 0).count();
	}
	
	public Long contarImpares() {
		return this.getNumeros().stream().filter(n -> n%2 != 0).count();
	}
	
	public Integer numeroConMayorCantidadDeDigitosPares(List<Integer> numeros) {
		int pares = 0;
		for(Integer x : numeros) {
			while(x % 2 != 1) {
				pares++;
			}
		}
	}
	
}
