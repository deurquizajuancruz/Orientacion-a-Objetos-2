package ejercicio1;

public class Tweet implements Publicacion{
	private String contenido;
	
	public Tweet (String contenido) {
		this.contenido = contenido;
	}
	
	public String getContenido() {
		if (this.contenido == null)
			return "Publicacion inexistente";
		return this.contenido;
	}
	
	public void eliminar() {
		this.contenido = null;
	}
}
