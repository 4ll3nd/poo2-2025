package ar.edu.poo2.tpCompositeState;

public abstract class Estado {
	public abstract void play(Reproductor r, Song x);

	public abstract void pause(Reproductor reproductor, Song one);

	public abstract void stop(Reproductor reproductor, Song one);
}
