package ar.edu.unq.poo2.Observer;

import java.util.ArrayList;
import java.util.List;

public class ManagerInvestigator implements ObserverArticle, Notifier {
	
	private ObserverArticle observer;
	private List<String> interest = new ArrayList<String>();

	public ObserverArticle getObserver() {
		return this.observer;
	}

	public List<String> getInterest() {
		return interest;
	}

	@Override
	public void suscribe(ObserverArticle observer) {
		this.observer = observer;
	}

	@Override
	public void unSuscribe(ObserverArticle observer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void notify(Article article) {
		if(this.isInteresting(article)) {
			this.observer.update(article);
		}
	}
	/**PROPOSITO: definir si un articulo es interesante
	 * OBSERVACION: es interesante si al menos un aspecto de ambas listas
	 * information(informacion del articulo) y interest(lista de intereses propia del manager)
	 * son iguales.
	 * */
	private boolean isInteresting(Article article) {
		List<String> information = article.getAllInformationHasAList();
		return this.interest.stream().anyMatch(s->this.hadSameInterest(s, information));
	}
	
	/**PROPOSITO: indicar si el String *s* se encuentra en la lista de Strings
	 * *information* 
	 * */
	private boolean hadSameInterest(String s, List<String> information) {
		return information.stream().anyMatch(aspect -> aspect.equalsIgnoreCase(s));
	}

	@Override
	public void update(Article article) {
		this.notify(article);
	}

	public void setInterest(List<String> interest) {
		this.interest = interest;
	}

}
