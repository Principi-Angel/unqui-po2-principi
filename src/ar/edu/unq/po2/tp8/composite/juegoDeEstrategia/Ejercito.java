package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

public class Ejercito extends Personaje{
	
	public Ejercito(Personaje padre) {
		this.setPadre(padre);
	}
	@Override
	public void agregarPersonaje(Personaje personaje) throws Exception {
		if(this.getPadre()==null) {
			personaje.setPadre(this);
			this.getPersonajesH().add(personaje);
		} else {
		}
	}

	@Override
	public void caminar() {
		this.getPersonajesH().stream().forEach(personaje -> personaje.caminar());
	}
	
}
