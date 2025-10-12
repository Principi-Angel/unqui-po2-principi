package ar.edu.unq.po2.tp8.state.reproductorMP3;

public class Reproduciendo extends EstadoRepMP3 {
	
	public Reproduciendo(ReproductorMP3 reproductor) {
		super();
		this.reproductor = reproductor;
	}
	
	@Override
	public void play() throws Exception {
		throw new Exception("No se encuentra en modo Selección de Canciones.");
	}

	@Override
	public void pause() {
		reproductor.pausarCancion();
	}

	@Override
	public void stop() {
		reproductor.pausarCancion();
		reproductor.setEstado(new SeleccionDeCanciones(reproductor));
	}

}
