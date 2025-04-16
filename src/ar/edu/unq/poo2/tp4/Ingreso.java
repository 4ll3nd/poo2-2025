package ar.edu.unq.poo2.tp4;

import java.time.LocalDate;

public class Ingreso {
	
	private LocalDate percepcion;
	private String concepto;
	private double monto;
	
	public LocalDate getPercepcion() {
		return percepcion;
	}

	public String getConcepto() {
		return concepto;
	}
	
	public double getMonto() {
		return monto;
	}
	
	public double montoImponible() {
		return monto;
	}

	public Ingreso(LocalDate percepcion, String concepto, double monto) {
		this.percepcion = percepcion;
		this.concepto = concepto;
		this.monto = monto;
	}

}
