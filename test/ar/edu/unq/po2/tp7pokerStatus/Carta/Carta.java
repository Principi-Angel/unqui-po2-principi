package ar.edu.unq.po2.tp7pokerStatus.Carta;

public abstract class Carta {
	private Palo palo;
	private Valor valor;
	
	public Carta(Palo palo, Valor valor) {
		this.setPalo(palo);
		this.setValor(valor);
	}
	
	public Palo getPalo() {
		return palo;
	}
	
	public Valor getValor() {
		return valor;
	}
	
	private void setValor(Valor valor) {
		this.valor = valor;
	}
	
	private void setPalo(Palo palo) {
		this.palo = palo;
	}
	
	public boolean mismoPaloQue(Carta carta) {
		return this.palo.esIgualA(carta.getPalo());
	}
	
}
