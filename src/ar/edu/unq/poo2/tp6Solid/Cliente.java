package ar.edu.unq.poo2.tp6Solid;

public class Cliente {

	private String nombre;
	private int edad;
	private String direccion;
	private String apellido;
	private double sueldoMensual;
	
	public Cliente(String nombre, int edad, String direccion, 
			String apellido, double sueldoMensual) {
		this.nombre = nombre; 
		this.edad = edad;
		this.direccion = direccion;
		this.apellido = apellido;
		this.sueldoMensual = sueldoMensual;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getApellido() {
		return apellido;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public double getSueldoNetoAnual() {
		return this.getSueldoMensual() * 12;
	}
}
