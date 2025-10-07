package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
	private List<Personaje> personajesH = new ArrayList<Personaje>();
	private Personaje padre;
		
	public abstract void agregarPersonaje(Personaje personaje) throws Exception;
	public abstract void caminar();
	
	protected List<Personaje> getPersonajesH(){
	}
	
	protected void setPadre(Personaje padre){
		this.padre = padre;
	}
	
	protected Personaje getPadre() {
		return padre;
	}
}
