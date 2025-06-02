package ar.edu.unq.poo2.Observer;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ManagerInvestigatorTest {
	ManagerInvestigator manager;
	ObserverArticle observer;
	Article article;
	@BeforeEach
	void setUp() throws Exception {
		observer = mock(ObserverArticle.class);
		manager = new ManagerInvestigator();
		article = mock(Article.class);
	}

	@Test
	void testSetingManagerInterests() {
		manager.setInterest(Arrays.asList("Gobstones", "Varela"));
		
		assertEquals(2, manager.getInterest().size());
	}
	
	@Test
	void testSuscribeAInvestigator() {
		manager.suscribe(observer);
		
		assertEquals(observer, manager.getObserver());
	}
	
	@Test
	void notifyInvestigatorIfTheArticleIsInteresting() {
		manager.suscribe(observer);
		manager.setInterest(Arrays.asList("Gobstones", "gobs", "stone",
							"Lucan", "Varela", "Unaj"));
		when(article.getAllInformationHasAList()).thenReturn(Arrays.asList(
				"Gobstones", "gobs", "stone",
				"Lucan", "Varela"
				));
		
		manager.notify(article);
		
		verify(manager.getObserver()).update(article);
	}
	
	@Test
	void dontnotifyInvestigatorBecauseTheArticleIsntInteresting() {
		manager.suscribe(observer);
		manager.setInterest(Arrays.asList("Gobstones", "gobs", "stone",
							"Lucan", "Varela", "Unaj"));
		when(article.getAllInformationHasAList()).thenReturn(Arrays.asList(
				"java", "junit", "saturn",
				"harry", "new york"
				));
		
		manager.notify(article);
		
		verifyNoInteractions(observer);
	}
	
}
