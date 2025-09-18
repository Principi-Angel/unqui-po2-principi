package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class FacturaDeImpuesto extends Factura {
	private Double tasa;
	
	@Override
	public Double getValor() {
		return tasa;
	}

}
