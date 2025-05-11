package ar.edu.unq.poo2.tp5;

public class Impuesto extends Factura {
	
	private double tasa;
	
	public double getTasa() {
		return tasa;
	}

	public Impuesto(int tasa, Agencia agencia) {
		super(agencia);
		this.tasa = tasa;
	}
	
	public double getMonto() {
		return this.tasa;
	}
}
