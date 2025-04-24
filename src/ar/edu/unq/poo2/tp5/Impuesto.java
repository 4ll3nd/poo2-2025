package ar.edu.unq.poo2.tp5;

public class Impuesto implements Factura{
	private int tasa;

	@Override
	public double monto() {
		return this.getTasa();
	}

	public int getTasa() {
		return tasa;
	}

	public Impuesto(int tasa) {
		super();
		this.tasa = tasa;
	}

}
