package ar.edu.unq.poo2.Observer;

public interface Notifier {
	public void suscribe(ObserverArticle observer);
	public void unSuscribe(ObserverArticle observer);
	public void notify(Article article);
}
