package ar.edu.unq.poo2.tp5;

public class Servicio extends Factura {

	private double costoPorUnidad;
	private int unidades;

	public Servicio(double costoPorUnidad, int unidades, Agencia agencia) {
		super(agencia);
		this.costoPorUnidad = costoPorUnidad;
		this.unidades = unidades;
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public int getUnidades() {
		return unidades;
	}

	@Override
	public double getMonto() {
		return this.getCostoPorUnidad() * this.getUnidades();
	}

}
