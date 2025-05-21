package ar.edu.poo2.tpCompositeState;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Tropa {
	private Point ubicacion;
	private List<Tropa> tropas;
	public Ejercito(Point point) {
		this.ubicacion = point;
		this.tropas = new ArrayList<Tropa>();
	}
	
	@Override
	public void añadir(Tropa tropa) {
		this.getTropa().add(tropa);
	}

	@Override
	public void borrar(Tropa tropa) {
		this.getTropa().remove(tropa);
	}

	@Override
	public void caminar(int x, int y) {
		for(Tropa t: this.getTropa()) {
			t.caminar(x, y);
		}
		this.ubicacion.move(x, y);
	}

	@Override
	public Point getUbicacion() {
		return ubicacion;
	}

	@Override
	public List<Tropa> getTropa() {
		return this.tropas;
	}

}
