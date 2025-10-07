package ar.edu.unq.po2.tp7pokerStatus.Carta.copy;

public enum Palo {
	Picas, Corazones, Diamantes, Treboles; 
	
	public boolean esIgualA(Palo palo) {
		return palo == this;
	}
}
