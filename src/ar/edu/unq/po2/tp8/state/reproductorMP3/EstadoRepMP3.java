package ar.edu.unq.po2.tp8.state.reproductorMP3;

public abstract class EstadoRepMP3 {
	protected ReproductorMP3 reproductor;
	
	public abstract void play() throws Exception;
	public abstract void pause() throws Exception;
	public abstract void stop();
}
