package ar.edu.unq.poo2.introJava;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	public void moverPuntoA(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void sumarA(Point a) {
		this.x = this.getX() + a.getX();
		this.y = this.getY() + a.getY();
	}
	
}
