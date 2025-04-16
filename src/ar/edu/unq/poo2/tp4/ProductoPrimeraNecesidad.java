package ar.edu.unq.poo2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	private double descuento;

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double
			descuento) {
		super(nombre, precio, esPrecioCuidado);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}
	/***
	 * El mensaje getPrecioConDescuento utiliza getPrecio del mismo objeto(heredado
	 * de la clase Producto) y le aplica el descuento impuesto al momento de crearlo.
	 * */
	public double getPrecioConDescuento() {
		return this.getPrecio() * this.getDescuento();
	}
	
}
