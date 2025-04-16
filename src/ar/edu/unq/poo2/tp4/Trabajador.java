package ar.edu.unq.poo2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	private List<Ingreso> recibos = new ArrayList<Ingreso>();

	public double getTotalPercibido() {
		return this.recibos.stream().mapToDouble(r-> r.getMonto()).sum();
	}
	
	public void agregarIngreso(Ingreso x) {
		this.recibos.add(x);
	}

	public double getMontoImponible() {
		return  this.recibos.stream().mapToDouble(r-> r.montoImponible()).sum();
	}

	public double getImpuestoAPagar() {
		return this.recibos.stream().mapToDouble(r->r.montoImponible()).sum() * 0.02;
	}
	
}
