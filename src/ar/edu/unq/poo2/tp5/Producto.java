package ar.edu.unq.poo2.tp5;

public abstract class Producto {
	private String nombre;
	protected double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
}
