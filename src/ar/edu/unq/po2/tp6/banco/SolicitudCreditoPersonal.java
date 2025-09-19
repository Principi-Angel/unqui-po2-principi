package ar.edu.unq.po2.tp6.banco;

public class SolicitudCreditoPersonal extends SolicitudDeCredito {
	public SolicitudCreditoPersonal(Cliente cliente, Double monto, int cuotas) {
		super(cliente, monto, cuotas);
	}

	@Override
	public boolean esAceptada() {
		return super.esAceptada() && this.cumpleConIngresoAnual(this.getCliente());
	}
	
	@Override
	protected Double porcentajeSueldoAceptacion() {
		return 0.7d;
	}
	
	protected boolean cumpleConIngresoAnual(Cliente cliente) {
		return cliente.getSueldoAnual() >= this.sueldoMinimoParaSerAceptada();
	}
	
	protected Double sueldoMinimoParaSerAceptada() {
		return 15000d;
	}
}
