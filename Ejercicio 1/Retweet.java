package ejercicio1;

public class Retweet implements Publicacion{
	private Publicacion origen;
	
	public Retweet(Publicacion origen) {
		this.origen = origen;
	}

	public String getContenido() {
		return this.origen.getContenido();
	}
}
