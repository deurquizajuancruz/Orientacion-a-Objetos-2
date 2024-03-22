package ejercicio1;

public class Retweet implements Publicacion{
	private Publicacion origen;
	
	public Retweet(Publicacion origen) {
		this.origen = origen;
	}

	public String getContenido() {
		if (this.origen == null)
			return "Publicacion inexistente";
		return this.origen.getContenido();
	}
	
	public void eliminar() {
		this.origen= null;
	}
}
