package ar.edu.unq.poo2.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	private List<Partido> resultados = new ArrayList<Partido>();
	private List<Manager> managers = new ArrayList<Manager>();
	
	public void addResultado(Partido partido) {
		this.resultados.add(partido);
	}

	public List<Partido> getResultados() {
		return this.resultados;
	}

	public void suscribe(Manager manager) {
		this.managers.add(manager);
	}

	public List<Manager> getManagers() {
		return this.managers;
	}

	public void unSuscribe(Manager manager) {
		this.managers.remove(manager);
	}

	public void notificar(Partido partido) {
		this.managers.stream().forEach(m->m.notificarSiEsDeInteres(partido));
	}
}
