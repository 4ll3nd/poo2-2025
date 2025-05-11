package ar.edu.unq.poo2.tp5;

public abstract class Factura implements Pagable {
	
	private Agencia agencia;
	
	public Factura(Agencia agencia) {
		this.agencia = agencia;
	}

	public abstract double getMonto();

	public Agencia getAgencia() {
		return agencia;
	}
	
	@Override
	public double procesar() {
		this.getAgencia().registrarPago(this);
		return this.getMonto();
	}
	
}
