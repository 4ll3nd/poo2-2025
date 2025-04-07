package ar.edu.unq.poo2.introJava;

import java.util.HashSet;
import java.util.Set;

public class PruebaEquipoDeTrabajo {

	public static void main(String[] args) {
		Persona alex = new Persona("Alex", 22, "Ferragut");
		Persona sofia = new Persona("Alex", 25, "d");
		Persona gaston = new Persona("Alex", 23, "b");
		Persona valeria = new Persona("Alex", 24, "c");
		Persona joana = new Persona("Alex", 29, "d");
		
		Set<Persona> x = new HashSet<Persona>();
		x.add(alex);
		x.add(sofia);
		x.add(gaston);
		x.add(valeria);
		x.add(joana);
		
		EquipoDeTrabajo equipo = new EquipoDeTrabajo("equipo", x);
		
		System.out.println("El promedio de edad es: " + equipo.promedioDeEdad());
		System.out.print("La cantidad de Mienbros es: " + equipo.cantidadDeIntegrantes());
	}

}
