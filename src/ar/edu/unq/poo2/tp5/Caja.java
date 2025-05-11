package ar.edu.unq.poo2.tp5;

public class Caja {
	public double procesar(Chango chango) {
		double monto = 0;
		for(Pagable x: chango.getPagables()) {
			monto += x.procesar();
		}
		return monto;
	}
}
