package ar.edu.poo2.tpCompositeState;

public class Reproduccion extends Estado {

	@Override
	public void play(Reproductor r, Song x) {
		throw new RuntimeException("no se puede reproducir algo que se esta reproduciendo");
	}//por este mensaje lo puedo testear.

	@Override
	public void pause(Reproductor reproductor, Song cancion) {
		reproductor.setEstado(new Pausado());
		cancion.pause();
	}

	@Override
	public void stop(Reproductor reproductor, Song one) {
		reproductor.setEstado(new Seleccion());
		one.stop();
	}
	
}
