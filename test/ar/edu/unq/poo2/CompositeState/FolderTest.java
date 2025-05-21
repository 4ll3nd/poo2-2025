package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Archive;
import ar.edu.poo2.tpCompositeState.Folder;

class FolderTest {
	Folder fotos;
	Archive f;
	Archive f1;
	Archive f2;
	Folder videos;
	@BeforeEach
	void setUp() throws Exception {
		fotos = new Folder("Fotos", LocalDate.of(2002, 3, 21));
		f = mock(Archive.class);
		f1 = mock(Archive.class);
		f2 = mock(Archive.class);
		videos = new Folder("videos", LocalDate.of(2003, 3, 20));
	}

	@Test
	void testAddArchive() {
		fotos.add(f);
		assertEquals(1, fotos.getChilds().size());
	}
	
	@Test
	void testRemoveArchive() {
		fotos.add(f);
		fotos.add(f1);
		
		fotos.remove(f);
		
		assertEquals(1, fotos.getChilds().size());
	}
	
	@Test
	void testTotalSizeFolder() {
		when(f.totalSize()).thenReturn(300);
		when(f1.totalSize()).thenReturn(200);
		when(f2.totalSize()).thenReturn(1000);
		fotos.add(f);
		fotos.add(f1);
		videos.add(f2);
		fotos.add(videos);
		
		assertEquals(1500, fotos.totalSize());
	}
	/**
	@Test
	void testLastModified() {
		when(f.getLastModifiedDate()).thenReturn(LocalDate.of(2002, 3, 12));
		when(f1.getLastModifiedDate()).thenReturn(LocalDate.of(2003, 4, 13));
		when(f2.getLastModifiedDate()).thenReturn(LocalDate.of(2004, 5, 14));
		fotos.add(f1);
		fotos.add(f2);
		fotos.add(f);
		
		assertEquals(f, fotos.lastModified());
	}
	**/
}
