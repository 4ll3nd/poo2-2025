package ar.edu.poo2.tp2;

import java.time.LocalDate;

public class Temporario extends Empleado {
	
	private int horasExtras;
	private LocalDate finDeDesignacion;
	
	public Temporario(int horasExtras, LocalDate finDeDesignacion) {
		this.horasExtras = horasExtras;
		this.finDeDesignacion = finDeDesignacion;
	}
	
	@Override
	public int retenciones() {
		return (this.getSueldoBasico() * 10 / 100) + this.añadidoPorAportes() + this.montoHorasExtras();
	}
	
	public LocalDate getFinDeDesignacion() {
		return this.finDeDesignacion;
	}
	
	private int montoHorasExtras() {
		return 5 * this.getHorasExtras();
	}


	public int getHorasExtras() {
		return this.horasExtras;
	}

	//esta feo, pero dudo que se pueda mejorar.
	private int añadidoPorAportes() {
		if(this.getAportes() > 50) {
			return 25;
		}
		return 0;
	}

	@Override
	public int obraSocial() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int extras() {
		return 40 * this.getHorasExtras();
	}

}
