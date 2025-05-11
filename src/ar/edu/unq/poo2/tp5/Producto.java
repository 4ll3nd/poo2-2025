package ar.edu.unq.poo2.tp5;

public class Producto implements Pagable{
	
	private String nombre; 
	private double precio;
	private Inventario inventario;
	
	public Producto(String nombre, double precio, Inventario inventario) {
		this.nombre = nombre;
		this.precio = precio;
		this.inventario = inventario;
	}
	
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public Inventario getInventario() {
		return inventario;
	}

	@Override
	public double procesar() {
		this.getInventario().decrementar();
		return this.getPrecio();
	}
}
