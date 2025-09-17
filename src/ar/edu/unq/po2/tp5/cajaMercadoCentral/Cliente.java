package ar.edu.unq.po2.tp5.cajaMercadoCentral;
import java.util.ArrayList;

public class Cliente {
	private Double montoAPagar = 0d;

	public Double getMontoAPagar() {
		return montoAPagar;
	}
	
	
	public void sumarMontoProducto(Double montoProducto) {
		montoAPagar += montoProducto;
	}
	
	public void pagarMonto(Double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
}
