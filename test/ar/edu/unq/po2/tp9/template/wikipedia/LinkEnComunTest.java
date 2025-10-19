package ar.edu.unq.po2.tp9.template.wikipedia;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinkEnComunTest {
	
	FiltroWiki linkEC;
	WikipediaPage laPlata;
	WikipediaPage quilmes;
	WikipediaPage estudiantes;
	WikipediaPage lobo;
	WikipediaPage marte;
	
	@BeforeEach
	void setUp() throws Exception {
		linkEC = new LinkEnComun();
		
		laPlata = mock(WikipediaPage.class);
		quilmes = mock(WikipediaPage.class);
		lobo = mock(WikipediaPage.class);
		estudiantes = mock(WikipediaPage.class);
		marte = mock(WikipediaPage.class);
		when(laPlata.getLinks()).thenReturn(List.of(lobo,estudiantes));
		when(quilmes.getLinks()).thenReturn(List.of(laPlata));
		when(estudiantes.getLinks()).thenReturn(List.of(laPlata,lobo));
		when(lobo.getLinks()).thenReturn(List.of(laPlata,estudiantes));
		when(marte.getLinks()).thenReturn(List.of());	
	}
	
	@Test
	void test() {
		List<WikipediaPage> resultado = List.of(quilmes, lobo);
		assertEquals(resultado, linkEC.getSimilarPages(estudiantes, List.of(quilmes, marte, lobo)));
	}
	
	@Test
	void testSePasaUnaWikiVacia() {
		assertEquals(List.of(), linkEC.getSimilarPages(estudiantes, List.of()));
	}
	
	@Test
	void testSePasaUnaWikiPageSinLinks() {
		assertEquals(List.of(), linkEC.getSimilarPages(marte, List.of(estudiantes,lobo,laPlata)));
	}
	
	@Test
	void testNoHayLinksEnComun() {
		assertEquals(List.of(), linkEC.getSimilarPages(laPlata, List.of(quilmes)));
	}
}