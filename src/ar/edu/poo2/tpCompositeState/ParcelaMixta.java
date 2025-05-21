package ar.edu.poo2.tpCompositeState;

import java.util.ArrayList;
import java.util.List;

public class ParcelaMixta implements Parcela{
	private List<Parcela> parcelas = new ArrayList<Parcela>(); 
	
	@Override
	public double ganancias() {
		double ganancias = 0;
		for(Parcela p: this.parcelas) {
			ganancias += p.ganancias();
		}
		return ganancias;
	}

	@Override
	public void add(Parcela parcela) {
		this.parcelas.add(parcela);
	}

	@Override
	public void remove(Parcela parcela) {
		this.parcelas.remove(parcela);
	}

	@Override
	public Parcela getChild(int i) {
		return this.parcelas.get(i);
	}
	
}
