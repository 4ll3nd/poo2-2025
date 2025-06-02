package ar.edu.unq.poo2.Observer;

import java.util.List;

public class Partido {

	private String resultado;
	private String deporte;
	private List<String> contrincantes;

	public Partido(String resultado, String deporte, List<String> contrincantes) {
		this.resultado = resultado;
		this.deporte = deporte;
		this.contrincantes = contrincantes;
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
}
