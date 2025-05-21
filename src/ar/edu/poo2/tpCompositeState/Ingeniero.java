package ar.edu.poo2.tpCompositeState;

import java.awt.Point;
import java.util.List;

public class Ingeniero implements Tropa {
	private Point ubicacion;
	
	public Ingeniero(Point ubicacion) {
		super();
		this.ubicacion = ubicacion;
	}
	
	@Override
	public Point getUbicacion() {
		return ubicacion;
	}

	@Override
	public void añadir(Tropa tropa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void borrar(Tropa tropa) {
		// TODO Auto-generated method stub

	}

	@Override
	public void caminar(int x, int y) {
		this.getUbicacion().move(x, y);
	}

	@Override
	public List<Tropa> getTropa() {
		return null;
	}

}
