package ar.edu.unq.poo2.tp4;

public class Producto {
	
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		this.nombre = nombre;
		this.precio = precio; 
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = false;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	public void aumentarPrecio(double cantidadAAumentar) {
		this.precio += cantidadAAumentar;
	}
}
