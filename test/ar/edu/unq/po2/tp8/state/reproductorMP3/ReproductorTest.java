package ar.edu.unq.po2.tp8.state.reproductorMP3;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.mockito.Mockito.*;

class ReproductorTest {
	ReproductorMP3 reproductor;
	Song song;
	EstadoRepMP3 reproduciendo;
	EstadoRepMP3 seleccion;
	
	@BeforeEach
	void setUp() throws Exception {
		reproductor = new ReproductorMP3();
		song = mock(Song.class);
		reproduciendo = mock(Reproduciendo.class);
		seleccion = mock(SeleccionDeCanciones.class);
		reproductor.setCancion(song);
	}

		
	@Test
	void testReproducirCancion() {
		reproductor.reproducirCancion();
		verify(song,times(1)).play();
	}
	
	@Test
	void testPausarCancion() {
		reproductor.pausarCancion();
		verify(song).pause();
	}
	
	@Test
	void testExcepcionAlIntentarPlayMientrasEstaReproduciendo() {
		reproductor.setEstado(reproduciendo);
		verify(song, never()).play();
	}
	
	@Test
	void testExcepcionAlIntentarPausarMientrasEstaEnSeleccionDeCanciones() throws Exception {
		reproductor.setEstado(seleccion);
		reproductor.pause();
		verify(song, never()).pause();
	}
	
	
}
