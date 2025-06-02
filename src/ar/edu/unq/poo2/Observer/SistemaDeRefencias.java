package ar.edu.unq.poo2.Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaDeRefencias implements Notifier{

	private List<ObserverArticle> observers = new ArrayList<ObserverArticle>();
	private List<Article> articles = new ArrayList<Article>();

	@Override
	public void suscribe(ObserverArticle observer) {
		this.observers.add(observer);		
	}

	@Override
	public void unSuscribe(ObserverArticle observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notify(Article article) {
		this.observers.stream().forEach(o->o.update(article));
	}

	public List<ObserverArticle> getObservers() {
		return this.observers;
	}

	public void addArticle(Article article) {
		this.articles.add(article);
		this.notify(article);
	}

	public List<Article> getArticles() {
		return this.articles;
	}

	public void removeArticle(Article article) {
		this.articles.remove(article);
	}

}
