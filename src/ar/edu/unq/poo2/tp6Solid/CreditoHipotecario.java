package ar.edu.unq.poo2.tp6Solid;

public class CreditoHipotecario extends Solicitud {
	Propiedad propiedad;
	public CreditoHipotecario(Cliente cliente, double monto, int cuotas, Propiedad pro) {
		super(cliente, monto, cuotas);
		propiedad = pro;
	}

	public Propiedad getPropiedad() {
		return propiedad;
	}

	@Override
	public boolean esAceptable() {
		// TODO Auto-generated method stub
		return this.cumpleCriterioDeMonto() && this.cumpleCriterioDeSueldo();
	}

	@Override
	public boolean cumpleCriterioDeMonto() {
		return this.getMonto() < this.getPropiedad().getValorFiscal() * 0.70;
	}

	@Override
	public boolean cumpleCriterioDeSueldo() {
		return this.montoMensual() < this.getCliente().getSueldoMensual() * 0.50;
	}

}
