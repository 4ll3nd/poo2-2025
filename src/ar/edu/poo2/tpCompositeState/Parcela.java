package ar.edu.poo2.tpCompositeState;

public interface Parcela {
	public double ganancias();
	public void add(Parcela parcela);
	public void remove(Parcela parcela);
	public Parcela getChild(int parcelaNro);
}
