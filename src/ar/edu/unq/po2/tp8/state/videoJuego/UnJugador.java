package ar.edu.unq.po2.tp8.state.videoJuego;

public class UnJugador extends EstadoMVJ {
	
	public UnJugador(MaquinaDeVJ maquina) {
		super();
		this.setMaquina(maquina);
	}
	
	@Override
	public void recibirSeñalBoton() {
		this.getMaquina().iniciarJuegoUnJ();
	}

	@Override
	public void recibirFicha(Ficha ficha) {}

	@Override
	public void recibirFicha(Ficha ficha, Ficha ficha2) {}

}
