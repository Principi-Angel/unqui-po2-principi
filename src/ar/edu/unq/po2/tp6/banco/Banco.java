package ar.edu.unq.po2.tp6.banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	private Set<Cliente> clientes = new HashSet<Cliente>();
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void solicitarCredito(SolicitudDeCredito solicitud) {
		if(solicitud.esAceptada()) {
			this.otorgar(solicitud.getCliente(), solicitud.getMonto());
		}
	}
	
	protected void otorgar(Cliente cliente, Double monto) {
		cliente.recibir(monto);
	}
}
