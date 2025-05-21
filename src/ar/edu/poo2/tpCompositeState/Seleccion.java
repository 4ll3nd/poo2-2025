package ar.edu.poo2.tpCompositeState;

public class Seleccion extends Estado {

	@Override
	public void play(Reproductor r, Song x) {
		r.setEstado(new Reproduccion());
		x.play();
	}

	@Override
	public void pause(Reproductor reproductor, Song one) {
		throw new RuntimeException("No se puede pausar, si no se reproduce"); // solo para probar
	}//en base a esta funcionalidad, puede testear el cambio de estado.

	@Override
	public void stop(Reproductor reproductor, Song one) {
		throw new RuntimeException("No se puede parar, si no se reproduce");
	}

}
