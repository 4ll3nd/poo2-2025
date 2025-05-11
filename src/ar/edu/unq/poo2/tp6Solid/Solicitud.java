package ar.edu.unq.poo2.tp6Solid;

public abstract class Solicitud {
	
	private Cliente cliente;
	private double monto;
	private int cuotas;

	
	public Solicitud(Cliente cliente, double monto, int cuotas) {
		super();
		this.cliente = cliente;
		this.monto = monto;
		this.cuotas = cuotas;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public int getCantDeCuotas() {
		return cuotas;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public double montoMensual() {
		return monto / this.getCantDeCuotas();
	}
	
	public abstract boolean esAceptable();
	
	public abstract boolean cumpleCriterioDeMonto();

	public abstract boolean cumpleCriterioDeSueldo();
	
}
