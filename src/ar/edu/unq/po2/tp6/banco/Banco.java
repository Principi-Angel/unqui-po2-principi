package ar.edu.unq.po2.tp6.banco;

import java.util.HashSet;
import java.util.Set;

public class Banco {
	private Set<Cliente> clientes = new HashSet<Cliente>();
	
	public void agregarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void solicitarCredito(Cliente cliente, Double monto, int cuotas) {
		
	}
}
