package ejercicio9;

public class Usuario {
	private String nombre, apellido, mail;

	public Usuario(String nombre, String apellido, String mail) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
	}
	
	public String getMail() {
		return this.mail;
	}
}
