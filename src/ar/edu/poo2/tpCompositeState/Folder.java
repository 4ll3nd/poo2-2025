package ar.edu.poo2.tpCompositeState;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Folder implements FyleSystem {
	private String name;
	private LocalDate dateOfCreation;
	private List<FyleSystem> archives;
	
	public Folder(String name, LocalDate date) {
		this.name = name;
		this.dateOfCreation = date;
		archives = new ArrayList<FyleSystem>();
	}

	@Override
	public int totalSize() {
		return this.getChilds().stream().mapToInt(a->a.totalSize()).sum();
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub

	}
	/*
	@Override
	public Archive lastModified() {
		FyleSystem mostRecent = this.getChilds().getFirst();
		for(FyleSystem file: this.getChilds()) {
			if(file. NO TENGO UN MENSAJE PARA OBTENER LA FECHA)
		}
	}
	si añado un mensaje para saber la fecha a la interfaz, solo podria comparar
	entre fechas de carpetas y de archivos, y ambos casos la fecha simboliza algo distinto
	archivo: ultima modificacion.
	carpeta: fecha en la que se creo.
	Entonces no estaria obteniendo el mas antiguo(archivo).
	Como soluciono esto? esta bien que pueda diferenciar dentro del composite
	las carpetas de los archivos?
	*/
	@Override
	public Archive oldestModified() {
		return null;
	}

	@Override
	public void add(FyleSystem f) {
		this.archives.add(f);
	}

	@Override
	public void remove(FyleSystem f) {
		this.archives.remove(f);
	}

	@Override
	public List<FyleSystem> getChilds() {
		return archives;
	}

}
