package ar.edu.unq.poo2.introJava;

public class Cuadrado {
	private int lado;
	private Point ubicacion;
	
	public Cuadrado(int lado, Point ubicacion) {
		super();
		this.lado = lado;
		this.ubicacion = ubicacion;
	}
	
	public Point getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Point ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public int area() {
		return this.getLado() * this.getLado();
	}
	
	public int perimetro() {
		return this.getLado() * 4;
	}
	
	public int getLado() {
		return lado;
	}
}
