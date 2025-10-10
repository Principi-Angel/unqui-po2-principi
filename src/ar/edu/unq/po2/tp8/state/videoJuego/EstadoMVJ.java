package ar.edu.unq.po2.tp8.state.videoJuego;

public abstract class EstadoMVJ {
	private MaquinaDeVJ maquina;

	public abstract void recibirSeñalBoton();
	public abstract void recibirFicha(Ficha ficha);
	public abstract void recibirFicha(Ficha ficha, Ficha ficha2);
	
	protected MaquinaDeVJ getMaquina() {
		return maquina;
	}
	
	protected void setMaquina(MaquinaDeVJ maquina) {
		this.maquina = maquina;
	}
	
	
}

