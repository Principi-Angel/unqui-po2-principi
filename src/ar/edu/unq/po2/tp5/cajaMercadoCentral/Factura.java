package ar.edu.unq.po2.tp5.cajaMercadoCentral;

public abstract class Factura implements Item {
	AgenciaRecaudadora agenciaRecaudadora;
	
	@Override
	public void registrar() {
		agenciaRecaudadora.registrarPago(this);
	}
}
