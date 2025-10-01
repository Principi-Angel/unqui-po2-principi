package ar.edu.unq.po2.tp6.refactorClienteEmail;

public class ClienteEMail {
	private String nombre;
	private String pass;
	private Servidor servidor = new ServidorPop();
	private EMail email = new EMail();
	
	public ClienteEMail(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
	}
	
	public void recibirNuevo(Correo correo) {
		email.recibirNuevo(correo);
	}
	
	public void borrarCorreo(Correo correo) {
		email.borrarCorreo(correo);
	}
	
	public void eliminarBorrado(Correo correo) {
		email.eliminarBorrado(correo);
	}
	
	public void enviarCorreo(String asunto, ClienteEMail destinatario, String cuerpo) {
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		email.enviarCorreo(correo, this);
	}
	
	public int cantidadDeBorrados() {
		return email.cantidadDeBorrados();
	}
	
	public int cantidadEnInbox() {
		return email.cantidadEnInbox();
	}

	public Servidor getServidor() {
		return servidor;
	}
}
