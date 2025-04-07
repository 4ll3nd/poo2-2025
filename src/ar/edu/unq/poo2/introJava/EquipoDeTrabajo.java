package ar.edu.unq.poo2.introJava;

import java.util.Set;

public class EquipoDeTrabajo {
	private String nombre;
	private Set<Persona> integrantes;
	public EquipoDeTrabajo(String nombre, Set<Persona> integrantes) {
		super();
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Persona> getIntegrantes() {
		return integrantes;
	}
	
	public void añadirIntegrante(Persona p) {
		this.getIntegrantes().add(p);
	}
	
	public Long promedioDeEdad() {
		int sumaDeEdades = 0;
		for(Persona p : this.getIntegrantes()) {
			sumaDeEdades += p.getEdad();
		}
		return (long) (sumaDeEdades / this.cantidadDeIntegrantes());
	}
	
	public int cantidadDeIntegrantes() {
		return this.getIntegrantes().size();
	}
	
	//PRECONDICION: la persona debe estar en el equipo.
	public void quitarIntegrante(Persona p) {
		this.getIntegrantes().remove(p);
	}
	
}
