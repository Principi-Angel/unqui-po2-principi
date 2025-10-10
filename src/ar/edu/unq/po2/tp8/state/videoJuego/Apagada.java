package ar.edu.unq.po2.tp8.state.videoJuego;

public class Apagada extends EstadoMVJ {
	
	public Apagada(MaquinaDeVJ maquina) {
		super();
		this.setMaquina(maquina);
	}

	@Override
	public void recibirSeñalBoton() {
		this.getMaquina().setEstado(new Encendida(this.getMaquina()));
	}

	@Override
	public void recibirFicha(Ficha ficha) {}

	@Override
	public void recibirFicha(Ficha ficha, Ficha ficha2) {}

}
