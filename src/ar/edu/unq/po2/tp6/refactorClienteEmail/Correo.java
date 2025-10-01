package ar.edu.unq.po2.tp6.refactorClienteEmail;

public class Correo {
	private String asunto;
	private ClienteEMail destinatario;
	private String cuerpo;

	public Correo(String asunto, ClienteEMail destinatario, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}
	
	public ClienteEMail getDestinatario() {
		return destinatario;
	}

}
