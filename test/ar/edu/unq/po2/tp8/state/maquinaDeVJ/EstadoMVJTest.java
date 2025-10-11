package ar.edu.unq.po2.tp8.state.maquinaDeVJ;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.state.videoJuego.Apagada;
import ar.edu.unq.po2.tp8.state.videoJuego.DosJugadores;
import ar.edu.unq.po2.tp8.state.videoJuego.EnEsperaFichas;
import ar.edu.unq.po2.tp8.state.videoJuego.Encendida;
import ar.edu.unq.po2.tp8.state.videoJuego.EstadoMVJ;
import ar.edu.unq.po2.tp8.state.videoJuego.MaquinaDeVJ;
import ar.edu.unq.po2.tp8.state.videoJuego.UnJugador;

import static org.mockito.Mockito.*;


class EstadoMVJTest {
	
	private EstadoMVJ apagada;
	private EstadoMVJ encendida;
	private EstadoMVJ enEsperaFichas;
	private EstadoMVJ unJugador;
	private EstadoMVJ dosJugadores;
	private MaquinaDeVJ maquina;
	
	@BeforeEach
	public void setUp() {
		this.maquina = mock(MaquinaDeVJ.class);
		this.apagada = new Apagada(maquina);
		this.encendida = new Encendida(maquina);
		this.enEsperaFichas = new EnEsperaFichas(maquina);
		this.unJugador = new UnJugador(maquina);
		dosJugadores = new DosJugadores(maquina);
	}

	@Test
	void testPasaDeApagadaAEncendida() {
		this.apagada.recibirSeñalBoton();
		verifyNoMoreInteractions(maquina);
	}

}
