package ar.edu.poo2.tpCompositeState;

import java.awt.Point;
import java.util.List;


public interface Tropa {
	public void añadir(Tropa tropa);
	public void borrar(Tropa tropa);
	public void caminar(int x, int y);
	public Point getUbicacion();
	public List<Tropa> getTropa();
}
