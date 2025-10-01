package ar.edu.unq.po2.tp6.refactorClienteEmail;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class EMail {
	List<Correo> inbox = new LinkedList<Correo>();
	List<Correo> borrados = new LinkedList<Correo>();

	public void recibirNuevo(Correo correo) {
		inbox.add(correo);
	}

	public int cantidadEnInbox() {
		return inbox.size();
	}

	public int cantidadDeBorrados() {
		return borrados.size();
	}

	public void enviarCorreo(Correo correo, ClienteEMail cliente) {
		cliente.getServidor().enviarCorreo(correo);
	}

	public void eliminarBorrado(Correo correo) {
		borrados.remove(correo);		
	}

	public void borrarCorreo(Correo correo) {
		inbox.remove(correo);
		borrados.add(correo);		
	}
}
