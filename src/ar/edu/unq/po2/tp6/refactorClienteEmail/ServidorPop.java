package ar.edu.unq.po2.tp6.refactorClienteEmail;

import ar.edu.unq.po2.tp6.refactorClienteEmail.Correo;

public class ServidorPop implements Servidor {

	@Override
	public void enviarCorreo(Correo correo) {
		correo.getDestinatario().recibirNuevo(correo);
	}

	@Override
	public float tazaDeTransferencia() {
		return 50;
	}

	@Override
	public void resetear() {
		
	}

	@Override
	public void realizarBackUp() {
		
	}
}
