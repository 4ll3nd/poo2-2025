package ar.edu.unq.poo2.CompositeState;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.poo2.tpCompositeState.Archive;
import ar.edu.poo2.tpCompositeState.FyleSystem;

class ArchiveTest {
	Archive archive;
	FyleSystem file;
	@BeforeEach
	void setUp() throws Exception {
		archive = new Archive(300, "imagen.png", LocalDate.of(2002, 3, 12));
		file = mock(FyleSystem.class);
	}

	@Test
	void testTotalSize() {
		assertEquals(300.0, archive.totalSize());
	}
	
	@Test
	void testGetName() {
		assertEquals("imagen.png", archive.getName());
	}
	
	@Test
	void testGetLastModifiedDate() {
		assertEquals(LocalDate.of(2002, 3, 12), archive.getLastModifiedDate());
	}
	
	@Test
	void testArchiveRecibeElMensajeGetChildYSaltaUnError() {
		RuntimeException ex = assertThrows(RuntimeException.class, () ->  {
			archive.getChilds();
		});
		assertEquals("un archivo no contiene archivos", ex.getMessage());
	}
	
	@Test
	void testArchiveRecibeElMensajeOldestModifiedYSaltaUnError() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			archive.oldestModified();
		});
		assertEquals("El archivo no tiene registro de modificaciones", ex.getMessage());
	}
	
	@Test
	void testArchiveRecibeElMensajeAddYSaltaUnError() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			archive.add(file);
		});
		assertEquals("El archivo no almacena otros archivos", ex.getMessage());
	}
	
	@Test
	void testArchiveRecibeElMensajeRemoveYSaltaUnError() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			archive.remove(file);
		});
		assertEquals("El archivo no almacena otros archivos", ex.getMessage());
	}
	
	@Test
	void testArchiveRecibeElMensajeLastModifiedYSaltaUnError() {
		RuntimeException ex = assertThrows(RuntimeException.class, () -> {
			archive.lastModified();
		});
		assertEquals("El archivo no tiene registro de modificaciones", ex.getMessage());
	}
}
