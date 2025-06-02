package ar.edu.unq.poo2.Observer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaDeReferenciasTest {
	ManagerInvestigator manager;
	ManagerInvestigator otherManager;
	SistemaDeRefencias sistema;
	Article article;
	@BeforeEach
	void setUp() throws Exception {
		manager = mock(ManagerInvestigator.class);
		article = mock(Article.class);
		sistema = new SistemaDeRefencias();
		otherManager = mock(ManagerInvestigator.class);
	}

	@Test
	void testAddNewSuscribe() {
		sistema.suscribe(manager);
		assertEquals(1, sistema.getObservers().size());
	}
	
	@Test
	void testRemoveSuscribe() {
		sistema.suscribe(manager);
		
		sistema.unSuscribe(manager);
		assertEquals(0, sistema.getObservers().size());
	}
	
	@Test
	void testAddArticle() {
		sistema.addArticle(article);
		
		assertEquals(1, sistema.getArticles().size());
	}
	
	@Test
	void testRemoveArticle() {
		sistema.addArticle(article);
		
		sistema.removeArticle(article);
		
		assertEquals(0, sistema.getArticles().size());
	}
	
	@Test
	void notifyObservers() {
		sistema.suscribe(manager);
		sistema.suscribe(otherManager);
		
		sistema.addArticle(article);
		
		verify(manager).update(article);
		verify(otherManager).update(article);
	}
	
}
