package ar.edu.poo2.tpCompositeState;

public class Pausado extends Estado {

	@Override
	public void play(Reproductor r, Song x) {
		r.setEstado(new Reproduccion());
		x.play();
	}
	
	
	@Override
	/**OBSERVACION: una cualidad del boton pausa es que 
	 * si el reproductor ya estaba pausado y se vuelve a presionar el boton
	 * este reproduce la cancion
	 * */
	public void pause(Reproductor reproductor, Song cancion) {
		reproductor.setEstado(new Reproduccion());
		cancion.play();
	}

	@Override
	public void stop(Reproductor reproductor, Song cancion) {
		reproductor.setEstado(new Reproduccion());
		cancion.stop();
	}

}
