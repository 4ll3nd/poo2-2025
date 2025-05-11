package ar.edu.unq.poo2.tp5;

public class Cooperativo extends Producto {

	public Cooperativo(String nombre, double precio, Inventario inventario) {
		super(nombre, precio, inventario);
	}
	
	public double getPrecio() {
		return super.getPrecio() - this.descuentoPorIva();
	}

	private double descuentoPorIva() {
		return super.getPrecio() * 0.10;
	}
	
}
