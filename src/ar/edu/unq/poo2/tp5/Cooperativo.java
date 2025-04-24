package ar.edu.unq.poo2.tp5;

public class Cooperativo extends Producto {

	@Override
	public double getPrecio() {
		return super.getPrecio() - super.getPrecio() * 0.10;
	}

	public Cooperativo(String nombre, double precio) {
		super(nombre, precio);
	}
}
