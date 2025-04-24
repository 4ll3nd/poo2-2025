package ar.edu.unq.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
	private List<InventarioTest> inventarios = new ArrayList<InventarioTest>();
	
	public Mercado(List<InventarioTest> inventarios) {
		super();
		this.inventarios = inventarios;
	}

	public List<InventarioTest> getInventarios() {
		return inventarios;
	}
	
	public void añadirInventario(InventarioTest x) {
		this.getInventarios().add(x);
	}
	
	/**PROPOSITO: aumentar segun el numero dado el inventario del producto dado.
	 * DETALLES: el metodo es simila a decrementarStock, solo que al inventario obtenido
	 * se le manda el mensaje aumentar().
	 * PRECONDICION: hay un inventario del producto dado
	 * **/
	public void añadirStock(Producto x, int y) {
		this.getInventarios().stream().filter(i->i.getNombre().equalsIgnoreCase(x.getNombre())).
		toList().getFirst().aumentar(y);
	}
	
	/**PROPOSITO: Decrementar en uno la cantidad de stock de un invetario del producto dado
	 * DETALLES: se convierte la lista de inventarios a un stream, luego se filtran 
	 * los inventario en base al nombre del producto dado, para volverlo de nuevo una lista
	 * y obtener el inventario que tiene ese nombre.
	 *  * PRECONDICION: hay un inventario del producto dado
	 * */
	public void decrementarStock(Producto unProducto) {
		this.getInventarios().stream().filter(i->i.getNombre().equals(unProducto.getNombre())).
		toList().getFirst().decrementar();
	}
}
