package ar.edu.unq.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Chango {

	private List<Pagable> pagables;
	
	public List<Pagable> getPagables() {
		return pagables;
	}

	public Chango() {
		this.pagables = new ArrayList<Pagable>();
	}
	
	public void agregarPagable(Pagable unPagable) {
		this.getPagables().add(unPagable);
	}

	public int getCantPagables() {
		return this.getPagables().size();
	}

	public void quitarPagable(Pagable unPagable) {
		this.getPagables().remove(unPagable);
	}
	
}
