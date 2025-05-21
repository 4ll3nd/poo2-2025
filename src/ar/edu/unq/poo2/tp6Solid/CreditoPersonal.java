package ar.edu.unq.poo2.tp6Solid;

public class CreditoPersonal extends Solicitud {

	public CreditoPersonal(Cliente cliente, double monto, int cuotas) {
		super(cliente, monto, cuotas);
	}
	
	@Override
	public boolean esAceptable() {
		// TODO Auto-generated method stub
		return this.cumpleCriterioDeMonto() && this.cumpleCriterioDeSueldo();
	}

	@Override
	public boolean cumpleCriterioDeMonto() {
		return super.montoMensual() < 
		setentaPorcientoDeSueldoMensualDeCliente();
	}

	private double setentaPorcientoDeSueldoMensualDeCliente() {
		return super.getCliente().getSueldoMensual() * 0.70;
	}

	@Override
	public boolean cumpleCriterioDeSueldo() {
		return super.getCliente().getSueldoNetoAnual() >= 15.000;
	}

}
