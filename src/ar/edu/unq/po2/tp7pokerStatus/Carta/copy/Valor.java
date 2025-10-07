package ar.edu.unq.po2.tp7pokerStatus.Carta.copy;

public enum Valor{ 
	C1,C2,C3,C4,C5,C6,C7,C8,C9,C10,CJ,CQ,CK;
	
	public int getOrden(Valor valor) {  
		return valor.ordinal();
	}
}