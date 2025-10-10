package ar.edu.unq.po2.tp8.state.videoJuego;

public class DosJugadores extends EstadoMVJ {
	
	public DosJugadores(MaquinaDeVJ maquina) {
		super();
		this.setMaquina(maquina);
	}
	
	@Override
	public void recibirSeñalBoton() {
		this.getMaquina().iniciarJuegoDosJ();
	}

	@Override
	public void recibirFicha(Ficha ficha) {}

	@Override
	public void recibirFicha(Ficha ficha, Ficha ficha2) {}

}
