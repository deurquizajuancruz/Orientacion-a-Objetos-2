package ejercicio1;

public class Tweet implements Publicacion{
	private String contenido;
	
	public Tweet (String contenido) {
		this.contenido = contenido;
	}
	
	public String getContenido() {
		return this.contenido;
	}

	public boolean esRetweet() {
		return false;
	}
}
