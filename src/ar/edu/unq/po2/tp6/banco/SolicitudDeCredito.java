package ar.edu.unq.po2.tp6.banco;

public abstract class SolicitudDeCredito implements Solicitud {
	private Cliente cliente;
	private Double monto;
	private int cuotas;
	
	public SolicitudDeCredito(Cliente cliente, Double monto, int cuotas) {
		this.cliente = cliente;
		this.monto = monto;
		this.cuotas = cuotas;
	}
	
	protected abstract Double porcentajeSueldoAceptacion();
	
	public boolean esAceptada() {
		return this.esCuotaMenorSueldo(cliente);
	}
	
	protected boolean esCuotaMenorSueldo(Cliente cliente) {
		return  this.montoCuotaMensual() <= (cliente.getSueldoMensual() * this.porcentajeSueldoAceptacion());
	}
	
	protected Double montoCuotaMensual() {
		return monto/cuotas;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	protected int getCuotas() {
		return cuotas;
	}
	
	public Double getMonto() {
		return monto;
	}
}
