package unq.poo2.practicas.EmpresaLiquida;

import java.time.LocalDate;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private boolean estadoCivil;
	private LocalDate nacimiento;
	private int sueldoBasico;
	private int aportes;
	
	public int calcularEdad() {
		return this.nacimiento.until(nacimiento).getYears();
	}
	
	public abstract int retenciones();

	public int calcularNeto() {
		return this.calcularBruto() - this.retenciones();
	}
	
	public abstract int obraSocial();
	
	public int getAportes() {
		return this.aportes;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public boolean getEstadoCivil() {
		return this.estadoCivil;
	}
	
	public LocalDate getNacimiento() {
		return this.nacimiento;
	}
	
	public int getSueldoBasico() {
		return this.sueldoBasico;
	}
	
	public int calcularBruto() {
		return this.sueldoBasico + this.extras() - this.retenciones();
	}

	public abstract int extras();

	public void generarRecibo(Empleado empleado) {
		new Recibo(this);
	}

}
