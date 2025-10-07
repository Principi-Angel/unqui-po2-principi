package ar.edu.unq.po2.tp8.composite.cultivos;

public class ParcelaMixta extends Parcela {

	@Override
	public Double getGanancia() {
		return getParcelasH().stream()
	            .mapToDouble(parcela -> parcela.getGanancia())
	            .sum();
	}
	
	@Override
	public void agregarParcela(Parcela parcela) throws Exception {
		if (parcela.getPadre() == null) {
			parcela.setPadre(this);
		    this.getParcelasH().add(parcela);
	    } else {
	    		throw new Exception("La parcela ya pertenece a otra parcela.");
	    }
	}
}
