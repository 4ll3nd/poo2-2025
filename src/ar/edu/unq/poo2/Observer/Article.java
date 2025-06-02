package ar.edu.unq.poo2.Observer;

import java.util.ArrayList;
import java.util.List;

public class Article {

	private String tittle;
	private List<String> autors;
	private List<String> affilations;
	private String type;
	private String place;
	private List<String> keywords;

	public Article(String tittle, List<String> autors, List<String> affilations, String type, String place,
			List<String> keywords) {
		this.tittle = tittle;
		this.autors = autors;
		this.affilations = affilations;
		this.type = type;
		this.place = place;
		this.keywords = keywords;
	}

	public String getTittle() {
		return tittle;
	}

	public List<String> getAutors() {
		return autors;
	}

	public List<String> getAffilations() {
		return affilations;
	}

	public String getType() {
		return type;
	}

	public String getPlace() {
		return place;
	}

	public List<String> getKeywords() {
		return keywords;
	}
	
	public List<String> getAllInformationHasAList() {
		ArrayList<String> information = new ArrayList<String>();
		information.add(this.getTittle());
		information.add(this.getPlace());
		information.add(this.getType());
		information.addAll(this.getAffilations());
		information.addAll(this.getAutors());
		information.addAll(this.getKeywords());
		return information;
	}
}
