package ar.edu.unq.poo2.tp4;

import java.time.LocalDate;

public class IngresoPorHoraExtra extends Ingreso {

	private int horas;

	public IngresoPorHoraExtra(LocalDate percepcion, String concepto, int horas, double monto) {
		super(percepcion, concepto, monto);
		this.horas = horas;
	}

	public int getHoras() {
		return horas;
	}
	
	public double montoImponible() {
		return 0;
	}
}
