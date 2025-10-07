package ar.edu.unq.po2.tp8.composite.cultivos;

import java.util.ArrayList;
import java.util.List;

public abstract class Parcela {
	private Cultivo cultivo;
	private List<Parcela> parcelasH = new ArrayList<Parcela>();
	private Parcela padre;
    
	public Parcela(Cultivo cultivo) {
		this.cultivo = cultivo;
	}
	
	public abstract Double getGanancia();

	public Cultivo getCultivo() {
		return cultivo;
	}
	
	public abstract void agregarParcela(Parcela parcela) throws Exception;
	
	public Parcela getPadre() {
        return padre;
    }

    protected void setPadre(Parcela padre) {
        this.padre = padre;
    }
	
	public List<Parcela> getParcelasH() {
		return parcelasH;
	}
}
