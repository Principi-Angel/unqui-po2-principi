package ar.edu.unq.po2.tp8.state.videoJuego;

public class EnEsperaFichas extends EstadoMVJ {
	
	public EnEsperaFichas(MaquinaDeVJ maquina) {
		super();
		this.setMaquina(maquina);
	}
	
	@Override
	public void recibirSeñalBoton() {}

	@Override
	public void recibirFicha(Ficha ficha) {
		this.getMaquina().setEstado(new UnJugador(this.getMaquina()));
	}

	@Override
	public void recibirFicha(Ficha ficha, Ficha ficha2) {
		this.getMaquina().setEstado(new DosJugadores(this.getMaquina()));
	}

}
