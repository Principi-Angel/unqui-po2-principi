package ar.edu.unq.po2.tp8.composite.cultivos;

public class ParcelaPura extends Parcela {
	private Cultivo cultivo;

	public ParcelaPura(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	private Cultivo getCultivo() {
		return cultivo;
	}
	
	@Override
	public Double getGanancia() {
		return this.getCultivo().getGanancia();
	}
	
	@Override
	public void agregarParcela(Parcela parcela) throws Exception {
		throw new Exception("La parcela no admite subdivisiones.");
	}
}
