package unq.poo2.practicas.EmpresaLiquida;

public class Permanente extends Empleado {
	private int hijos;
	private int antiguedad;
	
	public Permanente(int hijos, int antiguedad) {
		this.hijos = hijos;
		this.antiguedad = antiguedad;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}
	
	public int getHijos() {
		return hijos;
	}
	
	@Override
	public int retenciones() {
		return this.obraSocial() + this.costoPorHijos() + this.aportesJubilatorios();
	}
	
	private int aportesJubilatorios() {
		return this.getSueldoBasico() * 15 / 100;
	}

	private int costoPorHijos() {
		return 20 * this.getHijos();
	}

	@Override
	public int obraSocial() {
		return this.getSueldoBasico() * 10 / 100;
	}

	@Override
	public int extras() {
		// TODO Auto-generated method stub
		return this.asignacionPorHijos() + this.asignacionPorCasado() + this.getSueldoBasico()
		+ this.bonusPorAntiguedad();
	}

	private int bonusPorAntiguedad() {
		return 50 * this.getAntiguedad();
	}

	private int asignacionPorCasado() {
		if(this.getEstadoCivil()) {
			return 100;
		}
		return 0;
	}

	private int asignacionPorHijos() {
		return 150 * this.getHijos();
	}
	
	

}
