package ar.edu.unq.po2.tp6.banco;

public class SolicitudDeCreditoHipotecario extends SolicitudDeCredito {
	
	public SolicitudDeCreditoHipotecario(Cliente cliente, Double monto, int cuotas) {
		super(cliente, monto, cuotas);
	}

	@Override
	public boolean esAceptada() {
		return super.esAceptada() && this.cumpleEdad(this.getCliente()) && this.cumpleGarantia(this.getCliente());
	}

	protected boolean cumpleGarantia(Cliente cliente) {
		Double valorFiscal = cliente.getPropiedad().valorFiscal();
		return valorFiscal >= (valorFiscal * this.porcentajeGarantiaAceptacion());
	}

	protected Double porcentajeGarantiaAceptacion() {
		return 0.7d;
	}

	protected boolean cumpleEdad(Cliente cliente) {
		return this.edadTerminoCredito(cliente, this.getCuotas()) < 65;
	}

	private int edadTerminoCredito(Cliente cliente, int cuotas) {
		return cliente.getEdad() + this.getCuotas();
	}

	@Override
	protected Double porcentajeSueldoAceptacion() {
		return 0.5d;
	}
}
