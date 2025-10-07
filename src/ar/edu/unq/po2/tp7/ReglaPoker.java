package ar.edu.unq.po2.tp7;

import ar.edu.unq.po2.tp7pokerStatus.Carta.Carta;

public interface ReglaPoker {

	public String getNombre();
	public boolean cumple(Carta[] cartas);
	
}
