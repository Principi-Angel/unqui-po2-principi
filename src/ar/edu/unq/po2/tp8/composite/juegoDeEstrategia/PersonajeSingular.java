package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

public abstract class PersonajeSingular extends Personaje {

	@Override
	public void agregarPersonaje(Personaje personaje) throws Exception {
		throw new Exception("Personaje singular.");
	}

	@Override
	public abstract void caminar();
	
}
