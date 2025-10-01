package ar.edu.unq.po2.tp6.clienteEMailTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.refactorClienteEmail.ClienteEMail;
import ar.edu.unq.po2.tp6.refactorClienteEmail.Correo;

class CorreoTest {
	Correo correo;
	ClienteEMail destinatario;
	
	@BeforeEach
	void setUp() throws Exception {
		destinatario = new ClienteEMail("desti", "1234");
		correo = new Correo("asunto", destinatario, "hola");
	}

	@Test
	void test() {
		assertEquals(destinatario, correo.getDestinatario());
	}
}
