package ar.edu.unq.po2.tp8.composite.juegoDeEstrategia;

import java.util.HashSet;
import java.util.Set;

public class Ingeniero extends PersonajeSingular {
	private Set<Laja> lajas = new HashSet<Laja>();
	@Override
	public void caminar() {
		this.caminarCortoPoniendoLajas();
	}

	private void caminarCortoPoniendoLajas() {
		// ...
	}
}
