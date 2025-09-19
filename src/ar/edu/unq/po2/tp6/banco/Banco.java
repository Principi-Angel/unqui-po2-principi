package ar.edu.unq.po2.tp6.banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	private Set<Cliente> clientes = new HashSet<Cliente>();
	private Set<SolicitudDeCredito> solicitudesDeCredito = new HashSet<SolicitudDeCredito>();
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void registrarCredito(SolicitudDeCredito solicitud) {
		solicitudesDeCredito.add(solicitud);
		
	}
	
	public Double montoTotalCreditosAceptables() {
		Double total = 0d;
		for(SolicitudDeCredito solicitud : solicitudesDeCredito) {
			if(solicitud.esAceptada()) {
				total += solicitud.getMonto();
			}
		}
		return total;
	}
}
