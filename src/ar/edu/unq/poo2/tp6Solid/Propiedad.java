package ar.edu.unq.poo2.tp6Solid;

public class Propiedad {
	private double valorFiscal;
	private String direccion;
	private String descripcion;
	
	public Propiedad(double valorFiscal, String direccion, String descripcion) {
		super();
		this.valorFiscal = valorFiscal;
		this.direccion = direccion;
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

}
