package ar.edu.unq.po2.tp6.clienteDeEmail;

import java.util.ArrayList;

public class ClienteEMail {
	
	 ServidorPop servidor;
	 String nombreUsuario;
	 String passusuario;
	 ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}

/*
 * VIOLACIONES PRINCIPIOS SOLID
 *  - clase ClienteEMail
 *  - no respeta el ppio de Responsabilidad Única ya que la clase cliente tiene lógica de negocio de la clase ServidorPop.
 *  - tiene variables de clase publicas, esto estría violando los principios ya que
 *  de esta manera se pueden acceder a estas con facilidad y poder cambiar cosas que tal vez no deberían ser cambiadas.
 *  - ppio O/C -> al definir la variable servidor como ServidorPop ya que esto complica la posible extensión del código,
 *  y si en el futuro se desease cambiar el tipo de servidor se debería acceder y modificar código.
 *  - lo mismo ocrrure con inbox y borrados que son del tipo ArrayList<Correo> cuando hubiese sido mejor que sean del tipo
 *  List ya que esto permitiría cambiar el tipo de lista.
 *  - el constructor invoca a un método, en todo caso el usuario que instancie la clase es quien debería poder enviarle mensajes.
 *  
 *  - interfaz ServidorI
 *  - tiene estructura
 *  
 * */
