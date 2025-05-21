package ar.edu.poo2.tpCompositeState;

import java.util.List;

public class Reproductor {
	private Estado estado;
	private List<Song> lista;
	public Reproductor() {
		this.estado = new Seleccion();
	}

	public Estado getEstado() {
		return estado;
	}

	void setEstado(Estado estado) {
		this.estado = estado;
	}
 
	public List<Song> getLista() {
		return lista;
	}

	public void play(Song one) {
		this.getEstado().play(this, one);
	}

	public void pause(Song one) {
		this.getEstado().pause(this, one);
	}

	public void stop(Song one) {
		this.getEstado().stop(this, one);
		
	}
}
