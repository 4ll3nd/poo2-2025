package ar.edu.unq.poo2.Observer;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArticleTest {
	Article article;
	@BeforeEach
	void setUp() throws Exception {
		article = new Article("gobstones", Arrays.asList("gon"), Arrays.asList("unaj"),
							  "ensayo", "Varela", Arrays.asList("varela", "goobstones"));
	}

	@Test
	void testInicializacion() {
		assertEquals("gobstones", article.getTittle());
		assertEquals(1, article.getAutors().size());
		assertEquals(1, article.getAffilations().size());
		assertEquals("ensayo", article.getType());
		assertEquals("Varela", article.getPlace());
		assertEquals(2, article.getKeywords().size());
	}
}
