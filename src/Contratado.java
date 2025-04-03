package unq.poo2.practicas.EmpresaLiquida;

public class Contratado extends Empleado {
	
	public Contratado(int nroDeContrato, String medioDePago) {
		this.nroDeContrato = nroDeContrato;
		this.medioDePago = medioDePago;
	}
	
	private int nroDeContrato;
	private String medioDePago;
	
	public int nroDeContrato() {
		return nroDeContrato;
	}
	
	public String medioDePago() {
		return medioDePago;
	}
	
	@Override
	public int retenciones() {
		return this.gastosAdministrativos();
	}

	private int gastosAdministrativos() {
		return 50;
	}

	@Override
	public int obraSocial() {
		return 0;
	}

	@Override
	public int extras() {
		return 0;
	}

}
