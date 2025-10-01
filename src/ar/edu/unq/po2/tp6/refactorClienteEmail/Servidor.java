package ar.edu.unq.po2.tp6.refactorClienteEmail;


public interface Servidor {

	public void enviarCorreo(Correo correo);
	
	public float tazaDeTransferencia();

	public void resetear();
	
	public void realizarBackUp();
}
