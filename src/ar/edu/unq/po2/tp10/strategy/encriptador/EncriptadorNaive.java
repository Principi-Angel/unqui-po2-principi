package ar.edu.unq.po2.tp10.strategy.encriptador;

public class EncriptadorNaive {
	private EstrategiaEncriptacion estrategia;
	
	public void setEstrategia(EstrategiaEncriptacion estrategia) {
		this.estrategia = estrategia;
	}
	
	public String encriptar(String texto) {
		return estrategia.encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return estrategia.desencriptar(texto);
	}
}