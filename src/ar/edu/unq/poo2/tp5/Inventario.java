package ar.edu.unq.poo2.tp5;

public class Inventario {
	
	private String nombre;
	private int cantidad;
	
	public Inventario(String nombre, int cantidad) {
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void decrementar() {
		this.cantidad--;
	}

	public void aumentar(int i) {
		this.cantidad += i;
		
	}

}
