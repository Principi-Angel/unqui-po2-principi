package ar.edu.unq.po2.tp8.state.reproductorMP3;

public class SeleccionDeCanciones extends EstadoRepMP3 {
	
	public SeleccionDeCanciones(ReproductorMP3 reproductor) {
		super();
		this.reproductor = reproductor;
	}
	
	@Override
	public void play() {
		reproductor.reproducirCancion();
	}

	@Override
	public void pause() throws Exception {
		throw new Exception("No se encuentra en modo Reproduciendo.");
	}

	@Override
	public void stop() {	}

}
