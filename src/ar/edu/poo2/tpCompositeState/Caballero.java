package ar.edu.poo2.tpCompositeState;

import java.awt.Point;
import java.util.List;

public class Caballero implements Tropa{
	Point ubicacion;
	public Caballero(Point point) {
		super();
		this.ubicacion = point;
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
		this.ubicacion.move(x, y);
	}

	@Override
	public List<Tropa> getTropa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getUbicacion() {
		return ubicacion;
	}
	
}
