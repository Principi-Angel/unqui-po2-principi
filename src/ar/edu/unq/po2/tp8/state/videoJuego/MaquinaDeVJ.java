package ar.edu.unq.po2.tp8.state.videoJuego;

public class MaquinaDeVJ {
	private EstadoMVJ estado = new Apagada(this);
	
	public void setEstado(EstadoMVJ estado) {
		this.estado = estado;
	}
		
	public void recibirSeñalBoton() {
		estado.recibirSeñalBoton();
	}
	
	public void recibirFicha(Ficha ficha) {
		estado.recibirFicha(ficha);
	}
	
	public void recibirFicha(Ficha ficha, Ficha ficha2) {
		estado.recibirFicha(ficha, ficha2);
	}

	public void iniciarJuegoUnJ() {	}
	public void iniciarJuegoDosJ() {	}
}
