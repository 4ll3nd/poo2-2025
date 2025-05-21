package ar.edu.poo2.tpCompositeState;

import java.time.LocalDate;
import java.util.List;

public class Archive implements FyleSystem {
	
	private int weight;
	private String name;
	private LocalDate date;

	public Archive(int weight, String name, LocalDate date) {
		this.weight = weight;
		this.name = name;
		this.date = date;
	}

	@Override
	public int totalSize() {
		return this.weight;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub

	}

	@Override
	public Archive lastModified() {
		throw new RuntimeException("El archivo no tiene registro de modificaciones");
	}

	@Override
	public Archive oldestModified() {
		throw new RuntimeException("El archivo no tiene registro de modificaciones");
	}

	@Override
	public void add(FyleSystem f) {
		throw new RuntimeException("El archivo no almacena otros archivos");
	}

	@Override
	public void remove(FyleSystem f) {
		throw new RuntimeException("El archivo no almacena otros archivos");

	}

	@Override
	public List<FyleSystem> getChilds() {
		throw new RuntimeException("un archivo no contiene archivos");
	}

	public String getName() {
		return this.name;
	}

	public LocalDate getLastModifiedDate() {
		return date;
	}

}
