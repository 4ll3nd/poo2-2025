package ar.edu.unq.poo2.introJava;

public class Persona {
	private String nombre;
	private int edad;
	private String apellido;
	public Persona(String nombre, int edad, String apellido) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getApellido() {
		return apellido;
	}
}
