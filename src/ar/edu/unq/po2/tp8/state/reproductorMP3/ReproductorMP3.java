package ar.edu.unq.po2.tp8.state.reproductorMP3;

import java.util.LinkedList;
import java.util.List;

public class ReproductorMP3 {
	private EstadoRepMP3 estado = new SeleccionDeCanciones(this);
	private Song cancionActual;
	
	public void setEstado(EstadoRepMP3 estado) {
		this.estado = estado;
	}
	
	public void setCancion(Song s) {
		cancionActual = s;
	}
	
	public void play() throws Exception {
		try {
			estado.play();
		} catch (Exception e) {
			System.out.println("Error: no se encuentra en modo Selección de Canciones.");
		}
	}
	
	public void pause() throws Exception {
		try {
			estado.pause();
		} catch (Exception e) {
			System.out.println("Error: no se encuentra en modo Selección de Canciones.");
		}
	}
	
	public void stop() {
		estado.stop();
	}
	
	public void reproducirCancion() {
		cancionActual.play();
	}

	public void pausarCancion() {
		cancionActual.pause();
	}
}
