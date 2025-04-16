package ar.edu.unq.poo2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> catalogo = new ArrayList<Producto>();

	public Supermercado(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void agregarProducto(Producto arroz) {
		this.getCatalogo().add(arroz);
	}

	public int getCantidadDeProductos() {
		return this.getCatalogo().size();
	}

	public List<Producto> getCatalogo() {
		return catalogo;
	}

	public Double getPrecioTotal() {
		return this.getCatalogo().stream().mapToDouble(p->p.getPrecio()).sum();
	}
}
