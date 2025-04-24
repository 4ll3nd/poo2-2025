package ar.edu.unq.poo2.tp5;

public class Inventario {
	private String nombre; 
	private int cantidad;
	
	public int getCantidad() {
		return cantidad;
	}

	public void decrementar() {
		this.cantidad--;
	}

	public Inventario(String nombre, int cantidad) {
		super();
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void aumentar(int n) {
		this.cantidad += n;
	}

}
