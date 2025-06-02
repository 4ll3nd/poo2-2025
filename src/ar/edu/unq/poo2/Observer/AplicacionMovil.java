package ar.edu.unq.poo2.Observer;

public class AplicacionMovil implements Observer {

	@Override 
	public void update(Partido partido) {
		System.out.println("Tenes un nuevo resultado!");
		System.out.println("Resultado:" + partido.getResultado());
		System.out.println("Deporte:" + partido.getDeporte());
		System.out.println("Los Contrincantes son: ");
		for(String c: partido.getContrincantes()) {
			System.out.println(c);
		}
	}
}
