package ar.edu.poo2.tpCompositeState;

public class MaquinaDeJuegos {
	private EstadoFicha estado;
	public EstadoFicha getEstado() {
		return estado;
	}
	
	void setEstado(EstadoFicha estado) {
		this.estado = estado;
	}
	
	public MaquinaDeJuegos() {
		estado = new Reposo();
	}
	public String iniciar() {
		return this.getEstado().iniciar();
	}
	
	public String terminar() {
		this.estado = new Reposo();
		return "Se termino el juego";
	}
	
	public String iniciar(EstadoFicha fichas) {
		this.estado = fichas;
		return this.estado.iniciar();
	}
}
