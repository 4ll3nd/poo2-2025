package ar.edu.unq.poo2.introJava;

public class Rectangulo {
	private Point ubicacion;
	private int alto;
	private int ancho;
	
	public Rectangulo(Point ubicacion, int alto, int ancho) {
		super();
		this.ubicacion = ubicacion;
		this.alto = alto;
		this.ancho = ancho;
	}

	public Point getUbicacion() {
		return ubicacion;
	}

	public int getAncho() {
		return ancho;
	}
	
	private int getAlto() {
		return alto;
	}
	
	public int area() {
		return this.getAncho() * this.alto;
	}
	
	public int perimetro() {
		return 2 * (this.getAncho() + this.getAlto());
	}
	
	public boolean esVertical() {
		return this.getAlto() > this.getAncho();
	}
	
	public boolean esHorizontal() {
		return this.getAncho() > this.getAlto();
	}
 }
