package ar.edu.unq.poo2.introJava;

import java.util.ArrayList;
import java.util.List;

public class MultiOperador {
	private List<Integer> numeros = new ArrayList<Integer>();
	
	public MultiOperador(List<Integer> numeros) {
		this.numeros = numeros;
	}
	
	public List<Integer> getNumeros() {
		return numeros;
	}
	
	public Integer sumarTodos() {
		int suma = 0;
		for(Integer x: this.getNumeros()) {
			suma += x;
		}
		return suma;
	}
	
	public Integer restarTodos() {
		int resta = this.getNumeros().get(0);
		List<Integer> listaSinElPrimero = this.getNumeros().subList(1, this.getNumeros().size());
		for(Integer x : listaSinElPrimero) {
			resta -= x;
		}
		return resta;
	}
	
	public Integer multiplicarTodos() {
		int producto = 1;
		for(Integer x: this.getNumeros()) {
			producto *= x;
		}
		return producto;
	}
}
