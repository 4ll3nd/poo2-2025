package ar.edu.poo2.tpCompositeState;

public class ParcelaPura implements Parcela {
	private double ganancia;
	public ParcelaPura(double d) {
		ganancia = d;
	}

	@Override
	public double ganancias() {
		return ganancia;
	}
	/***Estos metodos se quedan vacios para maximizar la
	 * la idea de no conocer al tipo de parcela con el que el cliente
	 * interactua.
	 * **/
	@Override
	public void add(Parcela parcela) {
		
	}

	@Override
	public void remove(Parcela parcela) {
		
	}

	@Override
	public Parcela getChild(int i) {
		return null;
	}

}
