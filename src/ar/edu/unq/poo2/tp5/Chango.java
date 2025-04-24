package ar.edu.unq.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Chango {
	private List<Producto> productos = new ArrayList<Producto>();
	
	public void añadirProducto(Producto producto) {
		productos.add(producto);
	}

	public int cantDeProductos() {
		return this.getProductos().size();
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void quitarProducto(Producto producto) {
		this.getProductos().remove(producto);
	}
}
