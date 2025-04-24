package ar.edu.unq.poo2.tp5;

public class Servicio implements Factura{
	private double costoPorUnidad;
	private int cantidadDeUnidadesConsumidas;
	
	@Override
	public double monto() {
		return this.getCostoPorUnidad() * this.cantidadDeUnidadesConsumidas;
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public int getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}

	public Servicio(double costoPorUnidad, int cantidadDeUnidadesConsumidas) {
		super();
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
}
