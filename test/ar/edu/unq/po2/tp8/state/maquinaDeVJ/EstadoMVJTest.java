package ar.edu.unq.po2.tp8.state.maquinaDeVJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstadoMVJTest {
	
	EstadoMVJ apagada;
	EstadoMVJ encendida;
	EstadoMVJ unJugador;
	EstadoMVJ dosJugadores;
	MaquinaDeVJ maquina;
	
	@BeforeEach
	void setUp() throws Exception {
		maquina = new MaquinaDeVJ();
		apagada = new Apagada(maquina, encendida);
		encendida = new Encendida(maquina, )
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
