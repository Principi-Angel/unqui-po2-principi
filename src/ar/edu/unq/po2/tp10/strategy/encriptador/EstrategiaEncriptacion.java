package ar.edu.unq.po2.tp10.strategy.encriptador;

public interface EstrategiaEncriptacion {
	String encriptar(String texto);
	String desencriptar(String texto);
}