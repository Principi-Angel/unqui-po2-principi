package ar.edu.unq.po2.tp9.template.wikipedia;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FiltroWikiTest {
	FiltroWiki mismaLI;
	FiltroWiki linkEC;
	FiltroWiki propiedad;
	WikipediaPage laPlata;
	WikipediaPage lucasArt;
	WikipediaPage lobo;
	WikipediaPage loco;
	List<WikipediaPage> emptyL;
	List<WikipediaPage> todasConL;
		
	
	@BeforeEach
	void setUp() throws Exception {
		
		mismaLI = new MismaLetraInicial();
		linkEC = new LinkEnComun();
		propiedad = new PropiedadEnComun();
		
		emptyL = new LinkedList<WikipediaPage>();
		
		
		laPlata = mock(WikipediaPage.class);
		lucasArt = mock(WikipediaPage.class);
		lobo = mock(WikipediaPage.class);
		when(laPlata.getTitle()).thenReturn("La Plata");		
		when(lucasArt.getTitle()).thenReturn("Lucas Art");
		when(lobo.getTitle()).thenReturn("Lobo");
		
		loco = mock(WikipediaPage.class);
		when(loco.getTitle()).thenReturn("Loco");
		
		/// todasConL = new LinkedList<WikipediaPage>();
		todasConL = List.of(laPlata, lobo, lucasArt);
	}

	@Test
	void testTodasDeLaLista() {
		assertEquals(todasConL, mismaLI.getSimilarPages(loco,todasConL));
	}
	
	@Test
	void testListaVacia() {
		assertEquals(emptyL, mismaLI.getSimilarPages(loco,emptyL));
	}
	
	@Test
	void testStringVacioListaVacia() {
		WikipediaPage stringVacio;
		stringVacio = mock(WikipediaPage.class);
		when(stringVacio.getTitle()).thenReturn("");
		assertEquals(emptyL, mismaLI.getSimilarPages(stringVacio,emptyL));
	}
	
	@Test
	void testStringVacio() throws Exception {
		WikipediaPage stringVacio;
		stringVacio = mock(WikipediaPage.class);
		when(stringVacio.getTitle()).thenReturn("");
		assertThrows(RuntimeException.class, () -> mismaLI.getSimilarPages(stringVacio,todasConL));
	}
	
	@Test
	void testNingunaConcide() {
		WikipediaPage quilmes; WikipediaPage avellaneda; WikipediaPage bera;
		quilmes = mock(WikipediaPage.class);
		avellaneda = mock(WikipediaPage.class);
		bera = mock(WikipediaPage.class);
		when(quilmes.getTitle()).thenReturn("Quilmes");		
		when(avellaneda.getTitle()).thenReturn("Avellaneda");
		when(bera.getTitle()).thenReturn("Bera");
		assertEquals(emptyL, mismaLI.getSimilarPages(laPlata,emptyL));
	}
	
	@Test
	void testHayUnStringVacio() {
		WikipediaPage stringVacio;
		stringVacio = mock(WikipediaPage.class);
		when(stringVacio.getTitle()).thenReturn("");
		List<WikipediaPage> testL;
		testL = new LinkedList<WikipediaPage>();
		testL.add(laPlata); testL.add(stringVacio);
		List<WikipediaPage> esperado;
		esperado = new LinkedList<WikipediaPage>();
		esperado.add(laPlata);
		assertEquals(esperado, mismaLI.getSimilarPages(lucasArt,testL));
	}
	
	@Test
	void testSePasaListaVacia() {
		assertEquals(emptyL, mismaLI.getSimilarPages(lucasArt,emptyL));
	}
	
	@Test
	void testListaVaciaIgualPideTituloAPage() {
		mismaLI.getSimilarPages(lucasArt,emptyL);
		verify(lucasArt).getTitle();
	}
	
	@Test
    void testCumpleCondicionConExcepcion() {
        WikipediaPage page = mock(WikipediaPage.class);
        WikipediaPage wp = mock(WikipediaPage.class);

        when(page.getTitle()).thenReturn("Loco");
        when(wp.getTitle()).thenThrow(new RuntimeException("Título inválido"));

        MismaLetraInicial filtro = new MismaLetraInicial();

        boolean resultado = filtro.cumpleCondicion(page, wp);

        assertFalse(resultado, "Si wp.getTitle() lanza excepción, debe retornar false");
    }
	
	@Test
	void testCumpleCondicionEjecutaComparacion() {
	    WikipediaPage page = mock(WikipediaPage.class);
	    WikipediaPage wp = mock(WikipediaPage.class);

	    when(page.getTitle()).thenReturn("Lucas");
	    when(wp.getTitle()).thenReturn("Lobo");

	    MismaLetraInicial filtro = new MismaLetraInicial();

	    boolean resultado = filtro.cumpleCondicion(page, wp);

	    assertTrue(resultado, "Ambos títulos empiezan con 'L', debe retornar true");
	}
	
	@Test
	void testCumpleCondicionEjecutaComparacion2() {
	    WikipediaPage page = mock(WikipediaPage.class);
	    WikipediaPage wp = mock(WikipediaPage.class);

	    when(page.getTitle()).thenReturn("Lucas");
	    when(wp.getTitle()).thenReturn("Obo");

	    MismaLetraInicial filtro = new MismaLetraInicial();

	    boolean resultado = filtro.cumpleCondicion(page, wp);

	    assertFalse(resultado, "no debería cumplir");
	}
	

	

}
