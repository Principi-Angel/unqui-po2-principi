package ar.edu.unq.po2.tp7;

import ar.edu.unq.po2.tp7pokerStatus.Carta.Carta;

public class ReglaPorValoresIguales implements ReglaPoker {
	private String nombre;
	private int cantidadDeValoresIguales;

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public boolean cumple(Carta[] cartas) {
		return false;
	}

}
