package ar.edu.unq.poo2.Observer;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private String resultado;
	private String deporte;
	private List<String> contrincantes;
	private List<Observer> observers = new ArrayList<Observer>();
	public Manager(String resultado, String deporte, List<String> contrincantes) {
		this.resultado = resultado;
		this.deporte = deporte;
		this.contrincantes = contrincantes;
	}

	public void notificarSiEsDeInteres(Partido partido) {
		if(this.esDeInteres(partido)) {
			this.getObservers().stream().forEach(o->o.update(partido));
		}
	}

	private boolean esDeInteres(Partido partido) {
		return this.getDeporte().equalsIgnoreCase(partido.getDeporte()) ||
				this.getResultado().equalsIgnoreCase(partido.getResultado()) ||
				this.getContrincantes().containsAll(partido.getContrincantes());
	}

	public String getResultado() {
		return resultado;
	}

	public String getDeporte() {
		return deporte;
	}

	public List<String> getContrincantes() {
		return contrincantes;
	}

	public List<Observer> getObservers() {
		return this.observers;
	}

	public void suscribir(Observer unObserver) {
		this.observers.add(unObserver);	
	}

	public void desSuscribir(Observer unObserver) {
		this.observers.remove(unObserver);
	}

}
