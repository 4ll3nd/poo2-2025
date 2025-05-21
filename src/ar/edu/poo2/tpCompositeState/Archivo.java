package ar.edu.poo2.tpCompositeState;

import java.time.LocalDate;

public class Archivo implements FileSystem {
	private LocalDate ultimaModificacion;
	private String nombre;
	private int espacioOcupado;
	public Archivo(LocalDate ultimaModificacion, String nombre, int espacioOcupado) {
		super();
		this.ultimaModificacion = ultimaModificacion;
		this.nombre = nombre;
		this.espacioOcupado = espacioOcupado;
	}

	public LocalDate getUltimaModificacion() {
		return ultimaModificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEspacioOcupado() {
		return espacioOcupado;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub

	}

	@Override
	public FileSystem lastModified() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FileSystem oldestElement() {
		// TODO Auto-generated method stub
		return null;
	}

}
