package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public class FacturaDeServicio extends Factura {
	private Double costoPorUnidad;
	private Double cantidadDeUnidadesConsumidas;
	
	@Override
	public Double getValor() {
		return costoPorUnidad * cantidadDeUnidadesConsumidas;
	}
}
